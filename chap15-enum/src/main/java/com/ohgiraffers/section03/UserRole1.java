package main.java.com.ohgiraffers.section03;

public enum UserRole1 {

    GUSET, //public staic fianl 생략됨

    CONSUMER,

    PRODUCER,

    ADMIN;

    UserRole1() {
    }

    public String getNameToLower(){
        return this.name().toLowerCase(); //위에 이름들을 소문자로 바꿔주겠다
    }
}
