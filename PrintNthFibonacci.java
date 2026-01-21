import java.util.Scanner;

public class PrintNthFibonacci {
      public static int printNthFibonacci(int n) {
      if(n==0 || n==1){
        return n;
      }
      else { 

      return printNthFibonacci(n-1)+printNthFibonacci(n-2);
      }
   
}
    public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
        System.out.print("enter the num: ");
        int num=inp.nextInt();
        System.out.println( num +" th fibonacci number  is : "+printNthFibonacci(num));
    }
}
