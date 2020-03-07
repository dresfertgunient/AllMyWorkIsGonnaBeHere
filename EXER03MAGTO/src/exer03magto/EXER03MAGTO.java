/*
 * Ron Christian Y. Magto
 * To get absolute value of number
 * 8/15/19
 */
package exer03magto;

import java.util.*;
public class EXER03MAGTO {

    
    public static void main(String[] args) {
        Scanner ganner=new Scanner(System.in);
        System.out.println("Enter a value");
        int value=ganner.nextInt();
        if (value<0){
            int val = value*-1;
            System.out.println(val);
        }
            
        else{
            System.out.println(value);
        }
    }
    
}
