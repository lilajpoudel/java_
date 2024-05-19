public class MaximumNumber {
    public static void main (String [] args ){
        int a= 5;
        int b= 6;
        int c= 1;
        if (a>b && a>c){
            System.out.println(" a is greater" +a);
        }else if (b>a && b>c){
            System.out.println("b is greater" +b);
        }
        else if (c>a && c>b) {
            System.out.println("c is greater" +c);
        }else {
            System.out.println("all are equall");
        }
    }

}
