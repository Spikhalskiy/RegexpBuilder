package com.regexp;

/**
 * @author Dmitry Spikhalskiy
 * @since 29.08.12
 */
class NoMore implements RegExpBuilder {

    private RegExpBuilder regExp;
    private int times;

    protected NoMore(RegExpBuilder regExp, int times) {
        this.regExp = regExp;
        this.times = times;
    }

    @Override
    public String build() {
        return regExp + "{," + times + '}';
    }
}
