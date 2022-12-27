//check if the number is palindrome number or not 

import java.util.*;

public class Palindrome{

    public static void Check(int num){
       int no=0;
       int rem;
       int x=num;
       while(num>0){            //logic for palindrome numbers
       rem=num%10;
       no=(int)(no*10)+rem;
       num=num/10;       
       }
      if(x==no){
        System.out.print("Entered number is palindrome number");
      }
      else{
        System.out.println("Entered number is not palindrome number");
      }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entery number: ");
        int n=sc.nextInt();
        Check(n);
    }
}