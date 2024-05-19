import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = scan.nextInt();
        System.out.println("enter second number");
        int num2 = scan.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);

        }
        else if (num1 < num2) {
            System.out.println(num2 + " is less than " + num1);

        }
        else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}