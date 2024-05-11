package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testfor() {

        /*
         * [for문 표현식]
         * for(초기식;조건식;증감식){
         * 조건을 만족하는 경우 수행할 구문 (반복할 구문);
         * }
         *
         *
         * */

        //1부터 10까지 증가시키면서 출력될 기본 반복문
        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

        }
    }
        public void testforex() {
            //10명의 학생 이름을 받아 출력해보자
            Scanner scr = new Scanner(System.in);

            System.out.println("1번째 학생의 이름을 입력해 주세요");
            String student1 = scr.nextLine();
            System.out.println("1번째 학생의 이름은" + student1 + "입니다.");

            /*

             *  1.안내문구
             2. 학생의 이름을 받는 부분
             3.이름출력
             *
             */

            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "번째 학생의 이름을 입력해 주세요");
                String student = scr.nextLine();
                System.out.println("번째 학상의 이름은" + student + "입니다");


            }

        }


        public void testforex2(){

            //1~10의 합계를 구하시오.

        int num1= 1;
        int num2= 2;
        int num3= 3;
        int num4= 4;
        int num5= 5;
        int num6= 6;
        int num7= 7;
        int num8= 8;
        int num9= 9;
        int num10= 10;

        int sum =0;

        // sum 에 변수로 선언한 값 담기

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        sum += num6;
        sum += num7;
        sum += num8;
        sum += num9;
        sum += num10;

            System.out.println(sum);

            /*
            * 1씩 증가하는 값을 담기
            * smu에 누적시키기
            * 10번반복
            *
            *
            * */

            int sum2=0;

            for (int i=1;i<=10;i++){

                sum2+=i;

            }

            System.out.println(sum2);
        }

        public void testforex3(){


        // 숫자 두 개를 입력 받아 작은수부터 큰 수까지의 합계를 구한다.
            //스캐너를 이용해 숫자 두개 입력 받기
            //큰 수 확인
            //작은 수를 초기식에 넣고 큰 수가 될때까지 반복


     Scanner scr = new Scanner(System.in);
            System.out.println("첫번째 정수 입력");
            int first=scr.nextInt();
            System.out.println("두번째 정수 입력");
            int second=scr.nextInt();

            //결과 담을 변수를 만든다.
            int sum=0;
            if(first>second){

                for(int i = second; i<=first; i++){
                    sum+=i;

                }

            }else{

                for(int i = first; i<=second; i++){
                    sum+=i;

                }

            }
         System.out.println(sum);


        }



        public void gugudan(){

        // 2~9 사이의 값을 입력 받아
            //2~9사이의 값이 제대로 들어 왔으면 해당 구구단을 출력하고,
            //그렇지 않은 경우는 "반드시 2~9사이의 양수를 입력해야 한다. "라고 출력

            /*
            *  5*1=5
            *  5*2=10
            *  5*3=15
            *  5*4=20
            *  5*5=25
            *  5*6=30
            *  5*7=35
               5*=40
               *
            * */


            Scanner src = new Scanner(System.in);
            System.out.println("출력할 구구단의 단 수를 입력해 주세요");
            int dan = src.nextInt();


            if(dan>=2 && dan<=9) {
                for (int i = 1; i <= 10; i++) {

                    System.out.println(dan + "*" + i + "=" + (dan * i));


                }
            }else{
                System.out.println("반드시 2~9사이의 값을 입력해 주어야 합니다.");

            }

        }

    }


