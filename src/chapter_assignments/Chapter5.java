package src.chapter_assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import src.utilities.InputUtility;
import src.utilities.TaskHandler;
import src.utilities.UIUtility;

public class Chapter5 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 5 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    exercise1(in);
                    break;
                case 2:
                    exercise2(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 5 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");

        ArrayList<Integer> even = new ArrayList<>();

        ArrayList<Integer> odd = new ArrayList<>();

        boolean c = true;

        while (c) {
            String userinput = InputUtility.getString("Please enter a number type S to stop ", in);

            if (userinput.equals("s") || userinput.equals("S")) {
                c = false;
                break;
            } else {
                int num = Integer.parseInt(userinput);
                if (num % 2 == 0) {
                    even.add(num);
                } else {
                    odd.add(num);
                }
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        System.out.println(even);
        System.out.println(odd);
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");

        String first_word = InputUtility.getString("Please enter a string", in);
        String lower_first = first_word.toLowerCase();
        char[] firstArray = new char[lower_first.length()];
        char[] reverseFirst = new char[lower_first.length()];

        for (int i = 0; i < lower_first.length(); i++) {
            firstArray[i] = lower_first.charAt(i);
        }

        boolean containsI = false;

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == 'i') {
                containsI = true;
            }
        }
        int count = 0;
        for (int i = firstArray.length - 1; i >= 0; i--) {
            reverseFirst[count] = firstArray[i];
            count++;
        }

        boolean palindrome = false;
        if (Arrays.equals(firstArray, reverseFirst)) {
            palindrome = true;
        }

        System.out.println("Length: " + firstArray.length);
        System.out.println("First 3 characters: " + firstArray[0] + firstArray[1] + firstArray[2]);
        System.out.println("Last character is: " + firstArray[firstArray.length - 1]);
        System.out.println("Contains the letter i: " + containsI);
        System.out.println("Lowercase: " + lower_first);
        System.out.println("Is palindrome: " + palindrome);
        System.out.println(reverseFirst);
    }

}