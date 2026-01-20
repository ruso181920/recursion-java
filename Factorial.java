import java.util.*;



public class Factorial {
    public static int factorial(int n) {
    
    if (n==0) {
        return 1;
    }
    return n*factorial(n-1);
}
    public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
        System.out.print("enter the num: ");
        int num=inp.nextInt();
        System.out.println("Factorial of number is : "+factorial(num));
    }
    }

