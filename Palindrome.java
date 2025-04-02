package String;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        String s = scan.nextLine();
        
        
        StringBuilder sb = new StringBuilder(s);
        
        StringBuilder rsb= sb.reverse();
        
        // boolean i= sb.equals(rsb);
        if (rsb.equals(s)) {
           System.out.println("Palindrome");
         }else

         System.out.println(" Not palindrome");
    }
    
}