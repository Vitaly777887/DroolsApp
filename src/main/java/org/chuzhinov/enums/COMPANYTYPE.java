package org.chuzhinov.enums;

public enum COMPANYTYPE {
    software_development("разработка программного обеспечения"),
    sale_of_equipment("продажа оборудования"),
    provision_of_services("предоставление услуг"),
    public_catering_network("сеть общественного питания");

    private final String text;

    COMPANYTYPE(final String text) {
        this.text = text;
    }

    public String displayText() {
        return text;
    }
}