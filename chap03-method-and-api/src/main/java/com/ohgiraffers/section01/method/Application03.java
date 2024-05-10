package main.java.com.ohgiraffers.section01.method;

public class Application03 {

    int test =10; //전역변수
    public static void main(String[] args) {


        /*
        * 변수의 종류
        *
        * 1. 지역 변수 - 메인 메서드 안에서만 실행되는 것, 다른 메서드에서는 실행안됨
        * 2. 매개 변수 - 전달 받는 변수
        * 3. 전역 변수 (필드) -
        * 4. 클래스(static) 변tn
        *
        * */
//        int a=10;
//        int b=20; //지역변수


        Application03 app3= new Application03();
        app3.testMethod(28);
//        app3.testMethod(20,30); 전달인자에 개수가 다르면 오류
//        app3.testMethod("40");  전달인자에 다른 타입 오면 오류, 현재는 int 타입
//        app3.testMethod(); 매개변수가 있으면 꼭 전달받은 것을 입력해줘야함

        /*변수에 저장한 값 전달 테스트*/
        int age=20;
        app3.testMethod(age);

        /*자동 형 변환을 이용한 값 전달 테스트*/

        byte byteage = 20;
        app3.testMethod(byteage);

        /*강제 형 변환을 이용한 값 전달 테스트*/
        long longAge=30;
        app3.testMethod((int)longAge);

        /*연산 결과를 이용한 값 전달 테스트*/
        app3.testMethod(byteage*2);
    }

//    public void method (int a, int b) { // 매개 변수

    public void testMethod(int age){
        System.out.println("당신의 나이는"+age +"세 입니다. ");

    }


}
