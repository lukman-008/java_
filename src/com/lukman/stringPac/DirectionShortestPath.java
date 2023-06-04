package com.lukman.stringPac;

public class DirectionShortestPath {
    public static float shortestPath(String str)
    {
        int x =0,y=0;
        for (int i = 0; i < str.length(); i++) {
            //EAST
            if(str.charAt(i)=='W') x++;
            //WEST
            else if (str.charAt(i)=='E') x--;
            //NORTH
            else if (str.charAt(i)=='N') y++;
            //south
            else if (str.charAt(i)=='S') y--;
        }
        int result= x*x+y*y;
        return (float) Math.sqrt(result);
    }
    public static void main(String[] args) {
            String s1 = "WNEENESENNN";
        System.out.println( shortestPath(s1));
    }
}
