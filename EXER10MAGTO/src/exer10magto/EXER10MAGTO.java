/*
 * Ron Christian Y. Magto
 *Exercise 10
 *9/19/19
 */
package exer10magto;

import java.util.*;
public class EXER10MAGTO {

    public static void main(String[] args) {
       Scanner tap = new Scanner(System.in);
        int num[]= new int[10];
        int j;
        for (j = 0; j<10; j++){
            System.out.println("Enter a number.");
            num[j] = tap.nextInt();
        }
        double sum = 0;
        int n = 0;
        while (j>0){
            if (num[j-1]!=0){
                sum = sum + num[j-1];
                n++;
            }
            j--;
        }
        double average = sum/n;
        System.out.println("The sum of the values is " + sum);
        System.out.println("The average of the values is " + average);
        
    }
    
}
