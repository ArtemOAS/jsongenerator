package com.artemoas;

/**
 *Building a collection of fields in json
 */

import com.artemoas.model.PrintableField;
import com.artemoas.model.SimpleField;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Artem on 31.01.2016.
 */
public class JsonBuilder {
    private Collection<SimpleField> fields = new ArrayList<>();
    private Collection<PrintableField> printableFields = new ArrayList<>();

    public JsonBuilder with(SimpleField field) {
        this.fields.add(field);

        return this;
    }

    public JsonBuilder with(Collection<SimpleField> fields) {
        this.fields.addAll(fields);

        return this;
    }

    public JsonBuilder withPrintable(PrintableField field) {
        this.printableFields.add(field);

        return this;
    }

    public String build() {
        StringBuilder stringBuilder = new StringBuilder();

        for (SimpleField field : fields) {
            stringBuilder.append(",").append(String.format("\"%s\":\"%s\"", field.getName(), field.getValue()));
        }

        for (PrintableField field : printableFields) {
            stringBuilder.append(",").append(field.print());
        }

        stringBuilder.replace(0, 1, "{"); // remove first comma and replace by curly bracer

        stringBuilder.append("}"); // close "object"

        return stringBuilder.toString();
    }

}
