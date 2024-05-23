package main.java.com.ohgiraffers.section04.override;

import java.io.IOException;

public class SubClass extends Superclass{
    //예외 없이 가능 - 부모 메소드가 예외를 던지더라도 재정의 하면서 예외를 발생시키지 않을 수 있기 때문에

    /*@Override
    public void method(){} */

   /* @Override
    public void method() throws IOException{} */

    //상위 타입의 exception은 불가능
    /* @Override
     public voic method() throws Exception{}
    * */




}
