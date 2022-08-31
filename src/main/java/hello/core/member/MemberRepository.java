package hello.core.member;

// 리파지토리는 서비스와 마찬가지로 인터페이스이므로 저장하는 행위를 추상화한다.
public interface MemberRepository{

    void save(Member member);

    Member findById(Long memberId);
}
