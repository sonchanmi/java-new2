package main.java.com.ohgiraffers.section01.excepction;

public class Application02 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();


            try {
                et.checkEnoughMony(10000, 50000);
                System.out.println("============ 상품 구입 가능 ==========");
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("프로그램종료");


    }
}
