package secondweek.nestedclass;

// 중첩된 인터페이스의 구현체
class OuterImplementClass implements OuterClass.InnerInterface {
    @Override
    public void innerMethod() {
        // 구체적인 동작을 구현
        System.out.println("Inner method implementation");
    }
}