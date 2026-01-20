

import java.util.*;
public class PrintNumIncreasing {
    

    public static void increasingNum(int n) {
        
        if(n<=0){
            System.out.println("Enter number greater than 0.");
            return;
        }
         increasingNum(n-1);
          System.out.println(n);
          

        }
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("enter the num: ");
        int num=inp.nextInt();
            increasingNum(num);
    }
}


