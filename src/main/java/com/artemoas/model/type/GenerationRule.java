package com.artemoas.model.type;

import java.util.Random;

public class GenerationRule{
    int targetStringLength;
    int leftLimit;
    int rightLimit;

    public GenerationRule(int targetStringLength, int leftLimit, int rightLimit){
        this.targetStringLength = targetStringLength;
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    public String generationRule(){
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)(new Random().nextFloat() * (rightLimit - leftLimit));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}
