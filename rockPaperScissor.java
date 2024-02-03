import java.util.Scanner;
import java.util.Random;

class HelloWorld {
    public static void main(String[] args) {
        int userWins = 0;
        int computerWins = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the matches you want (it should be an odd number):");
        int matches = s.nextInt();
         Random r = new Random();
        for (int match = 1; match <= matches; match++) {
             System.out.println("Enter the number :");
        System.out.println("1 for rock");
        System.out.println("2 for paper");
        System.out.println("3 for scissor");
        int num = s.nextInt();
        int min = 1;
        int max = 3;

          
            int computerGeneratedNumber = r.nextInt((max - min) + 1) + min;
            // System.out.println(computerGeneratedNumber);
            if (computerGeneratedNumber == 1) {
                System.out.println("Computer has generated Rock");
            } else if (computerGeneratedNumber == 2) {
                System.out.println("Computer has generated Paper");
            } else if (computerGeneratedNumber == 3) {
                System.out.println("Computer has generated Scissor");
            }

            if ((num == 1 && computerGeneratedNumber == 1) ||
                (num == 2 && computerGeneratedNumber == 2) ||
                (num == 3 && computerGeneratedNumber == 3)) {

                System.out.println("It's a tie");
            } else if ((num == 1 && computerGeneratedNumber == 2) ||
                (num == 2 && computerGeneratedNumber == 3) ||
                (num == 3 && computerGeneratedNumber == 1)) {

                System.out.println("Computer has won");
                computerWins++;
            } else if ((num == 1 && computerGeneratedNumber == 3) ||
                (num == 2 && computerGeneratedNumber == 1) ||
                (num == 3 && computerGeneratedNumber == 2)) {
userWins++;
                System.out.println("You won");
            }
        }
        if(computerWins > userWins){
            System.out.println("Overall Computer has won");
        }else if (userWins < computerWins){
                System.out.println("Overall you have won");
        }else{
                System.out.println("It's a tie");
        }
    }
}