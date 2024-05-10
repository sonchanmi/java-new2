package main.java.com.ohgiraffers.section01.method;

public class Application07 {
    public static void main(String[] args) {


        /*
        * 실습
        * 두 수를 매개변수로 받아 더한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 나누 값을 반환하는 메소드
        *
        * 반환받아서 메인 메소드에 system.out.println을 이용해 출력하기
        *
        * */

        Application07 result = new Application07();
        int plus =result.plus(1,2);
        System.out.println("더한값"+plus);

        int minus=result.minus(2,1);
        System.out.println("뺀값"+minus);

        int multiply=result.multiply(2,2);
        System.out.println("곱한값"+multiply);

        int division=result.division(6,3);
        System.out.println("나눈값"+division);


    }
    public int plus(int a,int b){
        return a+b;

    }

    public int minus(int a,int b){
        return a-b;
    }

    public int multiply(int a,int b){
        return a*b;
    }

    public int division(int a,int b){
        return a/b;

    }
}
