//4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
//department-store customers has exceeded the credit limit on a charge account. For each customer,
//the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning balance
//+ charges – credits), display the new balance and determine whether the new balance exceeds the
//customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
//package ch4ex18;
package ch4ex18;
import java.util.Scanner;
/**
 *
 * @author colby
 */
public class Ch4Ex18 
    {
    public static void main(String[] args) 
        {
        int accountNumber = 1, overLimit = 0;
        float startBalance = 0, credits = 0, credLim = 0, totalCharges = 0, balance = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter account number, or  0 to abort: ");
        accountNumber = input.nextInt();
        while (accountNumber >= 1)
        {
        
        System.out.println("enter starting account balance for the month: ");
        startBalance = input.nextFloat();
        System.out.println("enter customer's total charged amount: ");
        totalCharges = input.nextFloat();
        System.out.println("enter customer's total credits: ");
        credits = input.nextFloat();
        System.out.println("enter customer's credit limit: ");
        credLim = input.nextFloat();
        balance = startBalance + totalCharges - credits;
        System.out.println("After credits are applied, customer has a current balance of " + balance);
        if (balance > credLim)
                System.out.println("Credit limit exceeded!");
            else
                System.out.println("Credit OK. Customer has " + (credLim - balance) + " available.");
        System.out.println("enter account number, or  0 to abort: ");
        accountNumber = input.nextInt();
        }
    System.out.println("0 entered, process complete.");
    System.out.println ("Thank you.");
    }
}