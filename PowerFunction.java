import java.util.*;
public class PowerFunction {
    
 public static int powerFunction(int n,int pow) {
      if(pow==0) {
        return 1;
      }
       return n*powerFunction(n, pow-1);
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