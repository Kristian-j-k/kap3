package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// convert inch to cm

    final double CM_PER_INCH = 2.54;
    int inch;
    double cm;

    Scanner in =new Scanner(System.in);
    System.out.print("How many inches? ");
    inch = in.nextInt();

    cm = inch * CM_PER_INCH;
    System.out.print(inch+" in = ");
    System.out.println(cm+" cm");
    System.out.println();

    //TESTER decimal output
    System.out.println(4.0/3.0);
    System.out.printf("hej %.3f \n", 4.0/3.0);

    int inch2 =100;
    double cm2=inch2*CM_PER_INCH;
        System.out.printf("%d in = %.3f cm\n",inch2,cm2);
    //skriver hex
        System.out.printf("100 skrevet som hexadecimal %x",100);
        System.out.println("\n");

    //forkorter double til int
    double pi = 3.14159;
    int x = (int) pi;
        System.out.println(pi);
        System.out.println(x);
    x = (int) pi*20;
        System.out.println(x);
    double f = pi*20;
        System.out.println(f);
    inch = (int)(pi*20);
        System.out.printf("%d \n",inch);

    }
}
