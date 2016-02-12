package com.artemoas.model.type;

/**
 * Chris on 2/10/16:11:54 PM.
 */
public class JsonNumber extends AbstractField {
    public JsonNumber(String name, String value) {
        super(name, value);
    }

    @Override
    public String print() {
        return String.format("%s", value);
    }
}
