package gr.codehub;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // dhmiourgia antikeimenou

        //pinakas deka atomwn
        //HeartRates[] people = new HeartRates[10];
        //HeartRates person = new HeartRates("dina", "gavrilaki", 17, 06, 1996);
        //people[0] = person;
        //System.out.println(people[0]);

        //String input = System.console().readLine();
//        try {
//            person.setMonth(12);
//        } catch (WrongMonthException e) {
//            e.printStackTrace();
//        }

        System.out.println("Write your Name and your BirthDate :");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        try {
            String[] parts = input.split(" ");
            String part1 = parts[0];
            String part2 = parts[1];
            String partDate = parts[2];
            String[] partsDate = partDate.split("/");
            String part3 = partsDate[0];
            String part4 = partsDate[1];
            String part5 = partsDate[2];
            HeartRates result = new HeartRates(part1, part2, Integer.parseInt(part3), Integer.parseInt(part4), Integer.parseInt(part5));

            int age = result.CalculateAge();
            System.out.println("Your name is :" +result.getFirstname() + " " + result.getLastname() + " " + age);
            int maxHeartRate = result.CalculateMaxHeartRate(age);
            System.out.println("Your MaxHeartRate is : " +maxHeartRate);
            String targetHeartRate = result.CalculateTargetHeartRate(maxHeartRate);
            System.out.println("Your target is : " + targetHeartRate);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong when entering data.");
        }

    }
}