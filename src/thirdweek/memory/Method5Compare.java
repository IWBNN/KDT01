package thirdweek.memory;

public class Method5Compare {
    public int Compare(int a, int b){
        System.out.println("어디가 더 크지?");
        if (a < b){
            System.out.println(b + "가 더 큽니다.");
            return b;
        }
        else {
            System.out.println(a + "가 더 큽니다.");
            return a;
        }
    }
}
