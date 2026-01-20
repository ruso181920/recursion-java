import java.util.Scanner;

public class PrintNthFibonacci {
      public static int printNthFibonacci(int n) {
      if(n==0){
        return 0;
      }
      else if(n==1) {
        return 1;
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
