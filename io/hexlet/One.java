package io.hexlet;

import org.apache.commons.lang3.StringUtils;

public class One {
    public static void main(String[] args) {
        //Two.greeting();
        String reverseWord = StringUtils.reverse("Hexlet");
        System.out.println(reverseWord);
    }
}