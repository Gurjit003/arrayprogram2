/*
 * Gurjit Singh
 * Friday October 18th - 2019
 * This is the second array practice program
 */

package arrayprogram2;
import java.util.Scanner;

/**
 *
 * @author gusin5788
 */
public class Arrayprogram2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); // Scanner declared
        
        String [ ] friends = new String [5]; // Array declaration
        
        System.out.println("Enter the names of ten friends:"); // Asks the user to input 10 names
        for (int i = 0; i <= 4; i = i + 1) // For loop which lets the user input 10 names
        {
            friends[i] = input.nextLine(); // Receives the 10 names from the user
        }
        
        System.out.println("");
        System.out.println("The second, third and fourth names listed were:"); // Displays specific names to the user
        System.out.println("Second: " + friends[1]);
        System.out.println("Third: " + friends[2]);
        System.out.println("Fourth: " + friends[3]);
    }
    
}
