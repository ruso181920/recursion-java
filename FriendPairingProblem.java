import java.util.Scanner;

public class FriendPairingProblem {
    public static int friendPairing(int n) {
        if(n==1 || n==2) {
            return n;
        }
        //choice
        //single
        // 
        return friendPairing(n-1)+(n-1)*friendPairing(n-2);
    }
    public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
      System.out.print("Enter the no of friends : ");
      int noOfFriend=inp.nextInt();
      System.out.println("no of ways to pair : "+friendPairing(noOfFriend));
    }
}
