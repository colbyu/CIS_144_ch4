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
            System.out.println("Enter mileage for trip " + trip + ":");
            miles = input.nextInt();
            totalMiles += miles;
            System.out.println("Enter gallons of gas used for trip " + trip + ":");
            gallons = input.nextInt();
            totalGallons += gallons;
            mileage = miles / gallons;
            totalMileage = totalMiles / totalGallons;
            System.out.print("Your mileage for this trip, (" + trip + ") was: ");
            System.out.printf("%.2f miles per gallon.\n", mileage);
            System.out.print("Your running total so far is: " + totalMiles + " miles, " + totalGallons + " gallons used, and ");
            System.out.printf("%.2f miles per gallon.\n", totalMileage);
            trip++;
            }
        
        }
    
    }
