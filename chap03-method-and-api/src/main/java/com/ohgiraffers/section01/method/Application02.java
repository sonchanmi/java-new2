package main.java.com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args) {


        System.out.println("main() 메소드 시작됨..........");

        Application02 app2=new Application02();
        app2.methodA();
        app2.methodB();


        System.out.println("main() 메소드 종료됨...........");


    }

    public void methodA(){


        System.out.println("method ()호출됨.a...");

        System.out.println("method() 종료됨..a..");


    }
    public void methodB(){

        System.out.println("method() 호출됨..b..");

        System.out.println("method() 종료됨..b..");

    }


}
