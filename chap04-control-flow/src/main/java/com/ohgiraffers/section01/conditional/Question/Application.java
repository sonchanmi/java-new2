package main.java.com.ohgiraffers.section01.conditional.Question;

import java.util.Scanner;

public class Application {
    public static void main (String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("a과목");
        int num1 = sc.nextInt();

        System.out.println("b과목");
        int num2 = sc.nextInt();

        System.out.println("c과목");
        int num3 = sc.nextInt();

        Question a = new Question();

       int num4 = a.q1(num1,num2,num3);
        a.q2(num1,num2,num3,num4);



    }
}
