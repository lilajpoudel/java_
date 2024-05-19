//import java.util.Scanner;
//public class Swap {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the second number: ");
//        int num2 = sc.nextInt();
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//        System.out.println("The first number is: " + num1);
//        System.out.println("The second number is: " + num2);
//    }
//}
public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}