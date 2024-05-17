package main.java.com.ohgiraffers.section01.extend;

public class Car { //부모메소드

    private boolean runningStaus;


    public Car() {
        System.out.println("car 클래스의 기본 생성자 호출"); // new Car 기본으로 출력됨 < 그게 기본생성자임
    }


    public void run(){
        //달리는 기능
        runningStaus= true;
        System.out.println("자동차가 달립니다. ");

    }

    public boolean isRunning(){
        //주행상태 반환 기능
        return runningStaus;
    }

    public void soungHorn(){
        //주행중일 때 경적 울리는 기능
        if(isRunning()){ // 불리언 타입으로 반환중인데 , 불리언 타입의 기본형을 false로 출력됨
            System.out.println("빵");
        }else{
            System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다. ");
        }
    }
    public void stop(){
        runningStaus= false;
        System.out.println("자동차가 멈춥니다. ");
    }
}
