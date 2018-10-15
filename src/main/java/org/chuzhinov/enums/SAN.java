package org.chuzhinov.enums;

public enum SAN {
    DAS("подключение хранилища(сервер)"),
    NAS("хранилище, подключенное по сети (облачное хранилище)");

    private final String text;

    SAN(final String text) {
        this.text = text;
    }

    public String displayText() {
        return text;
    }
}
