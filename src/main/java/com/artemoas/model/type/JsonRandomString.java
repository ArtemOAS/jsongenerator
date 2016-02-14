// TODO : Package .model.** should be re-worked somehow
package com.artemoas.model.type;

import java.util.Random;

public class JsonRandomString extends AbstractField {
    // TODO : first private, second AbstractField.value should be reused
    public String randomString;

    public JsonRandomString(String name, String value) {
        super(name, value);
    }

    // TODO : spell check, informational content, visibility, this method should mutate state or return value
    // TODO : add possibility to configure `random characteristics` from outside
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
        // TODO : behaviour is incorrect, calling several times to .print() will produce different results
        return String.format("\"%s\"", generateRandomString(5, 97, 122));
    }
}
