// Fig. 4.6: GradeBook.java
// GradeBook class that solves class-average problem using
// counter-controlled repetition.
package ch4fig6;
import java.util.Scanner;
public class GradeBook 
    {
    private String courseName;

    // constructor iniyializes coursename
    public GradeBook(String name)
        {
        courseName = name; // initializes coursename
        }//end constructor
    
    // method to set the coursename
    public void setCourseName(String name)
        {
        courseName = name;
        } //end method setCourseName
    
    //method to retrieve course name
    public String getCourseName() 
        {
        return courseName;
        }//end method getcoursename
    
    //display a welcome message to gradebook user
    public void displayMessage()
        {
        //grtCourseName gets the name of the course
        System.out.printf( "Welcome to the gradebook for\n%s!\n\n", 
             getCourseName());
        }// end method displayMessage
    
    //determine class based on 10 gtades entered by user
    public void determineClassAverage()
        {
        //create scammer to obtain input from command window
        Scanner input = new Scanner(System.in);
        
        int total; // sum of grades entered by user
        int gradeCounter;// number of grade to be entered next
        int grade; //grade value entered by user
        int average; //average of grades
        
        //initialization phaze
        total = 0;//initialize total
        gradeCounter = 1;// initialize loop counter
        
        //processong phase uses counter controlled repetition
        while (gradeCounter <= 10)// loop 10 times
        {
        System.out.print("Enter grade: ");//prompt
        grade=input.nextInt();// input next grade
        total = total + grade; //add grate to total
        gradeCounter = gradeCounter + 1;
        }// end while
    
        //termination phaze
        average = total / 10; //integer fivision yields intiger results
        
        //display total average of grades
        System.out.printf("\nTotal of all 10 grades is %d\n", total);
        System.out.printf("Class average is %d\n", average);
        }//end method determineClassAverage
    }//end class gradeBook
