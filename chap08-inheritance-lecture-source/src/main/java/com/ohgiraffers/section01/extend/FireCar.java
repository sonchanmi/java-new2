package main.java.com.ohgiraffers.section01.extend;

public class FireCar extends Car{ // Car가 상속인 상태 , 상속이 여러개 이면=다중상속이면 안됨, 자식메소드

    public FireCar() {
        super(); // 자신의 부모인 Car를 생성하는 기능
    }

    @Override
    public void soungHorn() { // 재정의 해서 사용해 주기
        if(isRunning()){
            System.out.println("빠앙 빠아ㅏㅏㅏㅏㅇ~~");
        }else{
            System.out.println("소방차가 주행중이 아닙니다. ");
        }
    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견햇습니다. 물을 뿌립니다. ");
    }
}
