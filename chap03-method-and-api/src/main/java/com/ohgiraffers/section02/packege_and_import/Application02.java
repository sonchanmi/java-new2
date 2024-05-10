package main.java.com.ohgiraffers.section02.packege_and_import;

import main.java.com.ohgiraffers.section01.method.Calculator;

public class Application02 {
    public static void main(String[] args) {


        /*
        * 임포트
        * 서로 다른 패키지에서 존재하는 클래스를 사용하는 경우에는 패키지 명을 호함한 풀 클래스 이름을 사용해야 한다.
        * 하지만 매번 다른 클래스의 패키지 명까지 기술하기에는 번거롭다.
        * 그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
        *
        * */

        Calculator cale =new Calculator();
        int min=cale.minNumberof(50,60);

        int max=Calculator.maxNumber(50,60);
        System.out.println(max);

//        int max2= maxNumber(100,200);
//        System.out.println(max2);
    }

}
