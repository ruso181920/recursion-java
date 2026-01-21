public class CheckSortedArray {
    public static boolean  checkSortedArray(int arr[],int i) {
        if(i==arr.length-1) {
            return true;
        }
        if(arr[i]>arr[i+1]) {
            return false;
        }
        return checkSortedArray(arr, i+1);
    }

    public static void main(String[] args) {
    int arr[]={-5,-4};
    int index=0;
    System.out.println(checkSortedArray(arr,index)); 
    }
}
