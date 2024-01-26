package secondweek.multiclass;

import java.util.List;

public class TravelAgency {

    public void connect(){
        System.out.println("------여행관리국 연결중------");
        System.out.println("------여행관리국 연결완료------");
    }

    public void personIdentified(){
        //신원 확인 = 국적...등등의 info 확인?
    }

    public void travelTo(List<ConcreteCitizen> citizens, String destination) {
        System.out.println("Processing group entry...");

        for (ConcreteCitizen citizen : citizens) {
            System.out.println("Processing citizen: " + citizen.getName() + "님의 " + citizen.getCountryName()
            + "에서 " + destination + " 으로의 입국이 허가되었습니다.");
            // 여기에 각각의 시민에 대한 처리 로직을 추가할 수 있습니다.
        }

        System.out.println("Group entry processed.");
    }
}
