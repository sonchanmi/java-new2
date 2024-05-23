package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class Application01 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnoughMoney(300000,5000);
//            et.checkEnoughMoney(-5000,5000);
            et.checkEnoughMoney(30000,5000);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
