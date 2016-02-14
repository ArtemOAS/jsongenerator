package com.artemoas.model.type;

import java.util.Random;

public class JsonRandomString extends AbstractField {
    public String randomString;

    public JsonRandomString(String name, String value){
        super(name, value);
    }

    /**
     * generator random text
     * @param targetStringLength - length string
     * @param leftLimit - letter 'a'
     * @param rightLimit - letter 'z'
     * @return - generated string
     */
    public String generateRandomString(int targetStringLength, int leftLimit, int rightLimit){
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)(new Random().nextFloat() * (rightLimit - leftLimit));
            buffer.append((char) randomLimitedInt);
            }
        return this.randomString = buffer.toString();
    }

    @Override
    public String print() {
        return String.format("\"%s\"", generateRandomString(5, 97, 122));
    }
}
