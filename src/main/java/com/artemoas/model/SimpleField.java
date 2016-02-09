package com.artemoas.model;

/**
 * Represents field with string value
 */
public class SimpleField {
    private final String name;
    private final String value;

    public static SimpleField of(String name, String value) {
        return new SimpleField(name, value);
    }

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
