/*
 * Ron Christian Y. Magto
 * 9/18/19
 * Exercis 8
 */
package exer08magto;

import java.util.*;
public class EXER08MAGTO {

   
    public static void main(String[] args) {
       Scanner top = new Scanner(System.in);
       System.out.println("Enter a number from 1 to 25");
       int height = top.nextInt();
       
       for(int x = 1; x <= height; x++ ){
           for (int y=1; y<= height; y++){
               if (( y == x) || (y == height - x + 1)){
                   System.out.print("*");
               }
               else {
                  System.out.print(" ");    
               }
                
               
           }
           
       System.out.println("");
       }
    
       
    
    }
    
}
