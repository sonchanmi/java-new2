package main.java.com.ohgiraffers.section02;

public class MemberRepository { // db연결부 - 데이터 수행

    private  final static Member[] members;  //아래 전달받은 매개변수 Member랑 다른 Member임

    private static int count;


    static{
        members = new Member[10];

    }
public static boolean store(Member[] newMember){
        for (int i=0;i< newMember.length;i++){


            if(count !=10){
                members[count++]=newMember[i];

            }else{
                System.out.println("정원 초과");
                return false;
            }

        }

        return true;
}

    public static Member[] findAllMembers() {
        return members;
    }
}
