package secondweek.map;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
public class HashMapIDPW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> IDM = new HashMap<>();
        HashMap<String, String> PWM = new HashMap<>();

        System.out.print("아이디: ");
        String ID = scanner.nextLine();
        System.out.print("비밀번호: ");
        String PW = scanner.nextLine();

        IDM.put("1", ID);
        PWM.put("1", PW);

        System.out.print("아이디재입력: ");
        String ID2 = scanner.nextLine();
        System.out.print("비밀번호재입력: ");
        String PW2 = scanner.nextLine();

        IDM.put("2", ID2);
        PWM.put("2", PW2);

        if(Objects.equals(IDM.get("1"),IDM.get("2"))) {
            if (!Objects.equals(PWM.get("1"), PWM.get("2"))) {
                System.out.println("비밀번호가 일치하지 않습니다.");
            } else {
                System.out.println("로그인 성공");
            }
        }
        else{
            System.out.println("아이디가 존재하지 않습니다.");
        }
    }
}
