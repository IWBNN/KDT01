package secondweek.solid;

public class DIPSample {
    //DIP 원칙 위반
//    public class Switch {
//        private RedLight light;
//
//        public Switch() {
//            this.light = new RedLight();
//        }
//
//        public void flip() {
//            if (light != null) {
//                light.turnOn();
//            }
//        }
//    }
//
//    public class RedLight {
//        public void turnOn() {
//            System.out.println("Red Light turned on");
//        }
//    }
    class Switch2 {
        private Light light;

        public Switch2(Light light) {
            this.light= light;
        }

        public void flip() {
            if (light!= null) {
                light.turnOn();
            }
        }
    }

    interface Light {
        void turnOn();
    }

    class GreenLight implements Light {
        @Override
        public void turnOn() {
            System.out.println("Green Light turned on");
        }
    }

    class RedLight2 implements Light {
        @Override
        public void turnOn() {
            // 이 안에 어떠한 변경이나 추가 로직이 있어도 Switch 클래스에 영향을 주지 않음
            System.out.println("Red Light turned on");
        }
    }
}
