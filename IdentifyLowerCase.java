// program for count how many times the lower case vowels  are entered by the user 

import java.util.*;

public class IdentifyLowerCase{

    public static int identify(String str){
        int count=0;
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'){
            count++;

        }
      }
      return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=sc.nextLine();
        System.out.println(identify(str));
    }
}
