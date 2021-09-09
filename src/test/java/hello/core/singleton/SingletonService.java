package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();  // 자기 자신을 내부에 static으로 가지고있음. 하나만 존재

    // 이 객체의 인스턴스가 필요하면 오직 getInstance를 통해서만 조회가능. 같은 인스턴스 반환
    public static SingletonService getInstance() {
        return instance;
    }

    // private으로 선언하여 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService() {
        
    }
    
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
