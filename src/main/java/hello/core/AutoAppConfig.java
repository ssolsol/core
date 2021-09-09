package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // basePackages = "hello.core.member", // 어디서 부터 찾을지 지정가능
        // package를 지정하지 않으면 ComponentScan이 있는 클래스의 패키지가 시작위치 ==> hello.core
        excludeFilters= @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)  //기존에 만들어두었던 AppConfig도 자동Scan이기때문에 제외하기 위함.
)
public class AutoAppConfig {

    // bean 수동등록시 수동등록된 값이 우선
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }

}
