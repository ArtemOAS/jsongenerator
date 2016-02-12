package com.artemoas;

import com.artemoas.model.type.AbstractField;
import com.artemoas.model.type.JsonObject;
import com.google.common.collect.Lists;

import java.util.Collection;

/**
 * Building a collection of fields in json
 *
 * Artem on 31.01.2016.
 */
public class JsonBuilder {
    private Collection<AbstractField> fields = Lists.newArrayList();

    public JsonBuilder with(AbstractField field) {
        this.fields.add(field);

        return this;
    }

    public JsonBuilder with(Collection<AbstractField> fields) {
        this.fields.addAll(fields);

        return this;
    }

    public String buildObject() {
        return new JsonObject(null, fields).print();
    }

}
