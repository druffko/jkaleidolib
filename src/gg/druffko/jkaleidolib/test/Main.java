package gg.druffko.jkaleidolib.test;

import gg.druffko.jkaleidolib.lib.BackgroundColor;
import gg.druffko.jkaleidolib.lib.TextColor;
import gg.druffko.jkaleidolib.lib.TextStyle;

public class Main {
    public static void main (String[]args){
        System.out.println("Default");
        System.out.println(TextColor.black + "Black" + TextColor.reset);
        System.out.println(TextColor.red + "Red" + TextColor.reset);
        System.out.println(TextColor.green + "Green" + TextColor.reset);
        System.out.println(TextColor.yellow + "Yellow" + TextColor.reset);
        System.out.println(TextColor.blue + "Blue" + TextColor.reset);
        System.out.println(TextColor.purple + "Purple" + TextColor.reset);
        System.out.println(TextColor.cyan + "Cyan" + TextColor.reset);
        System.out.println(TextColor.white + "White" + TextColor.reset);

        System.out.println(BackgroundColor.black + "Black" + TextColor.reset);
        System.out.println(BackgroundColor.red + "Red" + TextColor.reset);
        System.out.println(BackgroundColor.green + "Green" + TextColor.reset);
        System.out.println(BackgroundColor.yellow + "Yellow" + TextColor.reset);
        System.out.println(BackgroundColor.blue + "Blue" + TextColor.reset);
        System.out.println(BackgroundColor.purple + "Purple" + TextColor.reset);
        System.out.println(BackgroundColor.cyan + "Cyan" + TextColor.reset);
        System.out.println(BackgroundColor.white + "White" + TextColor.reset);
        System.out.println("Default");

        System.out.println(TextStyle.bold + "Bold Text" + TextStyle.reset);
        System.out.println(TextStyle.italic + "Italic Text" + TextColor.reset);
        System.out.println(TextStyle.dim + "Dim Text" + TextColor.reset);
        System.out.println(TextStyle.slowblink + "Slow Blinking text" + TextColor.reset);
        System.out.println(TextStyle.rapidblink + "Fast Blinking text" + TextColor.reset);
        System.out.println(TextStyle.reverse + "Reversed Text" + TextColor.reset);
        System.out.println(TextStyle.invisible + "Invisible Text" + TextColor.reset);
        System.out.println(TextStyle.underline + "Underlined Text" + TextColor.reset);
        System.out.println(TextStyle.thickunderline + "D-Underlined Text" + TextColor.reset);
        System.out.println(TextStyle.italicunderline + "C-Underlined Text" + TextColor.reset);
        System.out.println(TextStyle.strikethrough + "Crossed out Text" + TextColor.reset);
        System.out.println(TextStyle.overline + "Overlined Text" + TextColor.reset);
    }
}
