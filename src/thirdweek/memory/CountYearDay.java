package thirdweek.memory;

public class CountYearDay {
    public int CYD(int a){
        CheckLeapYear CLY = new CheckLeapYear();
        int cAllDay = 0;

        if(CLY.CLY(a)){
            cAllDay = 366;
            System.out.println("해당 연도의 총 일 수는 " + cAllDay + "일 입니다.");
        } else{
            cAllDay = 365;
            System.out.println("해당 연도의 총 일 수는 " + cAllDay + "일 입니다.");
        }
        return cAllDay;
    }
}
