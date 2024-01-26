package secondweek.solid;

public class LSPSample {
    public class LspSampleMain {
        public void main(String[] args) {
            Bird ostrich = new Ostrich();
            makeBirdFly(ostrich); // 예외 발생!
        }

        static void makeBirdFly(Bird bird) {
            bird.fly(); // throws 감지 불가능
        }
    }

    class Bird {
        void fly() {
            // 새가 날아감
        }
    }

    class Ostrich extends Bird {
        void fly() throws UnsupportedOperationException {
            throw new UnsupportedOperationException("타조는 날지 못합니다.");
        }
    }
}
