
import java.util.Scanner;

public class FirstOccurance {
     public static int checkFirstOccurance(int arr[],int n,int i) {
       if(i==arr.length) {
        return -1;
       }
       if(arr[i]==n) {
         return i;
    }
       return checkFirstOccurance(arr, n, i+1);
      
    }

    public static void main(String[] args) {
    int arr[]={3,5,2,45,6,7,65,45,32};
    Scanner inp=new Scanner(System.in);
    System.out.print("Enter key to search :");
    int target=inp.nextInt();
    int index=0;
    if(checkFirstOccurance(arr, target, index)>=0) { 
    System.out.println("Found element at index : "+checkFirstOccurance(arr, target,index));

    }
    else{
      System.out.println("not found");
    }
  }
}


