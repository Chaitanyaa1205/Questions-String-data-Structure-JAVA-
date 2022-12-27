//program to check weather the two given string are anagram strings or not 

import java.util.*;

public class Anagram_Strings{
    public static void check(String str1,String str2){

    //convert the string in lower case first 
      str1=str1.toLowerCase();
      str2=str2.toLowerCase();

    // converted the strings into the character array
      char arr1[]=str1.toCharArray();
      char arr2[]=str2.toCharArray();

    //sorted the character array
     Arrays.sort(arr1);
     Arrays.sort(arr2);

    //compare the character array

    boolean result=Arrays.equals(arr1,arr2);

    if(result){
        System.out.println(str1+" "+str2+" are anagram strings");
    }
    else{
        System.out.println(str1+" "+str2+" are not anagram strings");
    }



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter two strings ");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        check(s1,s2);
        sc.close();

    }
}