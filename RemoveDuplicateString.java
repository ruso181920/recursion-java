
import java.util.Scanner;

public class RemoveDuplicateString {
   public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]) {
    if(idx==str.length()){
        System.out.println(newStr);
        return;
    }
    char currChar=str.charAt(idx);
    if(map[currChar-'a']==true) {
        //duplicate
        removeDuplicates(str, idx+1, newStr, map);
    }
    else{
        map[currChar-'a']=true;
        removeDuplicates(str, idx+1, newStr.append(currChar), map);
    }
   }   

   public static void main(String[] args) {
      Scanner text=new Scanner(System.in);
      System.out.print("Enter the text : ");
       String str=text.nextLine();
     removeDuplicates(str, 0, new StringBuilder(""),new boolean[26]);

   }
}
