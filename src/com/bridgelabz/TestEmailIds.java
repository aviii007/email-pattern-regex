package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEmailIds {
    static String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
            "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

    public static void testForValidEmails() {
        System.out.println("Valid Emails");
        System.out.println("");
        for (int i = 0; i < validEmails.length; i++) {
            String regex = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(validEmails[i]);
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Email pattern problem");
        TestEmailIds.testForValidEmails();
    }
}
