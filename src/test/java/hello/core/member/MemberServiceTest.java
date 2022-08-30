package hello.core.member;


import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    //AppConfig appConfig = new AppConfig();
    //MemberService memberService = appConfig.memberService();

    // BeforeEach 사용으로 테스트마다 실행되는 부분 작성
    MemberService memberService;
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given 이게 주어졌을 때
        Member member = new Member(1L,"memberA", Grade.VIP);

        //when 이러면
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        
        //then 이렇게 된다.
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
