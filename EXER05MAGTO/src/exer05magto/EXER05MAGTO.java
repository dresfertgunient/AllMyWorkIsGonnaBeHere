/*
 * Ron Christian Y. Magto
 * Add digits of three number digit
 * 8/15/19
 */
package exer05magto;

import java.util.*;
public class EXER05MAGTO {

    
    public static void main(String[] args) {
       Scanner bamma = new Scanner(System.in); 
       System.out.println("Enter any three-digit number");
       int number = bamma.nextInt();
       int val = number/100;
       int value = number-(val*100);
       int value2 = value/10;
       int value3 = value-(value2 *10);
       int sum = val + value2 + value3;
       System.out.println("The sum is " + sum);
    }
    
}
