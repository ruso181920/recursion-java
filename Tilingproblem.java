import java.util.Scanner;

public class Tilingproblem {
    public static int tilingproblem (int n) {
        if(n==0 || n==1) {
            return 1;
        }
        // for vertical arrangement
        int verticalWays=tilingproblem(n-1);

        // for horizontal arrangement
        int horizontaWays=tilingproblem(n-2);

        return verticalWays+horizontaWays;
    }
    public static void main(String[] args) {
          Scanner inp=new Scanner(System.in);
        System.out.print("Enter n :");
        int number=inp.nextInt();
      System.out.println(" No of ways to organise tiles: "+ tilingproblem(number));
  
    }

    
}
