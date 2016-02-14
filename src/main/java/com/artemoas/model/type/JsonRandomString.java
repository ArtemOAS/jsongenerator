// TODO : Package .model.** should be re-worked somehow
package com.artemoas.model.type;

import java.util.Random;

public class JsonRandomString extends AbstractField {
    // TODO : first private, second AbstractField.value should be reused

    public JsonRandomString(String name, String value) {
        super(name, value);
    }

    public JsonRandomString(String name) {
        super(name);
    }

    public JsonRandomString withRandomCharacteristics(GenerationRule generationRule){
        return new JsonRandomString(generationRule.generationRule());
    }

    // TODO : spell check, informational content, visibility, this method should mutate state or return value
    // TODO : add possibility to configure `random characteristics` from outside


    @Override
    public String print() {
        // TODO : behaviour is incorrect, calling several times to .print() will produce different results
        return String.format("\"%s\"", new GenerationRule(10,95,122).generationRule());
    }


}
