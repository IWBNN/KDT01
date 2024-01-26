package secondweek.multiclass;

import java.util.List;
import java.util.Objects;

public class ImmigrationState {
    public void connect(){
        System.out.println("------이민국 연결중------");
        System.out.println("------이민국 연결완료------");
    }

    public void approveImmigration(List<ConcreteCitizen> filteredImmigrant) {
        System.out.println("단체 이민 filtering process 작동중...");
        System.out.println("(주의) 현재 국적이 China 인 시민의 입국을 거부하고있습니다. ");
        int countImmigrant = 0;
        int countFilteredImmigrant = 0;
        for (ConcreteCitizen citizen : filteredImmigrant) {
            if (Objects.equals(citizen.getCountryName(), "China")){
                System.out.println(citizen);
                System.out.println(citizen.getName() + "의 국적이 " + citizen.getCountryName() + " 이므로 입국을 거부합니다.");
                countFilteredImmigrant++;
            } else {
                System.out.println(citizen);
                System.out.println(citizen.getName() + " 의 입국을 허가합니다.");
                countImmigrant++;
            }
        }

        System.out.println("이민 filtering process 종료");
        System.out.println("이민자 수: "+ countImmigrant);
        System.out.println("거부된 이민자 수: "+ countFilteredImmigrant);
    }
}
