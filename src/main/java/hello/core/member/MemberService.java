package hello.core.member;

public interface MemberService {

    // 서비스는 하고자하는 행위를 추상화 한다. (입력값을 받을 수도 있음)
    void join(Member member);

    Member findMember(Long memberId);
}
