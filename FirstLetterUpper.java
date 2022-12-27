//convert each first letter of the string in upper case 

import java.util.*;
 public class FirstLetterUpper{
public static void convert(String str){
    StringBuilder sb=new StringBuilder("");

    char ch=Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' '){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
    }
   System.out.println(sb.toString());
}
public static void main(String[] args) {
    String str="chaitanya gore is my name h";
    convert(str);
}
 }