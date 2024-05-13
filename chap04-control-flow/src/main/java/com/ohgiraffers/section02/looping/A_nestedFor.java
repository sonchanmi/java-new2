package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void ptritGugudan(){


        //2부터 단을 1단씩 증가시키는 반복문

        //1단씩 증가
        for(int dan=2;dan<10; dan++){

            for(int su=1; su<10;su++){

                System.out.println(dan+"*"+su+"="+(dan*su));
                //1부터 9까지 단에 곱해주기
            }

            System.out.println(" ");
        }

    }
    public void ptritGugudan2(){

        //2~9단 증가

        for(int dan=2;dan<10; dan++){

            ptritGugudan(dan);
            System.out.println("   ");

        }
        //단을 매개변수로 전달


    }
    public void ptritGugudan(int dan) {
        for (int su = 1; su < 10; su++) {

            System.out.println(dan + "*" + su + "=" + (dan * su));
        }
    }


    public void printTraing(){

        //키보드로 정수 하나 입력 받아 해당 정수 만큼 한 행에 "*"을 행의
        //번호개씩 출력하기

        Scanner sce=new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해주세요 :");
        int row = sce.nextInt();

        //출력할 행
        for(int i=1;i<=row;i++){ //행마다 실행할 내용을 반복


            for(int j=1;j<=i;j++){
                        // 행마다 별을 넣어주는 것
                System.out.print("*");
            }
            System.out.println();
        }
        //형 수만큼 별 출력

    }

}
