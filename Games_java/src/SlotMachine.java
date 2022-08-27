import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wana play? (Yes or No)");
        String startGame = sc.nextLine();

        if (startGame .equals("yes")) {
            newGame();
        } else if (startGame .equals("no")) {
            System.out.println("We are waiting for you");
        } else {
            System.out.println("See you later");
        }
    }
    public static void newGame(){

        Scanner mz=new Scanner(System.in);
        Random generator=new Random();
        System.out.print("your buget = ");
        double budget= mz.nextDouble();
        ArrayList<String> list=new ArrayList<>(Arrays.asList("Diamont","Cherry","Queen"));

        while(true) {
            System.out.println("Your budget is "+budget+" USD");
            System.out.print("Enter the stake: ");
            double stake = mz.nextDouble();

            if(stake<budget){
                budget-=stake;
                String alternative1= list.get(generator.nextInt(list.size()));
                String alternative2= list.get(generator.nextInt(list.size()));
                String alternative3= list.get(generator.nextInt(list.size()));

                printTheResult(alternative1, alternative2, alternative3);

                if(alternative1.equals(alternative2) && alternative2.equals(alternative3)){
                    System.out.println("jackpot");

                    budget=budget+(stake*5);

                }else if(alternative1.equals(alternative2)||alternative1.equals(alternative3)||alternative2.equals(alternative3)) {
                    System.out.println("semijackpot");
                    double newBudget = (30.0 / 100.0) * stake;
                    budget += newBudget;
                } else {
                    System.out.println("You lose");
                }

            }else if(stake>budget){
                System.out.println("Enter less");
            }
            else{
                System.out.println("You lose");
            }
            if(budget<=1){
                System.out.println("You lose");
                break;
            }else if(budget>=1000){
                System.out.println("You won");
                break;
            }
        }
    }
    private static void printTheResult(String alternative1, String alternative2, String alternative3) {
        System.out.println(alternative1 +" / "+ alternative3 +" / "+ alternative2);
    }


}
