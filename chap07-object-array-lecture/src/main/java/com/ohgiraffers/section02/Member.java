package main.java.com.ohgiraffers.section02;

public class Member { // 전달받을 멤버의 정보를 담을 클래스


    private int num;
    private String id;
    private String pw;
    private String name;
    private int age;
    private char gender;

    public Member() {
    }

    public Member(int num, String id, String pw, String name, int age, char gender) {
        this.num = num;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getInfo() {
        return "Member{" + "num :" + num + ", id =" + id + ",pw=" + pw + ",name+" + name +
                ", age="+ age+",gender=" + gender+"]";
    }
}
