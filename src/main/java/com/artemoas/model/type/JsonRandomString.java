// TODO : Package .model.** should be re-worked somehow
package com.artemoas.model.type;

import com.artemoas.model.type.utills.StringGenerationRule;

public class JsonRandomString extends AbstractField {

    public JsonRandomString(String name, String value) {
        super(name, value);
    }

    public JsonRandomString withRandomCharacteristics(StringGenerationRule stringGenerationRule){
        return new JsonRandomString(name, stringGenerationRule.generateRandomString());
    }

    @Override
    public String print() {
        return String.format("\"%s\"", getValue());
    }


}
