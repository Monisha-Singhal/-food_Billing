
import java.util.Random;
import java.util.Scanner;
public class myFirstGame {
    public static void main(String[] args) {
        System.out.println("Are You Ready For Your Game!!!!!!!!!!");
        System.out.println("Yes/No");
        int initialAmount=10;

        Scanner sc= new Scanner(System.in);
        String permisson= sc.nextLine();
        System.out.println("==============================");
        System.out.println("🎲 Rolling the dice...");





        if(permisson.equalsIgnoreCase("yes")) {
            Random rn = new Random();
            int number = rn.nextInt(0, 7);
            System.out.println("You rolled to number " +number);

            System.out.println("==============================");
            if(number==6){

                initialAmount=initialAmount+50;
                System.out.println("Hurrah! you won 50 more coins🎉🎉🎉🎉");
                System.out.println("your total coins are "+initialAmount+ "🪙🪙🪙🪙");

                System.out.println("==============================");

            }
          if (number==5){
              initialAmount=initialAmount+40;
              System.out.println("Hurrah! you won 40 more coins🎉🎉🎉🎉");
              System.out.println("your total coins are "+initialAmount+ "🪙🪙🪙🪙");

              System.out.println("==============================");
          }
          if(number>0 && number<=4){
              initialAmount=initialAmount+20;
              System.out.println("Hurrah! you won 20 more coins🎉🎉🎉🎉");
              System.out.println("your total coins are "+initialAmount+ "🪙🪙🪙🪙");

              System.out.println("==============================");
          }
          if(number==0){
              initialAmount=initialAmount-5;
              System.out.println("oops! you lose your 5 coins.😔😔😔");
              System.out.println("your coins are "+initialAmount+ "🪙");
              System.out.println("Please Try Again Later");
              System.out.println("==============================");
          }
        }
        System.out.println("THANK YOU!!!!!");
        System.out.println("==============================");


    }
}
