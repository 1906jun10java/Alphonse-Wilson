package com.revature.codingChallengeFriday;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MagicSquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] square) {
        for (int i = 0; i <square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                //System.out.print(square[i][j]+" ");
            
            }
            //System.out.println();
        }
        int top = square[0][0]+square[0][1]+square[0][2];
        int left = square[0][0]+square[1][0]+square[2][0];
        int right = square[0][2]+square[1][2]+square[2][2];
        int bottom = square[2][0]+square[2][1]+square[2][2];
        int average = (top+left+right+bottom)/4;
        int answer =0;
        //System.out.println("top:    "+top);
        //System.out.println("left:   "+left);
        //System.out.println("right:  "+right);
        //System.out.println("bottom: "+bottom);
        //System.out.println("average: "+average);
        if(top != average) {
            int difference = average - top;
            answer += (difference * difference)/2;
            square[0][1] = difference + square[0][1];
        }
        if(left != average) {
            int difference = average - left;
            square[1][0] = difference + square[1][0];
        }
        if(right != average) {
            int difference = average - right;
            square[1][2] = difference + square[1][2];
        }
        if(bottom != average) {
            int difference = average - bottom;
            square[2][1] = difference + square[2][1];
        }
        
        for (int i = 0; i <square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
         //       System.out.print(square[i][j]+" ");
            
            }
           // System.out.println();
        }

        
        

                
        
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int [][] square = new int [3][3];
        /*for (int i = 0; i <square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.println("enter interger between 1 and 9 for square index ["+i+"]["+j+"]");
                square[i][j] = scanner.nextInt();
            }
        }*/
        int [][] square1 = {{1,2,3},{1,2,3},{1,2,3}};
        
        System.out.println(formingMagicSquare(square1));
    }
}
