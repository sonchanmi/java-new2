package main.java.com.ohgiraffers.section06.temary;

public class Test {
    public static void main(String[] args) {


        /*
        * 영어시험을 본 결과 1번 학생은 90점, 2번 항색은 95점, 3번 학생은 81점, 4버 학생은 88점을 맞았다.
        *  90~100 점 사이에 있는 학생은 합격, 아니라면 불합격 출력
        * */

        int one =90;
        int two = 95;
        int three = 81;
        int four = 88;

        String result1= (one>=90 && one<100)? "합격":"불합격";
        String result2= (two>90 && two<100)? "합격":"불합격";
        String result3= (three>90 && three<100)? "합격":"불합격";
        String result4= (four>90 && four<100)? "합격":"불합격";

        System.out.println("1번학생:"+result1);
        System.out.println("2번학생:"+result2);
        System.out.println("3번학생:"+result3);
        System.out.println("4번학생"+result4);

    }
}
