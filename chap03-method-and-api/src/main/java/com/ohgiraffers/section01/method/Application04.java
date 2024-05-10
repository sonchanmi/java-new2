package main.java.com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args) {


        /*여러 개의 전달인자를 이용한 메소드 호출 테스트*/

        Application04 app4 = new Application04();
        app4.testmetod("홍길동",20,'남');
//        app4.testmetod(20," 유관순",'여'); 매개 변수는 순서대로 입력해줘야함

        /*변수에 저장된 값을 전달하여 호출 할 수 있다. */
        String name="유관순";
        int age=20;
        char gender='여';
        app4.testmetod(name,age,gender);

    }

    /**
     *
     *  이름과 나이와 성별을 전달 받아 한 번에 출력해주는 기능을 제공
     *
     * @param name 출력할 이름을 전달해 주세요
     * @param age 출력하 나이를 전달해 주세요
     * @param gender 출력할 성별을 전달해 주세요. 성별은 변경되지 않음
     *
     * */
    public void testmetod(String name,int age, final char gender){

        /*name="홍길동";
                age=20;
        gender='s'; */

        System.out.println("당신의 이름은 "+ name+"이고"+ "나이는"+age+
                "세이며, 성별은"+ gender);

    }
}
