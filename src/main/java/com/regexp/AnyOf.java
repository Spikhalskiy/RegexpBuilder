package com.regexp;

/**
 * @author Dmitry Spikhalskiy
 * @since 29.08.12
 */
class AnyOf implements RegExpBuilder {
    private Iterable<RegExpBuilder> regExps;

    protected AnyOf(Iterable<RegExpBuilder> regExps) {
        this.regExps = regExps;
    }

    @Override
    public String build() {
        StringBuilder resultStringBuilder = new StringBuilder();
        resultStringBuilder.append('[');

        for (RegExpBuilder regExp : regExps) {
            resultStringBuilder.append(regExp.build());
        }

        resultStringBuilder.append(']');

        return resultStringBuilder.toString();
    }
}
