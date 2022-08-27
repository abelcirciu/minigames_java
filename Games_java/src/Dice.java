import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {

        int dice1;
        int dice2;
        int opponentDice;
        int opponentDice2;
        int myResult=0;
        int opponentResult=0;
        Scanner sc=new Scanner(System.in);
        Random dice=new Random();
        while(true){
            System.out.println("Wan to play?(yes or no) ");
            String answer= sc.nextLine();
            if(answer.equals("yes")){
                dice1 = dice.nextInt(6)+1;
                dice2= dice.nextInt(6+1);
                opponentDice= dice.nextInt(6)+1;
                opponentDice2=dice.nextInt(6)+1;
                int myGain=dice1+dice2;
                System.out.println(myGain);
                int opponent=opponentDice+opponentDice2;
                System.out.println(opponent);
                if(myGain>opponent){
                    System.out.println("I winn ");
                    myResult++;
                }else if(myGain<opponent){
                    System.out.println("Opponent winn");
                    opponentResult++;
                }else{
                    System.out.println("Draw");
                }
                System.out.println(myResult+ " / "+ opponentResult);
            }else if(answer.equals("no")){
                System.out.println("You should come back");
                break;
            }else{
                System.out.println("Wrong answer");
            }
        }
    }
}
