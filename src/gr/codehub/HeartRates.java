package gr.codehub;

import java.util.Date;

public class HeartRates {
    private String firstname;
    private String lastname;
    private int day;
    private int month;
    private int year;


    public HeartRates(String firstname, String lastname, int day, int month, int year) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day>0) {
            this.day = day;
        }
        else {
            this.day = -99999;
        }
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

    public int CalculateAge() {
        int age = 2021 - this.year;

        return age;
    }

    public static String CalculateMaxHeartRate() {

        return null;
    }
    public static String CalculateTargetHeartRate() {

        return null;
    }

    @Override
    public String toString() {
        return "HeartRates{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
