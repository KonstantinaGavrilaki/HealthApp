package gr.codehub;

import java.util.Date;

public class HeartRates {
    private String firstname;
    private String lastname;
    private int day;
    private int month;
    private int year;


    public HeartRates(String firstname, String lastname, int day, int month, int year) throws WrongMonthException{
        this.firstname = firstname;
        this.lastname = lastname;
        if (day>0 && day<=31) {
            this.day = day;
        }
        else {
            this.day = -99999;
        }
        if(month>0 && month <=12) {
            this.month = month;
        }
        else {
            throw new WrongMonthException("Wrong Month or Day" + month );
        }
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
        if ((day>0) && (day<31)) {
            this.day = day;
        }
        else {
            this.day = -99999;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws WrongMonthException {

        if(month>0 && month<12) {
            this.month = month;
        }
        else {
            throw new WrongMonthException("Wrong Month" + month );
        }


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

    public int CalculateMaxHeartRate(int age) {
        return 220 - age;
    }
    public String CalculateTargetHeartRate(int maxHeartRate) {
        double firstRate = maxHeartRate * (50.0/100);
        double secondRate = maxHeartRate * (85.0/100);
        return firstRate + " - " +secondRate;
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
