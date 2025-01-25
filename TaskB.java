import java.io.*;

/*
 * This is nested for loop inside another for loop
 */

public class TaskB {    
    public static void main(String[] args) throws IOException
    {
    
        for(int i = 5; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print ("\\o/");
            }
            System.out.println ();
        }
    }  
}