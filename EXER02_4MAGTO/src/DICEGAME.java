import java.util.*;
public class DICEGAME {

    
    public static void main(String[] args) {
        GameRoll game= new GameRoll();
        Scanner sc= new Scanner(System.in);
        System.out.println("This will be a 2-player game of dice");
        System.out.println("First to 3 points win");
        System.out.println();
        System.out.println("Enter the name of Player 1:");
        String name1= sc.next();
        System.out.println("Enter the name of Player 2:");
        String name2= sc.next();
        game.start(name1,name2);
        
        for (int x=0;x<=0;x--){
        System.out.println("Do you want to play again?");
        String ans= sc.next();
        if ("no".equals(ans)||"NO".equals(ans)||"No".equals(ans)||"nO".equals(ans)) {
            System.out.println();
            System.out.println("Thank you for playing!!!");
            x=2;
        }
        else {
            game.start(name1,name2);
        }   
        }
                    
    }
    
}
