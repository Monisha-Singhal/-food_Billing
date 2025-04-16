import java.util.Scanner;
public class foodBilling{
    public static void main(String[]args)
    {
        int total=0;
        int ptotal=0;
        int btotal=0;
        int wtotal=0;
int e1=0;
int e2=0;
int e3=0;



        Scanner scan =new Scanner(System.in);
        System.out.println("-----------------WELCOME TO SILVER INN-----------------");
        int p=199;
        System.out.println("Price of one pizza is : Rs"+p);
        int B=80;
        System.out.println("Price of 1 burger is Rs:"+B);
        int v=120;
        System.out.println(" Price of 1 white sauce pasta is Rs : "+v);
        System.out.println("-------------------------------------");


        System.out.print("Do you want pizza? : ");
        String pizza =scan.nextLine();
        if(pizza.equalsIgnoreCase("yes"))
        {
            int n=199;
            System.out.print("How many pizza do you want : ");
            int  quantity=scan.nextInt();
            scan.nextLine();
            int pizzaTotal = n*quantity;
            System.out.println("Pizza Rs"+pizzaTotal);
            total = total+pizzaTotal;
            ptotal=ptotal+pizzaTotal;
            e1=quantity;
            System.out.println("-------------------------------------");
        }


        System.out.print("Do you want burger? : ");
        String burger=scan.nextLine();
        if(burger.equalsIgnoreCase("yes"))
        {
            int n=80;
            System.out.print("How many burger do you want? : ");
            int  quantity=scan.nextInt();
            scan.nextLine();
            int burgerTotal = n*quantity;
            System.out.println("burger Rs: "+burgerTotal);
            total = total+burgerTotal;
            btotal=btotal+burgerTotal;
            e2=quantity;
            System.out.println("-------------------------------------");


        }


        System.out.print("do you want white sauce pasta?: ");
        String wsp=scan.nextLine();
        if(wsp.equalsIgnoreCase("yes"))
        {
            int n=120;

            System.out.print("How many white sauce pasta do you want? : ");
            int  quantity=scan.nextInt();
            int wspTotal = n*quantity;
            System.out.println("white sauce pasta Rs" +wspTotal);
            total = total+wspTotal;
            wtotal=wtotal+wspTotal;
            e3=quantity;
            System.out.println("-------------------------------------");

        }

        System.out.println("-------------------------------------");
//        System.out.println("pizza " +ptotal);
//        System.out.println("burger "+btotal);
//        System.out.println("white sauce pasta "+wtotal);

//        System.out.println("-----TOTAL BILL IS------ : "+total);
        System.out.println("------------------------------YOUR BILL IS-------------------------");
//
//
        System.out.printf("%-5s %-25s %-25s %s%n", "S.No.", "Item", "Quantity", "amount");

        System.out.printf("%-5d %-25s %-25d Rs%d%n", 1, "Pizza", e1, ptotal);
        System.out.printf("%-5d %-25s %-25d Rs%d%n", 2, "Burger", e2, btotal);
        System.out.printf("%-5d %-25s %-25d Rs%d%n", 3, "White Sauce Pasta", e3, wtotal);
        System.out.println("---------------Thank You for coming!----------------------");
        System.out.println("--------------Your total bill is--------------\nRs"+total);





    }
}