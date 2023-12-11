package com.gpacalculator.models;

public class Course {
    private String courseNameAndCode;
    private double courseScore;
    private int courseUnit;

    public Course(String courseName, double courseScore, int courseUnit) {
        this.courseNameAndCode = courseName;
        this.courseScore = courseScore;
        this.courseUnit = courseUnit;
    }

    public void setCourseName(String courseName) {
        this.courseNameAndCode = courseName;
    }

    public String getCourseNameAndCode() {
        return courseNameAndCode;
    }

    public void setCourseScore(double courseScore) {
        this.courseScore = courseScore;
    }

    public double getCourseScore() {
        return courseScore;
    }

    public void setCourseUnit(int courseUnit) {
        this.courseUnit = courseUnit;
    }

    public int getCourseUnit() {
        return courseUnit;
    }

}
