package gg.druffko.jkaleidolib.lib;

public class Color {

    private static final String reset = TextColor.reset;

    public static String black(String colorString) {
        return TextColor.black + colorString + reset;
    }

    public static String red(String colorString) {
        return TextColor.red + colorString + reset;
    }

    public static String green(String colorString) {
        return TextColor.green + colorString + reset;
    }

    public static String yellow(String colorString) {
        return TextColor.yellow + colorString + reset;
    }

    public static String blue(String colorString) {
        return TextColor.blue + colorString + reset;
    }

    public static String purple(String colorString) {
        return TextColor.purple + colorString + reset;
    }

    public static String cyan(String colorString) {
        return TextColor.cyan + colorString + reset;
    }

    public static String white(String colorString) {
        return TextColor.white + colorString + reset;
    }
}
