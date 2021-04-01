package gr.codehub;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // dhmiourgia antikeimenou


        //String input = System.console().readLine();
        System.out.println("Write your Name and your BirthDate :");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] parts = input.split(" ");
        String part1 = parts[0];
        String part2 = parts[1];
        String partDate = parts[2];
        String[] partsDate = partDate.split("/");
        String part3 = partsDate[0];
        String part4 = partsDate[1];
        String part5 = partsDate[2];
        HeartRates result = new HeartRates(part1, part2, Integer.parseInt(part3), Integer.parseInt(part4), Integer.parseInt(part5));

        System.out.println("Your name is :" +result.getFirstname() + " " + result.getLastname() + " " + result.CalculateAge());

    }
}