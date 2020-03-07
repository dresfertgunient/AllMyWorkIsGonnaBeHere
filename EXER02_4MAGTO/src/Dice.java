import java.util.Random;
public class Dice {
    Random rand= new Random();
    private int num;
    Dice(){
        num=rand.nextInt(6)+1;
    }
    int getNum(){
        return num;
    }
}
