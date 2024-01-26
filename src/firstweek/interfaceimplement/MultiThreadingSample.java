package firstweek.interfaceimplement;

import firstweek.accessmodifier.a.C;

public class MultiThreadingSample {
        public static void methodWithInterfaceParam(InterfaceSample implObj, InterfaceSample2 implObj2) {
            implObj.absMethod();
            implObj2.absMethodInInterface2();
            implObj2.absMethodInInterface2(1);
        }

    public static void main(String[] args) {

            AbstractClass1[] absClassArray = new AbstractClass1[5];
        //추상 클래스는 객체화할 수 없지만, 자식 클래스 객체를 받는 변수로 선언 가능
        AbstractClass1 absButObj = new ImplementationClass();
        AbstractClass1 absButObj2 = new ConcreteClass1();
        //추상에서도 호출 가능
        absButObj.absMethodInAbsClass();
        absButObj2.absMethodInAbsClass();

        absClassArray[1] = absButObj;
        absClassArray[2] = absButObj2;

        if (absButObj instanceof  ImplementationClass){
            ImplementationClass implClassObj = (ImplementationClass) absButObj;
        }else if (absButObj instanceof  ImplementationClass) {
            ConcreteClass1 concreteClass1 = (ConcreteClass1) absButObj;
        }

        //InterfaceSample implButToInterface1 = new ImplementationClass();

        //인터페이스 다중상속을 통해 어떤 인터페이스 타입 파라미터로든 객체 전당 가능
        //methodWithInterfaceParam(absButObj, absButObj);

    }
}
