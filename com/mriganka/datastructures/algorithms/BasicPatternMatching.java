package com.mriganka.datastructures.algorithms;

/**
 * Basic Pattern Matching
 */
public class BasicPatternMatching {
    private String text;

    public BasicPatternMatching(String text) {
        this.text = text;
    }

    public int contains(String pattern) {
        int textLength = text.length(),
            patternLength = pattern.length();

        for (int i = 0; i < (textLength - patternLength); i++) {
            int j = 0;

            while (j < patternLength && text.charAt(i+j) == pattern.charAt(j))
                j++;

            if (j == patternLength)
                return i;
        }

        return -1;
    }
}
