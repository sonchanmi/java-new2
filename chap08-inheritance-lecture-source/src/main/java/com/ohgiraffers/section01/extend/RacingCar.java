package main.java.com.ohgiraffers.section01.extend;

public class RacingCar extends Car { //자식메소드

    public RacingCar() {
        System.out.println("RacingCar 클래스의 기본 생성자를 호출" ); // 부모생성자도 자동으로 출력됨
    }

    @Override
    public void run() {
        System.out.println("레이싱카가 전속력으로 질주 합니다. ");
    }

    @Override
    public void soungHorn() {
        System.out.println("레이싱카는 경적을 울릴 수 없습니다. ");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다. ");
    }
}
