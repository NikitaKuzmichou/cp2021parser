package application;

import logic.ParseDaemon;

public final class Parser {

    public static void main(final String[] args) {
        final ParseDaemon daemon = new ParseDaemon();

        try {
            daemon.parseAndSave("G:\\my_programms\\java\\cp2021\\cp2021parser");
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
