package com.regexp;

/**
 * @author Dmitry Spikhalskiy
 * @since 29.08.12
 */
class Character implements RegExpBuilder {
    private char cchar;

    protected Character(char cchar) {
        this.cchar = cchar;
    }

    @Override
    public String build() {
        return RegExpUtils.escape(cchar);
    }
}
