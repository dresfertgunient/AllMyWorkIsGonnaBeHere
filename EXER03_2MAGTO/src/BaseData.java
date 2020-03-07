import java.io.*;
import java.lang.*;
import java.util.*;
public class BaseData {
    private Formatter y;
    String t1;
    String t2;
    String t3;
    public void openFile(){
        try{
            y = new Formatter("data.txt");
        }
        catch (Exception ex){
            System.out.println("Error");
        }
    }
    public void addRecords(){
        y.format("%s%s%s%s%s",t1," ",t2," ",t3);
    }
    public void closeFile(){
        y.close();
    }
}
