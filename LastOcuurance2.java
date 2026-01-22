import java.util.Scanner;

public class LastOcuurance2 {
     public static int checkLastOccurance(int arr[],int key,int i) {
     if(i==arr.length) {
        return -1;
     }
      int isFound=checkLastOccurance(arr,key,i+1) ;
      if(isFound==-1 && arr[i]==key){
        return i;
      }
      return isFound;

    }

    public static void main(String[] args) {
    int arr[]={3,3,3,3,3};
    Scanner inp=new Scanner(System.in);
    System.out.print("Enter key to search :");
    int target=inp.nextInt();
    int index=0;
    if(checkLastOccurance(arr, target, index)<0) { 
         System.out.println("not found");

    }
    else{
         System.out.println("Found element at index : "+checkLastOccurance(arr, target,index));
    }
  }
}
