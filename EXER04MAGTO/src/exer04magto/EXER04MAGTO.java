/*
 * Ron Christian Y. Magto
 * To get bills
 * 8/15/19
 */
package exer04magto;

import java.util.*;
public class EXER04MAGTO {

    public static void main(String[] args) {
        Scanner gamma=new Scanner(System.in);
    System.out.println("Enter a fair amount");
    int amount= gamma.nextInt();
    int a = amount/1000;
    int b = (amount%1000)/500;
    int c = (amount%500)/200;
    int d = (amount%200)/100;
    int e = (amount%100)/50;
    int f = (amount%50)/20;
    int g = (amount%20)/10;
    int h = (amount%10)/1;      
   System.out.println(a + " bills for one thousand," + b + " bills for five hundred,"+ c +" bills for two hundred," + d + " bills for 0ne hundred," + e + "bills for fifty," + f + "bills for twenty," + g + "bills for ten," + h + "bills for one");
    }
    
}
