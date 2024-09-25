package gg.druffko.jkaleidolib.test;

import gg.druffko.jkaleidolib.lib.BackgroundColor;
import gg.druffko.jkaleidolib.lib.TextColor;

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
    }
}
