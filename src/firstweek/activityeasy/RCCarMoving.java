package firstweek.activityeasy;

public class RCCarMoving{
//public class RCCarMoving extends AbstractRCCarMoving{
    public static class Speed {
        int currentSpeed;
        int maxSpeed = 120;
    }
    Speed sp = new Speed();

    public void go() {
        sp.currentSpeed +=10;
        if (sp.currentSpeed > sp.maxSpeed){
            System.out.println("차가 최고 속력입니다. 더이상 속도가 늘어나지 않습니다.");
            sp.currentSpeed = sp.maxSpeed;
        }
        System.out.printf("차가 전진합니다. (현재속도: %d)\n", sp.currentSpeed);
    }


    public void stop() {
        sp.currentSpeed -= 10;
        if (sp.currentSpeed <= 0){
            sp.currentSpeed = 0;
            System.out.println("차가 정차합니다.");
        }else{
        System.out.printf("차가 감속합니다.(현재 속도: %d)\n", sp.currentSpeed);
        }
    }


    public void right() {
        System.out.printf("차가 우회전중입니다.(현재속도: %d)\n", sp.currentSpeed);
    }


    public void left() {
        System.out.printf("차가 좌회전중입니다.(현재속도: %d)\n", sp.currentSpeed);
    }

}
