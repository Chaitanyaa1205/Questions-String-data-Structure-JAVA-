// program for String compression (Question asked for interview in amazon)


import java.util.*;

public class Compression{

    public static void compress(String str){
        StringBuilder newstring=new StringBuilder("");
        Integer count=1;
        for(int i=0;i<str.length();i++){
            newstring.append(str.charAt(i));
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
           if(count>1){
           newstring.append(count.toString());
        }
    }
        System.out.println(newstring);
       
    }
    public static void main(String[] args) {
String str="abc";
compress(str);
    }
}