package org.chuzhinov.enums;

public enum COMPANYSIZE {

    SMALL("маленькая"),//<50
    MEDIUM("средняя"),//51-150
    BIG("большая"),//151-500
    VERYBIG("очень большая");//>500

    private final String text;

    COMPANYSIZE(final String text) {
        this.text = text;
    }

    public String displayText() {
        return text;
    }
}
