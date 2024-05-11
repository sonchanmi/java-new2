package main.java.com.ohgiraffers.section01.conditional.Question;

import java.util.Scanner;

public class Question {

    /*
     *  a,b,c 세 과목의 점수를 스캐너로 입력 받고 세 과목의 점수를
     * 만든 메소드의 매개 변수로 전달해 평균을 계산, 평균을 이용하여 합격/ 불합격 처리를 하는 기능을 구현하세요
     * (합격 조건: 세 과목의 점수가 각각 40점을 넘어야하고, 평균은 60점을 넘어야 한다)
     * 합격했을 경우 그 학생의 평균 점수와 "합격입니다!" 를 출력,
     * 불합격인 경우에는 "불합격입니다!" 출력
     * */


    // 1. 세 과목 점수 입력받기
    //1-1 스캐너 객체를 생성하기 1-1,1-3 3번반복
    //1-2 사용자에게 점수 입력 메세지
    //1-3 점수 저장하기

    // 2. 메소드 만들기 매개변수가 3개 만들기
    // 2-1매개변수로 전달받은 값이 40이 넘어서는지 확인
    // 2-2
    // 3. 합격과 불합격 처리
    public int q1(int num1, int num2,int num3) {
        // 메소드 나누기 평균을을 구하는 메소드 따로, 합격을 구하는메소드를 따로
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("a과목");
//        int num1 = sc.nextInt();
//
//        System.out.println("b과목");
//        int num2 = sc.nextInt();
//
//        System.out.println("c과목");
//        int num3 = sc.nextInt();

        int num4 = (num1 + num2 + num3) / 3;

//        q2(num1, num2, num3, num4);
       return num4;
    }


    public void q2(int a,int b,int c,int d) {
        if (a >= 40 && b >= 40 && c >= 40) {
            if (d >= 60) {

                System.out.println("합격입니다");
            } else {

                System.out.println("평균을 미달로 불합격 ㅋ");

            }

        } else {
            System.out.println("불합격입니다");
        }


    }
}















