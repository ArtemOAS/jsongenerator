package com.artemoas;

// TODO : add javadoc
public class SimpleField {
    private final String name;
    private final String value;

    // Add static method : SimpleField.of("asd","asd");

    public SimpleField(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
