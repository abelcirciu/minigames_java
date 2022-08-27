import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindTheWord {
    public  static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Random generator=new Random();
        ArrayList<String> list=new ArrayList<>(Arrays.asList("Intership","mintos","crypto","iosemite"));
        list.add("mind");
        list.add("Saturn");
        list.add("stranger");
        String word= list.get(generator.nextInt(list.size()));
        int livesNumber=8;
        char[] letters=word.toCharArray();
        char[] displayedWord=new char[letters.length];
        Arrays.fill(displayedWord,'_');
        displayTheWord(displayedWord);
        System.out.println();
        while(true){
            System.out.print("Enter a letter: ");
            char GuessTheLetter=sc.next().charAt(0);
            boolean containsLetters=false;
            System.out.println("The number of lives is: "+livesNumber);
            for(int i=0;i<letters.length;i++){
                if(GuessTheLetter==letters[i]){
                    displayedWord[i]=GuessTheLetter;
                    containsLetters=true;
                }
            }
            if(!containsLetters){
                livesNumber--;
            }
            if(livesNumber<=0){
                System.out.println("You lost!");
                break;
            }
            if(Arrays.equals(letters,displayedWord)){
                System.out.println("You won!");
                displayTheWord(displayedWord);
                break;
            }
            displayTheWord(displayedWord);
        }
    }
    private static void displayTheWord(char[] displayedWord) {
        for(char c: displayedWord){
            System.out.print(c+" ");
        }
        System.out.println();
    }
}
