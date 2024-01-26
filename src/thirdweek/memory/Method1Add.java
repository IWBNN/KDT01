package thirdweek.memory;

public class Method1Add {

    private int instanceVar;
    public int Add(int a, int b){
        int result = a + b;
        System.out.println("메소드1 덧셈");
        System.out.println(result);
        this.instanceVar = result;
        return result;
    }
}
