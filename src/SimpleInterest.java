import java.util.Scanner;
public class SimpleInterest {
    public static void main (String[] args) {
        Scanner scanner =new Scanner (System.in);
        System.out.println("enter the Principal");
        double principal = scanner.nextDouble();
        System.out.println("enter the rate");
        double rate = scanner.nextDouble();
        System.out.println("enter the time");
        double time = scanner.nextDouble();
        double  simpleintrest=(principal*rate*time)/100;
        System.out.println("the simpleintrest is"+simpleintrest);




    }
}
