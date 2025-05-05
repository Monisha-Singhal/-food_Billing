import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height;
        double weight;

        System.out.println("Welcome to BMI calculator📱");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "! Let's calculate your BMI.");

            System.out.println("Enter your height in feet");
            double feet = sc.nextDouble();
            System.out.println("enter your height-inches");
            double inches = sc.nextDouble();
            height = (feet * 12) + inches;


            System.out.println("enter your weight in kgs");
            weight = sc.nextDouble();

            double meters = height * .0254;


            double BMI = weight / (meters * meters);

        System.out.println("Your entered details are:");
        System.out.println("your weight is: "+weight+"kgs");
        System.out.println("your height is: "+meters+"meters");
            System.out.printf("Your BMI is: %.2f\n", BMI);


            if (BMI < 18.5) {
                System.out.println("Underweight");
            } else if (BMI > 18.5 && BMI < 24.9) {
                System.out.println("Normal Weight");
            } else if (BMI > 25 && BMI <= 29.9) {
                System.out.println("Overweight");
            } else {
                System.out.println("obese");
            }
        System.out.println("Thanku for using BMI Calculator.");
        System.out.println("Stay healthy!!!!!");

    }

}
