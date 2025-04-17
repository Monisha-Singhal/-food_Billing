import java.sql.SQLOutput;
import java.util.Scanner;
public class numero {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Your Birth Date (only the day when you born): ");
        int DOB = sc.nextInt();

//        int Mulank;

        while (DOB > 9) {
            int sum = 0;
            while (DOB != 0) {
                sum += DOB % 10;
                DOB /= 10;
            }
            DOB = sum;

        }
        System.out.printf("Your Root Number(Mulank) is %d",DOB);
        if(DOB==1){
            System.out.printf("Namashkaram %s . Your Root Number (Mulank) is %d.\n ", name, DOB);
            System.out.println("Woww, you’ve got some seriously powerful qualities according to your Mulank!😍😍");
            System.out.println("People with this number are believed to possess the ");
            System.out.println(" Leader+👨‍⚖️, ambitious+🏆, confident☺️, Self made vibe+😍");
        }

        if(DOB==2) {
            System.out.printf("Namashkaram %s . Your Root Number (Mulank) is %d.\n ", name, DOB);
            System.out.println("Woww, you’ve got some seriously powerful qualities according to your Mulank!😍😍");
            System.out.println("People with this number are:  ");
            System.out.println(" Sensitive🌸, cooperative🤝, peace-loving+☺️");
        }
        if(DOB==3) {
            System.out.printf("Namashkaram %s . Your Root Number (Mulank) is %d.\n ", name, DOB);
            System.out.println("Woww, you’ve got some seriously powerful qualities according to your Mulank!😍😍");
            System.out.println("People with this number are: ");
            System.out.println("Creative, expressive, optimistic");
        }
        if(DOB==4) {
            System.out.printf("Namashkaram %s . Your Root Number (Mulank) is %d.\n ", name, DOB);
            System.out.println("Woww, you’ve got some seriously powerful qualities according to your Mulank!😍😍");
            System.out.println("People with this number are :  ");
            System.out.println("Practical, hardworking, disciplined");
        }
        if(DOB==5) {
            System.out.printf("Namashkaram %s . Your Root Number (Mulank) is %d.\n ", name, DOB);
            System.out.println("Woww, you’ve got some seriously powerful qualities according to your Mulank!😍😍");
            System.out.println("People with this number are: ");
            System.out.println("Adventurous, energetic, flexible");
        }
        if(DOB==6) {
            System.out.printf("Namashkaram %s . Your Root Number (Mulank) is %d\n. ", name, DOB);
            System.out.println("Woww, you’ve got some seriously powerful qualities according to your Mulank!😍😍");
            System.out.println("People with this number are:  ");
            System.out.println("Caring, responsible, balanced");
        }
        if(DOB==7) {
            System.out.printf("Namashkaram %s . Your Root Number (Mulank) is %d.\n ", name, DOB);
            System.out.println("Woww, you’ve got some seriously powerful qualities according to your Mulank!😍😍");
            System.out.println("People with this number are:  ");
            System.out.println("Spiritual, analytical, introspective");
        }
        if(DOB==8) {
            System.out.printf("Namashkaram %s . Your Root Number (Mulank) is %d.\n ", name, DOB);
            System.out.println("Woww, you’ve got some seriously powerful qualities according to your Mulank!😍😍");
            System.out.println("People with this number are:  ");
            System.out.println(" Powerful, determined, serious");
        }
        if(DOB==9) {
            System.out.printf("Namashkaram %s . Your Root Number (Mulank) is %d.\n ", name, DOB);
            System.out.println("Woww, you’ve got some seriously powerful qualities according to your Mulank!😍😍");
            System.out.println("People with this number are:");
            System.out.println("Charitable, emotional, humanitarian");
        }


    }
}




