package com.BridgelabzLC;
import java.util.Scanner;
import java.lang.reflect.*;
public class LineComparison {
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
        double length1 = Math.sqrt((x2-x1)*2 + (y2-y1)*2);
        System.out.println("Length: "+ length1);
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
        double length2 = Math.sqrt((x4-x3)*2 + (y4-y3)*2);
        System.out.println("Length: "+ length2);
        String l1 = String.valueOf(length1);
        String l2 = String.valueOf(length2);
if(l1.compareTo(l2)==0){
    System.out.println("Both Lines are of Equal Length");
}
else{
    System.out.println("Both Lines are of different Lengths");
}
    }
}
