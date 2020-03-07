
public class Point {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    Point (int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    
    Point (){
        
    }
    
    double computeSlope(){
        return ((y2-y1)/(x2-x1));
    }
    double computeDistance(){
        return java.lang.Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
    }
    
    
    
}
