package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testswitch(){

        /*
        * [switch문 표현식]
        *
        * switch(비교할변수){
        * case 비교값 1 : 비교값 1과 일치하는 경우 실행할 구문;break;
        * case 비교값 2 : 비교값 2와 일치하는 경우 실행할 구문;break;
        * case 비교값 3 : 비교값 3와 일치하는 경우 실행할 구문;break;
        * defualt : case 모두에 해당하지 않는 경우 실행할 구문;break;
        * }
        *
        * 여러개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사하다
        * 따라서 일부 호환이 가능하다
        * 하지만, switch 문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
        * 실수와 논리는 비교할 수 없다.
        * 또한 정확하게 일치하느 경우에만 비교할 수 있으며,대소비교를 할수 없다.
        * case절에는 변수를 사용하지 못한다..
        * */

        //정수 두 개와 연산 기호를 입력 받아서 , 두 숫자와 연산 결과를 출력해보는 간단한 계산기 만들기

        Scanner scr = new Scanner(System.in);
        System.out.println("첫번째 정수입력");
        int first = scr.nextInt();
        System.out.println("두번째 정수입력");
        int second = scr.nextInt();

        System.out.println("연산기호 입력(+,-,*,/,%)");
        char op = scr.next().charAt(0);

     int result =0;

     switch (op){
         case '+' : result = first + second; break;
         case '-' : result = first - second; break;
         case '*' : result = first * second; break;
         case '/' : result = first / second; break;
         case '%' : result = first % second; break;
     }


        System.out.println(first + ""+op+""+second+"="+result);


    }

    public void testswitchmachine(){

        System.out.println("===================자판기===========");
        System.out.println("사이다(1000) 콜라(12000) 환타(11000) 박카스(2999) 핫싯스(200)");

        Scanner scr = new Scanner(System.in);
        String drink= scr.nextLine();

        int price =0;

        switch (drink){
            case "사이다":price=1000; break;
            case "콜라":price=12000; break;
            case "환타":price=11000; break;
            case "박카스":price=2999; break;
            case "핫식스":price=200; break;
            default:
                System.out.println("그런음료수는 없음"); break;


        }

        System.out.println(drink+"를 선택하셨습니다");
        System.out.println(price+"원을 투입해 주세요");

    }

}
