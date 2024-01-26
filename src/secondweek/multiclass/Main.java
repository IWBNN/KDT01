package secondweek.multiclass;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static boolean checkCountryName(ConcreteCountry c1, String expectedCountryName) {
        if (c1.getCountryName().equals(expectedCountryName)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ConcreteCitizen[] traveler1 = new ConcreteCitizen[10];
        ConcreteCitizen[] traveler2 = new ConcreteCitizen[10];
        ConcreteCitizen[] traveler3 = new ConcreteCitizen[10];


        for(int i = 0;i < 10;i++){
            traveler1[i] = new ConcreteCitizen("Asia", "Korea", "Republic",
                                                "Korean", "hong" + i, 21, "010-1234-1234");
        }
        // TravelTo 메서드 호출
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.travelTo(List.of(traveler1),"china");

        List<ConcreteCitizen> immigrantList = new ArrayList<>();

        for(int i = 0 ;i < 10;i++){
            immigrantList.add(new ConcreteCitizen("Asia", "Japan", "Republic",
                                            "Japanese", "take" + i, 21, "010-1234-1234"));
            immigrantList.add(new ConcreteCitizen("Asia", "China", "Republic",
                                            "Chinese", "Wei" + i, 21, "010-1234-1234"));
        }

        List<ConcreteCitizen> filterImmigrant = immigrantList.stream().filter(ConcreteCitizen
                                                -> !Objects.equals(ConcreteCitizen.getCountryName(),"China"))
                                                .collect(Collectors.toList());

        ImmigrationState immigrationState = new ImmigrationState();
        immigrationState.approveImmigration(filterImmigrant);
        //TravelAgency TA = new TravelAgency();
        //ImmigrationState IS = new ImmigrationState();
//        ConcreteCountry c1 = new ConcreteCountry("a","d","b","c");
//        ConcreteCitizen p1 = new ConcreteCitizen("ab", 1,"010");
//        Person a1 = new Person(c1,p1);
//        System.out.println(c1.toString());
//        System.out.println(p1.toString());
//        System.out.println(a1.toString());

        //임시로 작성된 코드임을 알립니다. 추후 여행자 country, citizen 정보 직접 추가 기능 구현 예정
//        int i;
//        int count = 0;

        //Random rand = new Random();
//        ConcreteCountry[] c1 = new ConcreteCountry[100];
//        ConcreteCitizen[] p1 = new ConcreteCitizen[100];
//        Person[] a1 = new Person[100];
//            for (i = 0; i < 30; i++) {
//                c1[i] = new ConcreteCountry("north america", "b", "public", "English");
//                p1[i] = new ConcreteCitizen("여행객" + Integer.toString(i + 1), rand.nextInt(20, 25)
//                        , "010-****-****");
//                a1[i] = new Person(c1[i], p1[i]);
//            }
//            for (i = 30; i < 80; i++) {
//                if (i < 41) {
//                    c1[i] = new ConcreteCountry("asia", "India", "public", "d");
//                    p1[i] = new ConcreteCitizen("피난민" + Integer.toString(i + 1), rand.nextInt(10, 50)
//                            , "010-****-****");
//                    a1[i] = new Person(c1[i], p1[i]);
//                } else if (i > 40 && i < 51) {
//                    c1[i] = new ConcreteCountry("asia", "China", "public", "chinese");
//                    p1[i] = new ConcreteCitizen("피난민" + Integer.toString(i + 1), rand.nextInt(10, 50)
//                            , "010-****-****");
//                    a1[i] = new Person(c1[i], p1[i]);
//                } else {
//                    c1[i] = new ConcreteCountry("asia", "Japan", "public", "japanese");
//                    p1[i] = new ConcreteCitizen("피난민" + Integer.toString(i + 1), rand.nextInt(10, 50)
//                            , "010-****-****");
//                    a1[i] = new Person(c1[i], p1[i]);
//                }
//            }
//            //단체 입국 처리 (filter)
//            ArrayList<Person> CP = new ArrayList<>();
//            for(i = 30;i < 80;i++){
//                CP.add(a1[i]);
//            }
//            int finalI = i;
//            ArrayList<Person> filtering = (ArrayList<Person>) CP.stream().filter(Person
//                                            -> !Objects.equals(Person.getConcreteCountryName(), "china"))
//                                            .collect(Collectors.toList());
//
//
//            System.out.println("1. 여행자 단체입국 처리 | 2. 피난민 집단 망명 요청 처리(국적에 따라 거부 가능)");
//            int a = scanner.nextInt();
//            if (a == 1) { // 임시로 작성한 코드임을 알립니다. (추후 입국 절차 코드 추가 및 연동(개선) 예정)
//                TA.connect();
//                System.out.println("------단체입국자 30명 신원 확인중------");
//
//                for (i = 0; i < 30; i++) {
//                    System.out.println(a1[i].toString());
//                }
//                System.out.println("------전원 신원 확인 완료------");
//
//            } else if (a == 2) {
//                IS.connect();
//                System.out.println("------피난민 50명 신원 확인중------");
//                System.out.println("주의: 국명이 :china 인 사람은 이민 거부");
//                System.out.println("------ 신원 확인중... ------");
//                for (i = 30; i < 80; i++) {
//                    if (checkCountryName(c1[i], "China")) {
//                        count++;
//                    }
//
//                }
//
//                System.out.println(count+"명의 사람이 이민 거부 처리 되었습니다.");
//                System.out.println("이민 가능 인원: " + (50 - count));
//                System.out.println("국적 변경을 신청합니다.");
//
//
//            }
//            else {
//                return;
//            }
//            System.out.println(filtering);
//        }
    }
}

