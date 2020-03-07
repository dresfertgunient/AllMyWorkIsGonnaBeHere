/*
 * Ron Christian Y. Magto
 * To get the area of a triangle
 *8/14/19
 */
package exer02magto;

import java.util.Scanner;
public class EXER02MAGTO {

  
    public static void main(String[] args) {
    Scanner banner = new Scanner(System.in);
    System.out.println("Please input base");
    int base=banner.nextInt();
    System.out.println("Please input height");
    int height=banner.nextInt();
    int area=(base/2)*height;
    System.out.println("Your area is" +area);
    }
    
}
