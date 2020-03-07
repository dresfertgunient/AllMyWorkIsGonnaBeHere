
package exer2_01_magto;

import java.util.*;
public class EXER2_01_MAGTO {

    public static int year, month, newMonth;
    public static boolean valid, validMonth;
    
    public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
        do {
            System.out.println("Please input a month with its corresponding number from 1-12: ");
            month = console.nextInt();
            System.out.println("Please enter a year with a value greater than or equal to 2000: ");
            year = console.nextInt();
            valid = isValid();
        } while (valid == false);
        System.out.println("The date is " + toText() + ".");
        System.out.println("The last day is " + lastDay() + ".");
        do {
            System.out.println("Input how many months do you want to add, a number greater than 0: ");
            newMonth = console.nextInt();
            validMonth = isValidMonth();
        } while (validMonth == false);
        addMonth();
        System.out.println("The new date is " + toText() + ".");
        
    }
    
    public static boolean isValid() {
        
        if (month > 0 && month < 13 && year >= 2000) {
            return true;
        }
        else {
            System.out.println("Please input valid data.");
            return false;
        }
        
    }
    
    public static boolean isValidMonth() {
        
        if (newMonth > 0) {
            return true;
        }
        else {
            System.out.println("Please input valid data.");
            return false;
        }
        
    }
    
    public static String toText() {
        
        String date[] = {"January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ", "September ", "October ", "November ", "December "};
        
        return date[month - 1].concat(Integer.toString(year));
        
    }
    
    public static int lastDay() {
        
        if (month == 1 || month == 3 || month == 5 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        else if (month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
            return 30;
        }
        else if (year % 4 == 0) {
            return 29;
        }
        else {
            return 28;
        }
        
    }
    
    public static void addMonth() {
        
        month += newMonth % 12;
        year += newMonth / 12;
        
    }
    
}
    
    

