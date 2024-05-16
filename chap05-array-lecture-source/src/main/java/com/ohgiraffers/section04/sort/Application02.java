package main.java.com.ohgiraffers.section04.sort;

public class Application02 {
    public static void main(String[] args) {

        //순차정렬

        //초기 배열 선언
        int[] iarr ={2,6,4,5,1,3};

        for(int i=1;i<iarr.length;i++){

            for(int j=0 ;j<iarr.length; j++){
                 if(iarr[i]<iarr[j]){
                     int temp;
                     temp = iarr[j];
                     iarr[j] = iarr[i];
                     iarr[i] = temp;
                 }

            }
        }
        for (int i=0; i<iarr.length; i++){
            System.out.println(iarr[i]+" ");
        }

    }

}
