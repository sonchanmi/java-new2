package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Application01 {
    public static void main(String[] args) {
        //필드에 올바르지 않은 값이 들어가도 통제가 불가능하다.

        //1번 몬스터 생성
        Monster monmon1= new Monster();
        //이름과 체력 변경
        monmon1.name="두치";
        monmon1.hp=200;

        System.out.println("monmono="+monmon1.name);
        System.out.println("monmono="+monmon1.hp);



        //2번 몬스터 생성
        Monster monmon2= new Monster();
        //이름과 체력 변경
        monmon2.name="뿌꾸";
        monmon2.hp=-200;
        System.out.println("monmon2="+monmon2.name);
        System.out.println("monmon2="+monmon2.hp);



        //3번 몬스터 생성
        Monster monmon3= new Monster();
        monmon3.name="드라큘";
        monmon3.setHp(200);

        System.out.println("monster3= "+monmon3.name);
        System.out.println("monster3="+monmon3.hp);

        //4번 몬스터 생성
        Monster monmon4= new Monster();
        monmon4.name="프랑켄슈타인";
        monmon4.setHp(-1000);

        System.out.println("monmon4 이름= "+monmon4.name);
        System.out.println("monmon4 hp="+monmon4.hp);


    }
}
