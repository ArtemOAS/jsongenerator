package com.artemoas;

/**
 *Building a collection of fields in json
 */

import java.util.ArrayList;
import java.util.Collection;

/**
 * Artem on 31.01.2016.
 */
public class JsonBuilder {
    private Collection<SimpleField> fields = new ArrayList<>();

    public JsonBuilder with(SimpleField field) {
        this.fields.add(field);

        return this;
    }

    public JsonBuilder with(Collection<SimpleField> fields) {
        this.fields.addAll(fields);

        return this;
    }

    public String build() {
        StringBuilder stringBuilder = new StringBuilder();

        for (SimpleField field : fields) {
            stringBuilder.append(",").append(String.format("\"%s\":\"%s\"", field.getName(), field.getValue()));
        }

        stringBuilder.replace(0, 1, "{"); // remove first comma and replace by curly bracer

        stringBuilder.append("}"); // close "object"

        return stringBuilder.toString();
    }

}
