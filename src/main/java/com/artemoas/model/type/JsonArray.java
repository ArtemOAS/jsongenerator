package com.artemoas.model.type;

import com.google.common.collect.Lists;

import java.util.Collection;

/**
 * Chris on 2/10/16:11:57 PM.
 */
public class JsonArray extends AbstractComplexField {
    private Collection<? extends AbstractField> elements;

    public JsonArray(String name) {
        super(name);
        elements = Lists.newArrayList();
    }

    public JsonArray(String name, Collection<? extends AbstractField> elements) {
        super(name);
        this.elements = elements;
    }

    @Override
    public String print() {
        StringBuilder stringBuilder = new StringBuilder();

        for (AbstractField field : elements) {
            stringBuilder.append(",").append(field.print());
        }

        stringBuilder.replace(0, 1, "["); // replace first comma by bracer

        stringBuilder.append("]"); // close "array"

        return stringBuilder.toString();
    }
}
