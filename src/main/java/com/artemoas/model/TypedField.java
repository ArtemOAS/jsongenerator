package com.artemoas.model;

import org.junit.Assert;

/**
 * Chris on 2/9/16:11:05 PM.
 */
public class TypedField extends SimpleField implements PrintableField {
    private final FieldType fieldType;
    private final TypedField compoundValue;

    public TypedField(String name, String value, FieldType fieldType) {
        super(name, value);

        Assert.assertNotNull("Field type should be specified", fieldType);
        this.fieldType = fieldType;
        this.compoundValue = null;
    }

    public TypedField(String name, TypedField compoundValue, FieldType fieldType) {
        super(name, null);

        Assert.assertNotNull("Field type should be specified", fieldType);
        this.fieldType = fieldType;
        this.compoundValue = compoundValue;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public TypedField getCompoundValue() {
        return compoundValue;
    }

    @Override
    public String print() {
        String value;

        switch (fieldType) {
            case NUMBER:
                value = this.getValue();
                break;
            case STRING:
                value = String.format("\"%s\"", this.getValue());
                break;
            default:
                throw new UnsupportedOperationException(String.format("Field type %s does not supported", fieldType));
        }

        return String.format("\"%s\":%s", this.getName(), value);
    }
}
