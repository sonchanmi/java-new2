package main.java.com.ohgiraffers.section02;

public class Smartphone extends Product {

    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 추상 메소드를 호출함");
    }
    public void printSmartphone() {
        System.out.println("Smartphone 의 print 메소드를 호출함");

    }

}
