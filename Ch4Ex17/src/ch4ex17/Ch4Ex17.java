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
        int miles = 0, gallons = 0, trip = 1, totalTrips = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many trips do you wish to calculate?");
        totalTrips = input.nextInt();
        while (trip <= totalTrips) 
            {
            System.out.println("Enter mileage for trip " + trip + " in whole miles.");
            miles = input.nextInt();
            System.out.println("Enter gas used for trip " + trip + " in whole gallons.");
            gallons = input.nextInt();
            System.out.println("Your mileage for trip " + trip + " was: " + miles / gallons + " miles per gallon");
            trip++;
            }
        }
    
    }
