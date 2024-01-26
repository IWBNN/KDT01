package secondweek.nestedclass;

public class OuterClass {
    // 중첩된 인터페이스 선언
    public interface InnerInterface {
        void innerMethod();
    }

    // 중첩된 인터페이스를 활용한 일괄적인 외부 통신 수행부
    public void useInnerInterface(InnerInterface inner) {
        System.out.println("Calling inner method");
        inner.innerMethod();
    }

    public static void main(String[] args) {
        // OuterClass 객체 생성
        OuterClass outerObject = new OuterClass();

        // 중첩된 인터페이스의 구현체 생성 및 메서드 호출
        outerObject.useInnerInterface(new OuterImplementClass());
    }
}