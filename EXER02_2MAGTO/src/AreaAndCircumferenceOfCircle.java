import java.util.*;
public class AreaAndCircumferenceOfCircle {

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
      
      Circle notSquare = new Circle();
      
      System.out.println("Enter a radius of a circle");
      double radius = console.nextDouble();
     
      notSquare.setRadius(radius);
      
      System.out.println("The area of the circle is "+notSquare.computeArea());
      System.out.println("The circumference of circle is "+notSquare.computeCircumference());
    
    
    
    }
    
}
