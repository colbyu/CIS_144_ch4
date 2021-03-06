/** 4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
data from the user. **/
package ch4ex17;
import java.util.Scanner;
/**
 *
 * @author colby
 */
public class Ch4Ex17 
    {
    public static void main(String[] args) 
        {
        int trip = 1;
        double miles = 0, gallons = 0, mileage = 0, totalTrips = 0, totalMiles = 0, totalGallons = 0, totalMileage = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many trips do you wish to calculate?");
        totalTrips = input.nextInt();
        while (trip <= totalTrips) 
            {
            System.out.print("Enter mileage for trip " + trip + ": ");
            miles = input.nextDouble();
            totalMiles += miles;
            System.out.print("Enter gallons of gas used for trip " + trip + ": ");
            gallons = input.nextDouble();
            totalGallons += gallons;
            mileage = miles / gallons;
            totalMileage = totalMiles / totalGallons;
            System.out.printf("Your mileage for this trip, (%d), was: %.2f miles per gallon.\n" , trip , mileage);
            System.out.printf("Your running total is: %.2f miles, %.2f gallons used, and %.2f miles per gallon.\n" , totalMiles , totalGallons , totalMileage);
            trip++;
            }
        System.out.println();
        System.out.println("Trip entry complete. Thank you!");
        }
    
    }
