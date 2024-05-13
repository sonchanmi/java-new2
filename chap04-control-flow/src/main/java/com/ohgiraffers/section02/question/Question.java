package main.java.com.ohgiraffers.section02.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /*
         * 입력한 숫자 범위 내에서 소수를 찾아 출력하는 프로그램을 작성하기
         * 사용자로부터 시작 숫자와끝 숫자를 입력 받습니다. 프로그램은 해당 범위 내에 존재하는 모든 소수를 출력합니다.
         * 소수=1과 자기 자신을 제외한 수로 나누어 떨어지지 않는 수
         *
         * */

        // 1.입력한 숫자범위내에서 시작숫자와 끝숫자 입력받음> 스캐너 사용
        //2. 입력한 범위내에서 시작 숫자, 끝 숫자 범위 설정하기
        // 3,5,7,9.. 소수
        //3. 나누어 떨어지는 수가 아닌것을 조건문으로 만들기 짝수?....
        //3.while문을 사용하여 소수=1과 자기 자신을 제외한 수로 나누어 떨어지지 않는 수 조건문 만들고, 출력

        Scanner scr = new Scanner(System.in);

        System.out.println("시작 숫자 입력");
        int start = scr.nextInt();
        System.out.println("끝 숫자 입력");
        int end = scr.nextInt();

        System.out.println(start + "부터" + end + "까지의 소수:");

        for (int i = start; i < end; i++) {

            boolean isTrue = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue == true) {
                System.out.println(i + " ");

            }
        }

    }

}
