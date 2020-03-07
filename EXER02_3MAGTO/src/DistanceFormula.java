import java.util.*;
public class DistanceFormula {

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        Point notLine = new Point();
        
        System.out.println("Enter the abscissa of the first point : ");
        int x1=console.nextInt();
        System.out.println("Enter the ordinate of the first point : ");
        int y1=console.nextInt();
        System.out.println("Enter the abscissa of the second point : ");
        int x2=console.nextInt();
        System.out.println("Enter the ordinate of the first point : ");
        int y2=console.nextInt();
        
        Point notShape = new Point(x1,y1,x2,y2);
        
    
        System.out.println("The distance between the two points is : " + notShape.computeDistance());
    
    
    
    }
    
}
