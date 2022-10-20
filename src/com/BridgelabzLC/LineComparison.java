package com.BridgelabzLC;
import java.util.*;
public class LineComparison {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value X1");
        int x1= sc.nextInt();
        System.out.println("Enter the value y1");
        int y1= sc.nextInt();
        System.out.println("Enter the value X2");
        int x2= sc.nextInt();
        System.out.println("Enter the value y2");
        int y2= sc.nextInt();
        double length = Math.sqrt((x2-x1)*2 + (y2-y1)*2);
        System.out.println("Length: "+ length);

    }
}
