package firstweek.activityeasy;
import java.util.Scanner;
public class RCCarRemote {

//    public static void RCGo(RCCarMoving RC){ RC.go(); }
//
//    public static void RCStop(RCCarMoving RC){
//        RC.stop();
//    }
//
//    public static void RCRight(RCCarMoving RC){
//        RC.right();
//    }
//
//    public static void RCLeft(RCCarMoving RC){
//        RC.left();
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RCCarMoving RC = new RCCarMoving();
        String userInput;
        //int sum= 0;
        boolean off_flag = false;
        System.out.println("RC카의 전원을 켭니다");
        while(!off_flag) {
            userInput = null;
            System.out.print("차의 진행 방향을 선택해주세요(go, stop, right, left, off): ");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "go":
                    RC.go();
          //          sum += 10;
          //          if (sum > 120){
          //              sum = 120;
          //              System.out.println("최고속력입니다.");
          //          }
          //          System.out.printf("현재 속력: %d\n", sum);
                    break;

                case "stop":
                    RC.stop();
//                    sum -= 10;
//                    if (sum <= 0) {
//                        sum = 0;
//                        System.out.printf("현재 속력: %d\n", sum);
//                        System.out.println("차가 정차하였습니다.");
//                    }
//                    System.out.printf("현재 속력: %d\n", sum);
                    break;

                case "right":
                    RC.right();
                    break;
                case "left":
                    RC.left();
                    break;
                case "off":
                    System.out.print("시스템을 종료합니다.");
                    off_flag = true;
                    break;
                default:
                    System.out.println("잘못된 명령입니다. 다시 입력해주세요.");
                    break;

            }
        }

    }
}
