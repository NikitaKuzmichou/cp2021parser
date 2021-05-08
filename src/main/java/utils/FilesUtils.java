package utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FilesUtils {

    public static void writeToFile(final String path, final String data) throws IOException {
        final FileOutputStream fos = new FileOutputStream(path);
        final DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(fos));
        outStream.write(data.getBytes());
        outStream.close();
    }

    public static String makeDir(final String path, final String dirName) {
        final File file = new File(path + "\\" + dirName);

        if (!file.mkdir()) {
            throw new RuntimeException("Couldn't create directory " + dirName);
        } else {
            return file.getAbsolutePath() + "\\";
        }
    }
}
