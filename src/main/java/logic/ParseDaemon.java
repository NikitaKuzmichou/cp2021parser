package logic;

import containers.ParsedLink;
import storage.LinksStorage;

import java.util.List;
import java.util.stream.Collectors;

public class ParseDaemon {
    private LinksStorage linksStorage;

    public ParseDaemon() {
        this.linksStorage = new LinksStorage();
    }

    public void parseAndSave(final String pathToSave) {
        final List<ParsedLink> parsedLinks = this.linksStorage.getLinks().stream()
                .map(link -> new ParsedLink()
                        .setLinkName(link.getName())
                        .setParsedElements(
                                Cp2021Parser.parseByUrl(link.getLink())))
                .collect(Collectors.toList());

        ParsedElementsSaver.saveSavedElements(pathToSave, parsedLinks);
    }
}
