package com.example.michaelcapawana.fitness;

/**
 * Returns the data necessary for the BMI Graph: bmi, day, month, and year.
 * @author Grey Winert
 * @author Preston Gagnon
 * @author Michael Capawana
 * @version 1.0
 * @since 1.0
 *
 */

public class BMI_Date_Data {
    long bmi = 0;
    int year = 0;
    int month = 0;
    int day = 0;


    public BMI_Date_Data() {
    }

    public BMI_Date_Data(long bmi, int year, int month, int day) {
        this.bmi = bmi;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public long getBmi() {
        return bmi;
    }

    public void setBmi(long bmi) {
        this.bmi = bmi;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String display() {
        return "BMI: " + bmi + "DAY: " + day + "MONTH: " + month + "YEAR: " + year;
    }

}
