package firstweek.interfaceimplement;

public class ImplementationClass extends AbstractClass1 implements InterfaceSample, InterfaceSample2 {

    @Override
    public void absMethod() {
        System.out.println("그렇다고 합니다");
    }

    @Override
    public void absMethod(int a) {

    }

    @Override
    public void absMethod(int a, int b) {

    }

    @Override
    public void absMethodInInterface2(int a) {

    }

    @Override
    void absMethodInAbsClass() {

    }
}
