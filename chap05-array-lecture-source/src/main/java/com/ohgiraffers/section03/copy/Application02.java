package main.java.com.ohgiraffers.section03.copy;

public class Application02 {
    public static void main(String[] args) {

        //얕은복사를 활용하여 매개변수와 리턴값으로 활용 할 수 있다.

        String[] names= {"홍길동","유관순","이순신"};

        System.out.println("name1의 hash coode"+ names.hashCode());
        print(names);


        String[] animals= getAnmimals();
        System.out.println("anmimals1의 hashcode"+ animals.hashCode());
        print(animals);
    }

    public static void print(String[] names){
        System.out.println("names2의 hashcode"+ names.hashCode());


    }

    public  static String[] getAnmimals(){
        String[] anmimals={"낙타","호랑이","돼지"};
        System.out.println("animals2의 hascode: "+anmimals.hashCode());


        return anmimals;
    }

}
