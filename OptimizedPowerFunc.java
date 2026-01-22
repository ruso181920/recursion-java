import java.util.Scanner;

public class OptimizedPowerFunc {
    public static int powerFunction(int n,int pow) {
      if(pow==0) {
        return 1;
      }
       int halfPowerSq= powerFunction(n, pow/2);
       int value=halfPowerSq*halfPowerSq;
     if(pow%2!=0) {
        value=n*value;
     }
     return value;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number :");
        int number=inp.nextInt();
        System.out.print("Enter the pow :");
        int pow=inp.nextInt();
      System.out.println(number +" raise to power of "+pow+ " equals "+ powerFunction(number,pow));
  }
}
