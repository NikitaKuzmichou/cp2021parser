package logic;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import containers.ParsedElement;
import containers.ParsedLink;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.io.FileUtils;
import utils.FilesUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ParsedElementsSaver {

    public static final String ELEMENTS_MAIN_DIRECTORY = "cyberpunk_2021_parsed_weapons";

    public static void saveSavedElements(final String directoryToSave, final List<ParsedLink> parsedLinks) {
        final String cyberpunkDir = FilesUtils.makeDir(directoryToSave, "cyberpunk_2021_parsed_weapons");

        parsedLinks.forEach(link -> {
            try {
                saveParsedElement(cyberpunkDir, link);
            } catch (final IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Cannot write parsed data", e);
            }
        });
    }

    private static void saveParsedElement(final String path, final ParsedLink parsedLink) throws IOException {
        final String elementDir = FilesUtils.makeDir(path, makeElementDirPath(parsedLink.getLinkName()));
        writeWeaponsInfoIntoFile(elementDir, parsedLink.getParsedElements());

        for (final ParsedElement element : parsedLink.getParsedElements()) {
            final URL url = new URL("http://irc.liber-mundi.org/" + element.getImageName());
            FileUtils.copyURLToFile(url, new File(elementDir + makeImageName(element.getImageName())));
        }
    }

    private static String makeElementDirPath(final String elementDir) {
        return elementDir.toLowerCase().replace(" ", "_");
    }

    private static void writeWeaponsInfoIntoFile(final String path, final List<ParsedElement> elements)
            throws IOException {

        final Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .create();

        FilesUtils.writeToFile(path + "weapons_description.json", gson.toJson(elements).replace("\\u0026", "&"));
    }

    private static String makeImageName(final String imageName) {
        final int extensionInd = imageName.lastIndexOf(".");
        return imageName.substring(imageName.lastIndexOf("/"), extensionInd) + imageName.substring(extensionInd);
    }
}
