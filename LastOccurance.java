import java.util.Scanner;

public class LastOccurance {
     public static int checkLastOccurance(int arr[],int n,int i) {
       if(i<0) {
        return -1;
       }
       if(arr[i]==n) {
         return i;

    }
       return checkLastOccurance(arr, n, i-1);
      
    }

    public static void main(String[] args) {
    int arr[]={3,5,2,45,6,3,7,65,45,32};
    Scanner inp=new Scanner(System.in);
    System.out.print("Enter key to search :");
    int target=inp.nextInt();
    int index=arr.length-1;
    if(checkLastOccurance(arr, target, index)<0) { 
         System.out.println("not found");

    }
    else{
         System.out.println("Found element at index : "+checkLastOccurance(arr, target,index));
    }
  }
}
