package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Question {
    public static void main(String[] args){


        //자판기 만들기


     /*
     * 원하는 음료수를 입력 받는다
     *
     * 음료수는 사이다, 콜라, 환타, 박카스, 학싯스
     *         500   600  700   800    900
     *
     * 잘못된 음료수를 선택한 경우는 다시 입력 받는다.
     *
     * 계산하시겠습니다? (y,n)
     * y
     * 총 금액은 ~입니다.
     *
     *
     * 음료수를 더 선택해 주세요
     * 사이다
     * 계산하시겠습니다? (y,n)
     * y
     * 총 금액은 - 입니다 프로그램 종료
     *
     * */

        //음료 출력문
        //음료 선택
        //잘못된 음료를 선택하면 처음으로 돌아가기
        // 계산하시겠습니다? (y,n)
        // yes 총 금액은 ~ 입니다.
        //no 음료를 더 선택해 주세요

        Scanner scr= new Scanner(System.in);

        int totalprice=0;
        for(;;){
            System.out.println("사이다500 콜라600 환타700 박카스800 핫식스900");
            System.out.println("음료를 선택해 주세요");
            String first = scr.nextLine();

            int price= 0;

            if(first.equals("사이다")){
                price += 500;
            } else if (first.equals("콜라")) {
                price+=600;
            } else if (first.equals("환타")) {
                price+=700;
            } else if (first.equals("박카스")) {
                price+=800;
            } else if (first.equals("핫식스")) {
                price+=900;
            }else {

                System.out.println("잘못된 음료입니다. 다시 입력해주세요");
                continue; //멈추고 종료되는것이 아니라 돌아가서 다시 반복

            }

            System.out.println("계산하시겠습니까?(y,n)");
            String second= scr.nextLine();

            totalprice +=price;
            if(second.equals("y")) {
                System.out.println("총 금액은" + totalprice + "원입니다");
                break;
            } else if (second.equals("n")) {
                System.out.println("음료를 더 선택해주세요");
            }else{
                System.out.println("정확하게 입력해주세요");
            }

        }

        }




    }



