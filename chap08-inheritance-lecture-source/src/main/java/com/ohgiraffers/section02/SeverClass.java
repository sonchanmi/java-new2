package main.java.com.ohgiraffers.section02;

public class SeverClass extends SuperClass{


//    @Override
//    public void method2(int num){} 메소드이름 달라져서 에러발생

//    @Override
//    public int method(int num){} 자료형이 달라져서 에러발생


//    @Override
//    public void method(int num, int num2){} 시그니쳐가 달라서 오류

    @Override
    public void method(int num){
        super.method(num);
    }

//    @Override
//    public void privateMethod(){} private 접근불가

//    @Override
//    public final void finalMethod(){} final 키워드 오버라이딩 불가

    @Override
    public void protectedMethod(){}

}
