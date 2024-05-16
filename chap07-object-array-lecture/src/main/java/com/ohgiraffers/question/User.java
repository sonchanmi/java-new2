package main.java.com.ohgiraffers.question;

public class User { // 회원의 id, pwd, name을 받을 DTD

    private String id;
    private String pw;
    private String name;

 public User(String id, String pw, String name) {
     this.id = id;
     this.pw = pw;
     this.name = name;

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
    public String getInfo(){
     return "ID: " + id + "\nPW: " + pw + "\nName: " + name;

    }

}
