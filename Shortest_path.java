// program to find the shortest distance of the point travelled directions 

// given a route contating 4 directions (E,W,N,S) find the shortest path to reach the destination (form origin)\


import java.util.*;

public class Shortest_path
{

    public static int find (String str){
        int x=0,y=0;
     for(int i=0;i<str.length();i++){
        char dir=str.charAt(i);
        if(dir=='N'){
            y++;
        }
        else if(dir=='S'){
            y--;
        }
        else if(dir=='E'){
            x++;
        }
        else if(dir=='W'){
            x--;
        }
     }

     int distance=((x*x)+(y*y));
     return (int)Math.sqrt(distance);
    }
    public static void main(String[] args) {
        String s="WNEENESENNN";
        System.out.println(find(s));
    }
}