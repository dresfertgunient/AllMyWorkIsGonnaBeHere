
public class Circle {
    private double radius;
    
    void setRadius(double radius){
       if ((radius<0) || (radius==0))
        this.radius=(0);
         else
           this.radius=radius;
    }
    double getRadius(){
        return radius;
    }
    double computeArea(){
        return Math.PI * (radius * radius);
    }
    double computeCircumference(){
        return Math.PI * 2 * radius;
    }
       
    
}
