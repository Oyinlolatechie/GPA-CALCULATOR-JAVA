package com.gpacalculator.main;

import com.gpacalculator.models.Course;
import com.gpacalculator.services.GpaCalculationService;
import com.gpacalculator.utils.GetInput;

public class GpaCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to oyinlolaTechie' GPA Calculator");

        int numberOfCourses = GetInput.getPositiveNumberInput("Enter the number of Courses: ");

        Course[] courses = new Course[numberOfCourses]; // array storage to take

        for (int i = 0; i < numberOfCourses; i++) {
            Course course = getCourseDetails(i);
            // Add the course to the array
            courses[i] = course;
        }

        outputCourseDetails(courses);

        double gpa = GpaCalculationService.calculateGPA(courses);
        System.out.printf("\nYour GPA is: %.2f\n", gpa);

    }

    private static Course getCourseDetails(int index) {

        // int count = index + 1;
        System.out.println("Enter course details for coourser " + (index + 1) + ":");

        String courseNameAndCode = GetInput.getCourseNameAndCode("Course Name And Code: ");
        double courseScore = GetInput.getCourseScore("Score: ");
        int courseUnit = GetInput.getCourseUnit("Units: ");

        return new Course(courseNameAndCode, courseScore, courseUnit);
    }

    private static void outputCourseDetails(Course[] courses) {
        System.out.println("\nCourse details and grades:\n");

        System.out.println("|----------------------------|-----------------------|------------|---------------------|");
        System.out.println("| COURSE & CODE              | COURSE UNIT           | GRADE      | GRADE-UNIT          |");
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");

        for (Course course : courses) {
            String grade = GpaCalculationService.convertToLetterGrade(course.getCourseScore());
            int gradePoint = GpaCalculationService.convertToNumericGrade(course.getCourseScore());

            System.out.format("| %-27s| %-21s | %-10s | %-19s |\n",
                    course.getCourseNameAndCode(), course.getCourseUnit(), grade, gradePoint);
        }
        System.out.println("|---------------------------------------------------------------------------------------|");
    }

}