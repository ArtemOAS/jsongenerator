package com.artemoas.model.type.utills;

import java.util.Random;

public class StringGenerationRule {
    private static int targetStringLength;
    private static int leftLimit;
    private static int rightLimit;

    public StringGenerationRule(int targetStringLength, int leftLimit, int rightLimit){
        this.targetStringLength = targetStringLength;
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    public String generateRandomString(){
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)(new Random().nextFloat() * (rightLimit - leftLimit));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}
