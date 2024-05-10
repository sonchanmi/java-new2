package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {



        /*
        * java.util.Scanner
        * 콘설 화면에 값을 입력 받는 기능 제공
        *
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력 해주세요:");

        String name=sc.nextLine();
        System.out.println("안녕하세요"+name+"님!");

        System.out.println("나이를 입력하세요");
        int age=sc.nextInt();
        System.out.println("입력하신 나이는"+age+"세 입니다");  // 자료형보다 큰 값을 입력하면 에러뜸

        System.out.println("원하는 금액을 입력해주세요");
        long lnum=sc.nextLong();
        System.out.println("원하는long타입 금액"+lnum);

        System.out.println("실수를 입력하기");
        double number=sc.nextDouble();
        System.out.println("원하는 실수는"+number);

        System.out.println("참과 거짓 중에 한가지를 true아니면 false로 입력해주쇼");
        boolean isTrue=sc.nextBoolean();
        System.out.println((isTrue)?"참":"거짓");




        //프로그램 은 0번부터 시작함
        System.out.println("아무 문자나 입력 해주세요");
        char ch=sc.nextLine().charAt(0);
        System.out.println(ch);


    }


}
