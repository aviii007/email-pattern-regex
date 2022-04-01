package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program on User Registration Using Regex
 *
 * @author : Ashvini Kanojia
 * @since : 01/04/2022
 * */

public class TestEmailIds {
    static String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
            "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

    static String[] nonValidEmails = {"abc", "abc@.com.my","abc123@gmail.a", "abc123@.com",
            "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
            "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};


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

    public static void testForNonValidEmails() {
        System.out.println("Non Valid Emails");
        System.out.println("");
        for (int i = 0; i < nonValidEmails.length; i++) {
            String regex = "^[a-zA-Z-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(nonValidEmails[i]);
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Email pattern problem");
        TestEmailIds.testForValidEmails();
        TestEmailIds.testForNonValidEmails();
    }
}
