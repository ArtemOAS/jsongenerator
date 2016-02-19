package com.artemoas.model.type.utills;

/**
 * Created by Artem on 18.02.2016.
 */
public class TakeObject {

    public static StringGenerationRule newInstance() {
        return new StringGenerationRule(10, 95, 122);
    }

}
