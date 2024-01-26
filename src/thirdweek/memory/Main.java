package thirdweek.memory;

public class Main {
    public static void main(String[] args) {
        Method1Add add = new Method1Add();
        Method2Minus minus = new Method2Minus();
        CountYearDay CYD = new CountYearDay();
        Method5Compare Cp = new Method5Compare();
        add.Add(3,4);
        minus.minus(3, 4);
        Cp.Compare(5,2);
        CYD.CYD(2024);
    }
}
