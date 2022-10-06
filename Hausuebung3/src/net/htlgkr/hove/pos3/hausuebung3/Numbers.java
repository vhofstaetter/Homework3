package net.htlgkr.hove.pos3.hausuebung3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Numbers {
    public int[] randomNumbersArray = new int[10000];
    public String[] randomStringsArray = new String[10000];

    public void implementArray() {
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = (int) Math.random() * (100 - 0 + 1) + 0;
        }
    }

    public double average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public String[] randomString() {
        for (int i = 0; i < randomStringsArray.length; i++) {
            int leftLimit = 97;
            int rightLimit = 122;
            int targetStringLength = 10;
            Random random = new Random();
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int j = 0; j < targetStringLength; j++) {
                int randomLimitedInt = leftLimit + (int)
                        (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            String generatedString = buffer.toString();
            randomStringsArray[i] = generatedString;
        }
        return randomStringsArray;
    }

    public List<String> upperCase(String[] strings) {
        List<String> upperCaseStrings = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
           upperCaseStrings.add(strings[i].toUpperCase());
        }
        return upperCaseStrings;
    }
}
