package com.gpacalculator.utils;

import java.util.Scanner;

public class GetInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getPositiveNumberInput(String getUserInput) {

        int inputValue;

        while (true) {
            System.out.print(getUserInput);

            String userValue = scanner.nextLine();

            if (!ValidateUserInput.isValidInteger(userValue)) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            inputValue = Integer.parseInt(userValue);

            if (inputValue > 0)
                break;
        }
        return inputValue;
    }

    public static String getCourseNameAndCode(String prompt) {
        String courseName;

        while (true) {
            System.out.print(prompt);
            courseName = scanner.nextLine();

            if (ValidateUserInput.isValidCourseNameAndCode(courseName)) {
                break;
            }

            System.out.println("Invalid course name and code. Please enter a valid one.");
        }
        return courseName;
    }

    public static int getCourseUnit(String prompt) {
        int courseUnit;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!ValidateUserInput.isValidInteger(inputValue)) {
                System.out.println("Invalid input, Please enter a valid course unit.");
                continue;
            }

            courseUnit = Integer.parseInt(inputValue);
            break;
        }

        return courseUnit;
    }

    public static int getCourseScore(String prompt) {
        int courseScore;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!ValidateUserInput.isValidInteger(inputValue)) {
                System.out.println("Invalid input. Please enter a valid course score.");
                continue;
            }

            courseScore = Integer.parseInt(inputValue);

            if (!ValidateUserInput.isValidCourseScore(courseScore)) {
                System.out.printf("Course Score Should be between %d and %d\n", 0, 100);
                continue;
            }

            break;
        }

        return courseScore;
    }

}
