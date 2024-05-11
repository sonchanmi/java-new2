package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {
    public void testifelseif() {


        /*
         *[if-else-if]
         *
         * if(조건식1){
         *
         * 조건식 1이 true일 때 실행할 명령문
         * }else if(조건식2){
         *  조건식 1이 false 이고 조거식 2가 true일 떄 실행할 명령문
         *
         * }else{
         * 위의 조건 2개가 모두 false인 경우 실행할 명령문
         * }
         * */


        //금도끼 은도끼 동화에서 산신령이 어떤 도끼가 나무꾼의 도끼인지를 물어보는 시나리오 코드를 만들어보자
        // string은 스캐너 안에서 입력 받을때, 문자열로 구분 못함 이퀄스 사용해줌

        Scanner scr = new Scanner(System.in);
        System.out.println("어느 도끼가 너의 도끼냐? (1.금도끼 , 2.은도끼 , 3.쇠도끼)");
        int num = scr.nextInt();


        if (num == 1) {
            System.out.println("응 거짓말 하지마");
        }else if (num == 2){
            System.out.println("응 거짓말 하지마");

        }else if (num == 3){
            System.out.println("용하다 다주마");
        }else{
            System.out.println("쯧쯧...");
        }
        System.out.println("그렇게 산신령은 연못속으로 갔다");
    }


    public void testifelseif2(){

        /*
        * ohgiraffers 대학의 00교수님은 학생들의 시험 성적을 수기로 계산해서 학점 등급을 매기는 체점방식을 사용하고 있었다.
        * 90점 이상이면 'a', 89점 이상이면 'b', 70점 이상이면 'c' , 60점 이상이면 'd'를
        * 60점 미만인 경우에는 'f'를 학점 등급으로 하는 기준이다
        * 추가로 각 등ㄱㅂ의 중간점수(95,85,75,65)를 넘는 경우는"+" 를 붙여서 세분화 하다보니 신경쓸게 이만저만이 아니다
        * 그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다/
        *
        * */

        Scanner scr= new Scanner(System.in);
        System.out.println("학생이름을 입력해 주세요");
        String name=scr.nextLine();

        System.out.println("학생의 점수를 입력해 주세요");
        int points=scr.nextInt();



        String grade="";

        if(points>=90){
            grade = "A";
            if (points>=95){
                grade= "+";

            }

        }else if(points>=80){
            grade = "B";
            if (points>=85){
                grade = "+";
            }
        }else if(points>=70){
            grade = "C";
            if (points>=75){
                grade = "+";
            }
        }else if(points>=60){
            grade = "D";
            if(points>=65){
                grade="+";
            }
        }else{
            grade="F";
        }

        if(grade.equals("F")){

            System.out.println(name+"학생은 f등급입니다. 재수강하세요");
        }else{

            System.out.println(name+"학생 점수는"+points+"점이고"+grade+"점입니다. ");
        }

    }



}
