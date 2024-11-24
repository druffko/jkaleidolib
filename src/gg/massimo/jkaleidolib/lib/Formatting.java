package gg.massimo.jkaleidolib.lib;

public class Formatting {

    private static final String reset = TextStyle.reset;

    public static String bold(String formatString) {
        return TextStyle.bold + formatString + reset;
    }

    public static String italic(String formatString) {
        return TextStyle.italic + formatString + reset;
    }

    public static  String dim(String formatString) {
        return TextStyle.dim + formatString + reset;
    }

    public static String slowblink(String formatString) {
        return TextStyle.slowblink + formatString + reset;
    }

    public static String rapidblink(String formatString) {
        return TextStyle.rapidblink + formatString + reset;
    }

    public static String reverse(String formatString) {
        return TextStyle.reverse + formatString + reset;
    }

    public static String invisible(String formatString) {
        return TextStyle.invisible + formatString + reset;
    }

    public static String framed(String formatString) { return TextStyle.framed + formatString + reset;}

}
