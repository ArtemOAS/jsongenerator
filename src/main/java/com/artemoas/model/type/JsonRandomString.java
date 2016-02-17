// TODO : Package .model.** should be re-worked somehow
package com.artemoas.model.type;

import java.util.Random;

public class JsonRandomString extends AbstractField {

    public JsonRandomString(String name, String value) {
        super(name, value);
    }

    public JsonRandomString withRandomCharacteristics(GenerationRule generationRule){
        return new JsonRandomString(name, generationRule.generationRule());
    }

    @Override
    public String print() {
        return String.format("\"%s\"", value);
    }


}
