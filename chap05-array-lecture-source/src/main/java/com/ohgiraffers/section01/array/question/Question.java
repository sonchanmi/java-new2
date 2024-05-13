package main.java.com.ohgiraffers.section01.array.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        // 배열의 최솟값, 최댓값 찾기

        //배열의 길이는 스캐너로 입력 받아서 요소마다 정수를 넣어줌.
        //해당 배열의 최솟값과 최댓값을 출력해주는 기능을 만들기

        Scanner scr=new Scanner(System.in);

        System.out.println("값을 넣어주기");
        int size=scr.nextInt();

        int[] arr=new int[size];


        for(int i=0;i<arr.length;i++){
       arr[i]=scr.nextInt();
            System.out.println(arr[i]);

        }
          int min=arr[0];
        int max=arr[0];
        for (int j=0;j<arr.length;j++){
             if(arr[j]<min) {
                 min = arr[j];
             }else if (arr[j]>max) {
                 max = arr[j];
             }

        }
        System.out.println((min)+" "+max);
    }
}
