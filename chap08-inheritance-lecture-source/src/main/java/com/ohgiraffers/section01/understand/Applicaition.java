package main.java.com.ohgiraffers.section01.understand;

import main.java.com.ohgiraffers.section01.understand.car.Car;
import main.java.com.ohgiraffers.section01.understand.car.ElectriCar;
import main.java.com.ohgiraffers.section01.understand.car.OldCar;
import main.java.com.ohgiraffers.section01.understand.seller.Seller;

public class Applicaition {
    public static void main(String[] args) {

        System.out.println("자동차 판매 프로그램입니다 ");
        System.out.println("전기차");
        ElectriCar ionic1 = new ElectriCar("H",1000,"ioninc1","1000km");
        ElectriCar ionic2 = new ElectriCar("H",1500,"ioninc2","1500km");
        ElectriCar ionic3 = new ElectriCar("H",2000,"ioninc3","2000km");

        System.out.println("내연기관 자동차");
        OldCar porter = new OldCar("H",1500,"porter","diesel");
        OldCar avante = new OldCar("H",1500,"avante","gosline");
        OldCar sonata = new OldCar("H",2000,"sonata","gosline");

        System.out.println("영업 사원 입사");
        Seller seller = new Seller("홍길동");

        Car[] cars = {porter,ionic1,avante,sonata,ionic3};

        seller.sale(cars);
        System.out.println("결산:"+seller.toString());


    }
}
