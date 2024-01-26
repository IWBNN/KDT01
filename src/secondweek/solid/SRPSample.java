package secondweek.solid;

public class SRPSample {
    // SRP 원칙을 위반한 User 클래스 선언
//    public class User {
//        private String username;
//        private String password;
//
//        public User(String username, String password) {
//            this.username = username;
//            this.password = password;
//        }
//
//        public boolean isValid() {
//            // 유효성 검사
//            return true;
//        }
//
//        public void save() {
//            // 데이터 저장
//        }
//    }

    public class User {
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

    }

    public class UserValidator {
        public boolean isValid(User user) {
            // 유효성 검사
            return true;
        }
    }

    public class UserDAO {
        public void save(User user) {
            // 데이터 저장
        }
    }
}
