// Fig. 4.15: Increment.java
// Prefix increment and postfix increment operators.
package ch4fig15;
public class Increment 
    {
    public static void main(String[] args) 
        {
        int c;
        
        //demonstrate postfix increment operator
        c = 5; //assign 5 ti c
        System.out.println(c);
        System.out.println(c++);
        System.out.println(c);
        
        System.out.println();
        
        //demonstrates a prefix increment operator
        c = 5;
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c);
        }
    
    }
