import java.util.*;
public class GameRoll {
    Scanner sc= new Scanner(System.in);
    String name1, name2;
    void start(String person1, String person2){
        this.name2=person2;
        Dice die1, die2;
        int score1=0;
        int score2=0;

        while(score1<3 && score2<3){
            System.out.println(person1+"'s Score: "+score1);
            System.out.println(person2+"'s Score: "+score2);
            die1 = new Dice();
            die2 = new Dice();
        
            roll();
            System.out.println();
            System.out.println(person1+" rolled a "+die1.getNum()+"!");
            System.out.println(person2+" rolled a "+die2.getNum()+"!");
            System.out.println();
            
            if (die1.getNum() > die2.getNum()){
                System.out.println(person1+" rolled higher! "+person1+" gets a point.");
                score1++;
            }
            else if (die2.getNum() > die1.getNum()) {
                System.out.println(person2+" rolled higher! "+person2+" gets a point.");
                score2++;
            }
            else {
                System.out.println("Tie! No one gets a point.");
            }            
            System.out.println();
        }
        
        if (score1>score2){
            System.out.println(person1+"'s Score: "+score1);
            System.out.println(person2+"'s Score: "+score2);
            System.out.println();
            System.out.println(person1+" wins!");
        }
        else if (score1<score2){
            System.out.println(person1+"'s Score: "+score1);
            System.out.println(person2+"'s Score: "+score2);
            System.out.println();
            System.out.println(person2+" wins!");
        }
    }
    
    void roll(){
        System.out.println();
        System.out.println("Press enter to roll.");
        sc.nextLine();
        System.out.println("");  
    }
}
