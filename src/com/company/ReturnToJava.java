package com.company;
import java.util.Scanner;
public class ReturnToJava {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        /*
        //Question 1
        int x;
        System.out.println("Input an int in inches");
        x= keyboard.nextInt();
        System.out.println(x*.0254);
         */

        q1();

        /*
        //Question 2
        int[] numbers = new int[5];
        for(int i=0; i<5; i++) {
            System.out.println("input an int");
            numbers[i] = keyboard.nextInt();
        }
        double y = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
        System.out.println(y);
        System.out.println(y/5);
         */

        q2();

        //Question 3
        int[] numbers2 = new int[5];
        for(int i=0; i<5; i++){
            numbers2[i] =i+1;
        }
        double y = numbers2[0]+numbers2[1]+numbers2[2]+numbers2[3]+numbers2[4];
        System.out.println(y);

        q4();
    }

    public static void q1(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input an int in inches");
        int x= keyboard.nextInt();
        System.out.println(x*.0254);
    }

    public static void q2(){
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i=0; i<5; i++) {
            System.out.println("input an int");
            numbers[i] = keyboard.nextInt();
        }
        double y = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
        System.out.println(y);
        System.out.println(y/5);
    }

    public static void q4(){
        Circle circle1;

        double radius = 5.0;
        double centerX = 2.0;
        double centerY = 3.0;

        circle1 = new Circle(radius, centerX, centerY);

        circle1.computeArea();
    }

}
