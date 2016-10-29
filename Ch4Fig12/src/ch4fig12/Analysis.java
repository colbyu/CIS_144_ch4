// Fig. 4.12: Analysis.java
// Analysis of examination results using nested control statements.
package ch4fig12;
import java.util.Scanner;
public class Analysis 
    {
    public static void main(String[] args) 
        {
        /// create a scanner to obtain input from command window
            Scanner input = new Scanner(System.in);
            
            //initializing variables in declarations
            int passes = 0; //number of passws
            int failures = 0; //number of failures
            int studentCounter = 1; //student counter
            int result; //one exam resuly (obtains valur from user
            
            //process 10 students using counter controlled loop
            while (studentCounter <= 10)
                {
                //prompt user for input and obtain value from user
                System.out.print("Enter result (1 = pass, 2 = fail): ");
                result = input.nextInt();
                
                //if ... else is nested in the while statement
                if (result == 1) //if result is 1
                    passes = passes + 1; //incriment passes
                else
                    failures = failures + 1; // increment failures
                
                //increment studentCounter so loop eventually terminates
                studentCounter = studentCounter + 1;
                }//end while
            
            //termination phase - prepare to display results
            System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);
            
            //determine whether more than 8 students passed
            if (passes > 8)
                System.out.println("Bonus to instructor!");
        }//end main
    
    }//end class analysis
