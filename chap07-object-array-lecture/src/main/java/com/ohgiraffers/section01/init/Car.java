package main.java.com.ohgiraffers.section01.init;

public class Car {

    private String modeName;

    private int maxSpeed;

    public Car(String modeName, int maxSpeed) {
        this.modeName = modeName;
        this.maxSpeed = maxSpeed;
    }
    public void driveMaxSpped(){
        System.out.println(modeName+"이가 최고시속"+maxSpeed+"km/h 로 달려갑니다");
    }
}
