package com.regexp;

/**
 * @author Dmitry Spikhalskiy
 * @since 29.08.12
 */
abstract class RegExpUtils {
    public static String escape(char cchar) {
        switch (cchar) {
            case '\\' : return "\\\\";
            case '['  : return "\\[";
            case ']'  : return "\\]";
            case '.'  : return "\\.";
            default   : return java.lang.Character.toString(cchar);
        }
    }

}
