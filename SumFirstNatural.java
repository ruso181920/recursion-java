import java.util.Scanner;

public class SumFirstNatural {
     public static int sumFirstNatural(int n) {
       // int sum=0;
       if(n==0) {
        return 0;
       }
     int sum = n + sumFirstNatural(n-1);
      return sum;

   
}
    public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
        System.out.print("enter the num: ");
        int num=inp.nextInt();
        System.out.println("Sum of first " +num +" natural number  is : "+sumFirstNatural(num));
    }
    }

