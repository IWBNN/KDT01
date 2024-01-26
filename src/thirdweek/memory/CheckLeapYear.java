package thirdweek.memory;

public class CheckLeapYear {
    public boolean CLY(int a){
        boolean Leap = false;
        if (a % 4 ==0 && a % 100 != 0){
            System.out.println("해당 연도가 윤년인지?");
            System.out.println("윤년입니다.");
        Leap = true;
        }else{
            System.out.println("해당 연도가 윤년인지?");
            System.out.println("윤년이 아닙니다");
            Leap = false;
        }
        return Leap;
    }
}
