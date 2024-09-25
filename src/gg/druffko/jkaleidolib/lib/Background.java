package gg.druffko.jkaleidolib.lib;

public class Background {

    private static final String reset = TextColor.reset;

    public static String black(String string) {
        return TextColor.black + string + reset;
    }

    public static String red(String string) {
        return TextColor.red + string + reset;
    }

    public static String green(String string) {
        return TextColor.green + string + reset;
    }

    public static String yellow(String string) {
        return TextColor.yellow + string + reset;
    }

    public static String blue(String string) {
        return TextColor.blue + string + reset;
    }

    public static String purple(String string) {
        return TextColor.purple + string + reset;
    }

    public static String cyan(String string) {
        return TextColor.cyan + string + reset;
    }

    public static String white(String string) {
        return TextColor.white + string + reset;
    }

}
