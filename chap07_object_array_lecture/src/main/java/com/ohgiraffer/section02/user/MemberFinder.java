package main.java.com.ohgiraffer.section02.user;

public class MemberFinder {
    public Member[] findAllMembers(){
        return MemberRepository.findMembers();
    }
}
