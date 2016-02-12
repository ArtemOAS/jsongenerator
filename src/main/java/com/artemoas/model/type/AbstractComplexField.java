package com.artemoas.model.type;

/**
 * Chris on 2/10/16:11:56 PM.
 */
public abstract class AbstractComplexField extends AbstractField {
    public AbstractComplexField(String name) {
        super(name, null);
    }

    @Override
    public String getValue() {
        return this.print();
    }
}
