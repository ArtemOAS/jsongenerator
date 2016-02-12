package com.artemoas.model.type;

/**
 * Chris on 2/10/16:11:52 PM.
 */
public class JsonString extends AbstractField {
    public JsonString(String name, String value) {
        super(name, value);
    }

    @Override
    public String print() {
        return String.format("\"%s\"", value);
    }
}
