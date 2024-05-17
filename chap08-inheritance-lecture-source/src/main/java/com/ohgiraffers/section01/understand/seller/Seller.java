package main.java.com.ohgiraffers.section01.understand.seller;

import main.java.com.ohgiraffers.section01.understand.car.Car;
import main.java.com.ohgiraffers.section01.understand.car.ElectriCar;
import main.java.com.ohgiraffers.section01.understand.car.OldCar;

public class Seller {

    private String name;

    private double result;

    public Seller(String name) {
        this.name = name;
    }
    public void sale(Car[] cars){
       for(Car car : cars){//cars를 하나씩 꺼내서 car에 넣어줌
           if(car instanceof ElectriCar){
               ElectriCar electriCar=(ElectriCar)car; //부모를 자식에게 넣어줄때는 강제로 형변환 해줘야함
               System.out.println(electriCar.getBrand()+"사의"+electriCar.getName()+"를 판매하였습니다. ");
               result += electriCar.getPrice();
           }else{
               OldCar oldCar=(OldCar)car;
               System.out.println(oldCar.getBrand()+ "사의"+ oldCar.getName()+"를 판매하였습니다. ");
               result += oldCar.getPrice();
           }
        }

    }


    @Override
    public String toString() {
        return name +"사원의 총 수수료는 " + result+ "원입니다.";
    }
}
