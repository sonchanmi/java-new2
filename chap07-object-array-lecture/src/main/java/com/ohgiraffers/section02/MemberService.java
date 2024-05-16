package main.java.com.ohgiraffers.section02;

public class MemberService { //applicaition 의 명령을 실행할 곳


    public void signUpMembers(){
        Member[] members = new Member[5];

        members[0] = new Member(1,"user01","pss01","홍길동",20,'남');
        members[1]= new Member(2,"user02","pss02,","유관순",16,'여');
        members[2]= new Member(3,"user03","pss03,","이순신",40,'남');
        members[3]= new Member(4,"user04","pss04,","신사임당",36,'여');
        members[4]= new Member(5,"user05","pss05,","윤봉길",22,'남');

        MemberRegister memberRegister =new MemberRegister();

        MemberRegister.regist(members);



    }
    public void showAllMembers(){
        Memberfinder finder = new Memberfinder();
        System.out.println("---가입된 회원목록-------");
        for (Member member:finder.findAllMembers()) {
            if(member !=null){
                System.out.println(member.getInfo());
            }
        }
        System.out.println("----회원 조회완료------");
    }

}
