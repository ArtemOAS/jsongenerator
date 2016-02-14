package com.artemoas.model.type;

/**
 * Chris on 2/10/16:11:53 PM.
 */
public abstract class AbstractField {
    protected String name;
    protected final String value;

    public AbstractField(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public AbstractField(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public abstract String print();

}
