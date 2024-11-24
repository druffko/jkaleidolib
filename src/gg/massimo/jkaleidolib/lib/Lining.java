package gg.massimo.jkaleidolib.lib;

public class Lining {

    private static final String reset = TextStyle.reset;

    public static String underline(String liningString) {
        return TextStyle.underline + liningString + reset;
    }

    public static String thickunderline(String liningString) {
        return TextStyle.thickunderline + liningString + reset;
    }

    public static String italicunderline(String liningString) {
        return TextStyle.italicunderline + liningString + reset;
    }

    public static String strikethrough(String liningString) {
        return TextStyle.strikethrough + liningString + reset;
    }

    public static String overline(String liningString) {
        return TextStyle.overline + liningString + reset;
    }
}
