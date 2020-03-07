/*
 *Ron Christian Y. Magto
 * 9/11/19
 * Exercise 6
 */
package exer06magto;

import java.util.*;
public class EXER06MAGTO {

    
    public static void main(String[] args) {
        Scanner pan = new Scanner(System.in);
    System.out.println("Enter three values");
    int firstNumber = pan.nextInt();
    int secondNumber = pan.nextInt();
    int thirdNumber = pan.nextInt();
    
        if ((firstNumber<secondNumber) && (firstNumber<thirdNumber)){
            System.out.println("it is in increasing order");
        }
        else if ((firstNumber>secondNumber) && (firstNumber>thirdNumber))
            System.out.println("It is in decreasing order");
        else
            System.out.println("Neither");
            
    
  }
    
}
