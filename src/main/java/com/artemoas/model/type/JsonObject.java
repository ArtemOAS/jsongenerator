package com.artemoas.model.type;

import com.google.common.collect.Lists;

import java.util.Collection;

/**
 * Chris on 2/11/16:12:06 AM.
 */
public class JsonObject extends AbstractComplexField {
    private Collection<? extends AbstractField> properties;

    public JsonObject(String name) {
        super(name);
        properties = Lists.newArrayList();
    }

    public JsonObject(String name, Collection<? extends AbstractField> properties) {
        super(name);
        this.properties = properties;
    }

    @Override
    public String print() {
        StringBuilder stringBuilder = new StringBuilder();

        for (AbstractField field : properties) {
            stringBuilder.append(",\"").append(field.getName()).append("\":").append(field.print());
        }

        stringBuilder.replace(0, 1, "{"); // replace first comma by bracer

        stringBuilder.append("}"); // close "object"

        return stringBuilder.toString();
    }
}
