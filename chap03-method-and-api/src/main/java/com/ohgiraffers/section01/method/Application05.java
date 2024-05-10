package main.java.com.ohgiraffers.section01.method;

public class Application05 {
    public static void main(String[] args) {

        /*
        * return ?
        *
        * 모든 메소드 내부에 return;이 존재한다.
        * void 메소드의 경우 return을 명시적으로 작성하지 않아도 마지막 줄에 컴파일러가 자동으로 추가해준다.
        * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
        *
        * */
        System.out.println("main() 메서드 시작함...");

        Application05 app5 = new Application05();
        app5.testmethod();

        System.out.println("main() 메서드 종료함.....");


    }


    public void testmethod(){

        System.out.println("testmethod() 동작확인");

        return; //생략가능 원래 실행되고 있는 것임

       //System.out.println("test");  return 해서 끝났기 때문에, 값을 입력해도 실행되지 않음
    }
}
