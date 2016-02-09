package com.artemoas;

/**
 * Represents field with string value
 */
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

    public static SimpleField of(String name, String value){
        return new SimpleField(name, value);
    }
}
