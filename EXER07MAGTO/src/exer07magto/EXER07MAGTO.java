/*
 * Ron Christian Y. Magto
 * 9/11/19
 *Exercise 7
 */
package exer07magto;

import java.util.*;
public class EXER07MAGTO {

    
    public static void main(String[] args) {
       Scanner vanner = new Scanner(System.in);
       System.out.println("Enter the price of product and quantity of product ");
       int price = vanner.nextInt();
       int quantity = vanner.nextInt();
       int revenue = price * quantity;
       
    if (revenue<5000){
        System.out.println("No 10% discount");
        System.out.println("Net revenue = " + revenue);
    }
    else {
        double discount = 0.01;
        double disRevenue = revenue - (revenue * discount);
        System.out.println("You receive a 10% discount");
        System.out.println("The net revenue is " + revenue);
        System.out.println("The discounted revenue you received is "+ disRevenue );
    }
    
    }
    
}
