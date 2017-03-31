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
    /**
     * returns the user BMI
     * @return returns the bmi
     */
    public long getBmi() {
        return bmi;
    }

    /**
     * sets the users BMI
     * @param bmi, it's a bmi variable passed to set the current BMI
     * no returns
     */
    public void setBmi(long bmi) {
        this.bmi = bmi;
    }
    /**
     * returns the current month
     * @return returns the month
     */
    public int getMonth() {
        return month;
    }
    /**
     * sets the users Month
     * @param month, it's a sets the month.
     * no returns
     */
    public void setMonth(int month) {
        this.month = month;
    }
    /**
     * returns the year
     * @return returns the year
     */
    public int getYear() {
        return year;
    }
    /**
     * sets the users year
     * @param month, it's a sets the year.
     * no returns
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * returns the current day
     * @return returns the day
     */
    public int getDay() {
        return day;
    }
    /**
     * sets the users Day
     * @param month, it's a sets the day
     * no returns
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Stringifies the day
     * return a string of the date
     */
    public String display() {
        return "BMI: " + bmi + "DAY: " + day + "MONTH: " + month + "YEAR: " + year;
    }

}
