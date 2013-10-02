package com.regexp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Spikhalskiy
 * @since 29.08.12
 */
public abstract class RegexpBuilderMethods {
    public static RegExpBuilder of(char cchar) {
        return new Character(cchar);
    }

    public static List<RegExpBuilder> of(char[] chars) {
        List<RegExpBuilder> result = new ArrayList<RegExpBuilder>();
        for (java.lang.Character cchar : chars) {
            result.add(of(cchar));
        }
        return result;
    }

    public static List<RegExpBuilder> of(Iterable<java.lang.Character> chars) {
        List<RegExpBuilder> result = new ArrayList<RegExpBuilder>();
        for (java.lang.Character cchar : chars) {
            result.add(of(cchar));
        }
        return result;
    }

    public static RegExpBuilder anyOf(List<RegExpBuilder> regExps) {
        return new AnyOf(regExps);
    }

    public static RegExpBuilder noMoreThan(RegExpBuilder regexp, int times) {
        return new NoMore(regexp, times);
    }
}
