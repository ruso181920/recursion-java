
import java.util.Scanner;

public class PrintNumDecresing {
    public static void decreasingNum(int n) {
        if(n<=0) {
         System.out.println("Enter number greater than 0.");
         
        }
        else{
            System.out.println(n);
            decreasingNum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("enter the num: ");
        int num=inp.nextInt();
            decreasingNum(num);
    }
}
