package com.company;

import java.util.Scanner;


public class CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String [] a = console.nextLine().split(" ");
        int Ax= Integer.parseInt(a[0]);
        int Ay = Integer.parseInt(a[1]);
        String [] b = console.nextLine().split(" ");
        int Bx = Integer.parseInt(b[0]);
        int By = Integer.parseInt(b[1]);
        String [] c = console.nextLine().split(" ");
        int Cx = Integer.parseInt(c[0]);
        int Cy = Integer.parseInt(c[1]);
        int area = (Ax*(By-Cy) + Bx*(Cy-Ay)+Cx*(Ay-By))/2;
        if (area<0){
            area*=-1;
        }
        System.out.println(area);
    }


}
