package com.BridgelabzLC;
import java.util.Scanner;
import java.lang.reflect.*;
 class Calc {
     static void calculate(int X1, int Y1, int X2, int Y2, int X3, int Y3, int X4, int Y4) {
        double length1 = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
        System.out.println("Length 1: " + length1);
        double length2 = Math.sqrt(Math.pow((X4 - X3), 2) + Math.pow((Y4 - Y3), 2));
        System.out.println("Length 2: " + length2);
        String l1 = String.valueOf(length1);
        String l2 = String.valueOf(length2);
        if (l1.compareTo(l2) == 0) {
            System.out.println("Both Lines are of Equal Length");
        } else {
            System.out.println("Both Lines are of different Lengths");
        }
    }
    }
    public class LineComparison extends Calc{
    public static void main(String args[]){
        System.out.println("Provide the Co-ordinates of line1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value X1");
        int x1= sc.nextInt();
        System.out.println("Enter the value y1");
        int y1= sc.nextInt();
        System.out.println("Enter the value X2");
        int x2= sc.nextInt();
        System.out.println("Enter the value y2");
        int y2= sc.nextInt();
                                                                 //taking value for second line segment
        System.out.println("Provide the Co-ordinates of line2");
        System.out.println("Enter the value X3");
        int x3= sc.nextInt();
        System.out.println("Enter the value y3");
        int y3= sc.nextInt();
        System.out.println("Enter the value X4");
        int x4= sc.nextInt();
        System.out.println("Enter the value y4");
        int y4= sc.nextInt();
        calculate(x1, y1, x2, y2, x3, y3, x4, y4);

}}
