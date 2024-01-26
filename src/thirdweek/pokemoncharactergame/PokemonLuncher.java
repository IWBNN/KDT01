package thirdweek.pokemoncharactergame;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class PokemonLuncher {
    public static void main(String[] args) {
        // 여기는 태초마을 입니다.
        //System.out.println("태초마을에 오신 것을 환영합니다.");
        // 피카츄 만들기
//        String pikachu = "Pikachu";
//        int pikachuHP = 50;
//        String pikachuSkill1 = "ㅂㅁㅂㅌ";
//        int pikachuSkill1Damage = 20;
        PokemonStruct pikachu = new PokemonStruct("Pikachu", "myPikachu",50, "백만볼트", 20);
        // 꼬부기 만들기
//        String kkobugi = "kkobugi";
//        int kkobugiHP = 60;
//        String kkobugiSkill1 = "ㅁㄷㅍ";
//        int kkobugiSkill1Damage = 15;
        PokemonStruct kkobugi = new PokemonStruct("Kkobugi", "myKkobugi", 60, "물대포", 15);
//        System.out.printf("name: %s, hp: %d, skill: %s, damage: %d\n", kkobugi.monsterName, kkobugi.getHp(), kkobugi.skill1Name, kkobugi.skill1Damage);
        //System.out.println(pikachu);
        //System.out.println(kkobugi);
        //        // 구구 만들기
//        String gugu = "gugu";
//        int guguHP = 30;
//        String guguSkill1 = "ㅂㄹㄹ ㅉㄱ";
//        int guguSkill1Damage = 10;
        PokemonStruct gugu = new PokemonStruct("gugu", "myGugu", 30, "부리로 쪼기", 10);
        // 꼬렛 만들기
//        String kkoret = "kkoret";
//        int kkoretHP = 40;
//        String kkoretSkill1 = "ㄲㅁㄱ";
//        int kkoretSkill1Damege = 10;
        PokemonStruct kkoret = new PokemonStruct("Kkoret", "myKkoret", 40, "깨물기", 10);

//        System.out.printf("name: %s, hp: %d, skill: %s, damage: %d\n", kkoret.monsterName, kkoret.getHp(), kkoret.skill1Name, kkoret.skill1Damage);
        //System.out.println(gugu);
        //System.out.println(kkoret);
        //여기에는 배틀이 들어갑니다.
        //pikachuGuguBattle(pikachu, pikachuHP, pikachuSkill1, pikachuSkill1Damage,
        //        gugu, guguHP, guguSkill1, guguSkill1Damage);
        //pokemonBattle(kkobugi, kkoret);
        // 배틀 수행 후
        // pokemonObjectUnitBattle(kkobugi, kkoret);
        // 회복 센터로 갑니다.
//        pokemonHealingCenter(kkobugi);
        // kkobugi.visitHealingCenter();

        // pokemonStruct 클래스 말고, EvolvedPokemon 으로 따로 만들어 볼까?
        // kkobugi.getSkill1Name();
//        kkobugi.getSkill2Name();

        // 진화한 포켓몬을 별도 클래스로 분리하여 재선언
        //EvolvedPokemon unibugi = new EvolvedPokemon("어니부기", 120,
        //                                            "물대포", 15,
        //                                           "거품광선", 30);

        // 불법 진화 포켓몬 생산 (진화형부터 바로 만들어버림) -> 로켓단
        EvolvedPokemonStruct unibugi = new EvolvedPokemonStruct("어니부기", null,120,
                                                                "물대포", 15,
                                                                "거품광선", 30);
        //pokemonObjectUnitBattle(unibugi, kkoret);   // 같은 종류의 (계보의) 객체끼리 동일하게 다루지 못하는 부작용

        PokemonStruct[] ppippiArray = new PokemonStruct[10];
        PokemonStruct[] purinArray = new PokemonStruct[10];
//        for (int i = 0; i < 10; i++){
//            if (i % 2 == 0) {
//                ppippiArray[i] = new pokemonStruct("Ppippi","삐삐" + i, 100, "손가락 흔들기", 0);
//                purinArray[i] = new pokemonStruct("Purin","푸린" + i, 100, "노래 부르기", 0);
//            } else {
//                ppippiArray[i] = new pokemonStruct("Ppippi","삐삐" + i, 100, "손가락 흔들기", 0).evolve();
//                purinArray[i] = new pokemonStruct("Purin","푸린" + i, 100, "노래 부르기", 0).evolve();
//            }
        // Pokemon 객체를 담을 ArrayList 생성
        ArrayList<PokemonStruct> pokemonList = new ArrayList<>();

// 배열에 있는 객체들을 ArrayList에 추가
        for (int i = 0; i < 10; i++) {
            pokemonList.add(new PokemonStruct("Ppippi", "삐삐" + i, 100, "손가락 흔들기", 0));
            pokemonList.add(new PokemonStruct("Purin", "푸린" + i, 100, "노래 부르기", 0));
        }
        ArrayList<PokemonStruct> filteredName = (ArrayList<PokemonStruct>) pokemonList.stream().filter(pokemonStruct ->
                                                Objects.equals(pokemonStruct.getMonsterName(), "Purin"))
                                                .collect(Collectors.toList());
        PokemonStruct.groupEvolve(filteredName);

            //      ppippiArray[i] = new pokemonStruct("푸린" + i, 100, "노래 부르기", 0);

         // 클래스가 적용된 자체로 인해서 여러 종류 포켓몬은 같이 다룰 수가 있다.

        // 포켓몬 도감 사용하기 (Map 자료형 만들고 이종 데이터 값 가져오기)
        // toString 이 적절하게 오버라이드 된 상속 클래스 만들기
        PokemonStruct pikachuInDogam = PokemonStruct.pokeDex.get("Pikachu");
//        System.out.println(pokemonStruct.pokeDex.get("Pikachu"));
//        System.out.println(pokemonStruct.pokeDex.get("Unibugi"));
//        System.out.println(pokemonStruct.pokeDex.get("Ppippi"));
//        System.out.println(pokemonStruct.pokeDex.get("Purin"));

        // 진화 도감에서 데이터를 조회해 보자
        String evolveName = PokemonStruct.pokeEvolveDex.get(pikachuInDogam.getMonsterName());
        //System.out.println(evolveName);

        //System.out.println(pokemonStruct.pokeEvolveDex.get("Purin"));
        //System.out.println(pokemonStruct.pokeEvolveDex.get("Ppippi"));
        String evolvedFormName = PokemonStruct.pokeEvolveDex.get("Purin");
        PokemonStruct evolvedInfoObj =  PokemonStruct.pokeDex.get(evolvedFormName);
        //System.out.println(evolvedInfoObj);

//        // 이종 타입을 모두 포함하는 배열
        // 이미 진화를 마친 삐삐와 푸린 (픽시, 푸크린) -> 섞여 있으면 어떻게 하지?

//        pokemonStruct[] evolvedPpippiArray = new pokemonStruct[10];
//        int count = 0;
//        for (pokemonStruct ppippiOrPixy : ppippiArray) {
//            if(pokemonStruct.pokeEvolveDex.get(ppippiOrPixy.getMonsterName()) == null){
//                evolvedPpippiArray[count] = ppippiOrPixy;
//            } else {
//                evolvedPpippiArray[count] = ppippiOrPixy.evolve();
//            }
//            System.out.println(evolvedPpippiArray[count]);
//            count++;
//        }
//        System.out.println(Arrays.toString(evolvedPpippiArray));
//
//        pokemonStruct.groupEvolve(ppippiArray);
//        pokemonStruct.groupEvolve(purinArray);

        EvolvedFlyablePokemon flyablePokemon = new EvolvedFlyablePokemon(
            "Pigeon", "myPigeon", 300,
                "날개차기", 50,
                "전광석화", 100
        );
        //flyablePokemon.fly();

        EvolvedSurfablePokemon surfablePokemon  = new EvolvedSurfablePokemon(
                "Lapras", "myLapras", 300,
                "물대포", 50,
                "등딱지에 숨기", 0
        );
        //surfablePokemon.surf();

        EvolvedPokemonStruct randomPokemon = new EvolvedPokemonStruct(
                "LaprasMutant", "myLaprasMutant", 300,
                "물대포", 50,
                "등딱지에 숨기", 0
        );

//        EvolvedPokemonStruct.crossOcean2(surfablePokemon);
//        EvolvedPokemonStruct.crossOcean2(flyablePokemon);

        // 싱글톤으로 선언된 전설의 포켓몬이 중복 생성되는 것은 막을 수 있지만 중복 참조되는 것은 막지 못한 모습
        // 중복 참조까지 막을 수 있는 방법이 필요함.
        LegendaryPokemon lugiaEncounter = LegendaryPokemon.getLugia();
        //System.out.println(lugiaEncounter);

        LegendaryPokemon lugiaObtained = LegendaryPokemon.getDuplicateLugia();
        //System.out.println(lugiaObtained);

        //pokemonStruct.pokemonObjectUnitBattle(lugiaObtained, lugiaEncounter);
        //randomPokemon.crossOcean();
//        EvolvedPokemonStruct.crossOceanOption(randomPokemon);
//        EvolvedPokemonStruct.crossOceanOption(surfablePokemon);
//        EvolvedPokemonStruct.crossOceanOption(flyablePokemon);
//        //EvolvedPokemon is a PokemonStruct
        // 상속 형태로 클래스(객체)를 확장해서,
        // 확장될 필요가 있을 때만 확장된 클래스를 사용하자.
    }

    //구조체를 사물 단위로 묶어서 동작과 함께 다루면 어떨까?
    // => 클래스의 개념이 정립됨.
//    public static void pokemonObjectUnitBattle(pokemonStruct pokemon1, pokemonStruct pokemon2) {
//        while(pokemon1.getHp() >= 0 && pokemon2.getHp() >= 0){
//            //테스트 코드 (HP를 조절해보자)
//            //pokemon1.hp += 100;
//            pokemon1.attack(pokemon2);
//            if (pokemon2.getHp() > 0){
//                pokemon2.attack(pokemon1);
//            }
//        }
//    }
        // 합의되지 않은 방법으로, 일관적이지 않게 객체 데이터를 접근하고 수정하는 방식
        // Encapsulation을 이용
//    public static void pokemonHealingCenter (pokemonStruct pokemon1){
//        if(pokemon1.monsterName == "Kkobugi"){
//            pokemon1.hp = 60;
//        } else if(pokemon1.monsterName == "kkoret"){
//            pokemon1.hp = 40;
//        }
//        //꼬부기는 최대 HP 가 60인데, 그 이상으로 제어가 됨.
//        //그 외의 다른 포켓몬 (HP max 200) 의 경우에는 정해진 최대치 회복이 안됨.
//        //일관적인 동작도 안되고, 개별적인 상황도 반영을 하기가 어려워 졌다.
//
//        // 1. 객체 내에 모든 동작을 집어넣자 (= 바깥에서 하지 말자)
//        System.out.println("회복 전 "+ pokemon1.monsterName + " HP: " + pokemon1.getHp());
//        pokemon1.visitHealingCenter();
//        System.out.println("회복 후 "+ pokemon1.monsterName + " HP: " + pokemon1.getHp());
//
//          // 2. 객체 데이터 수정 자체를 객체에 약속된 동작 방식 외로는 불가능하게 하자
////        pokemon1.hp += 100; // <= 자꾸만 왼쪽처럼 약속을 위반하는 코드를 짜는 개발자들이 발생
//        // Encapsulation ->  캡슐화 : 객체 내부의 데이터를 외부에서 접근 불가능하게 감싸기
//        pokemon1.setHp(pokemon1.getHp() + 100);
//        pokemon1.setHp(pokemon1.getMaxHp());
        // 합의되지 않은, 의도하지 않은 로직이 코드 내에 산개해서 유지보수를 방향하는 상황이 예방된다.
//    }

    // 태초에는 객체가 없고 메서드라는 것만 있었습니다.

//    public static void pikachuGuguBattle(String pikachuName, int pikachuHP, String pikachuSkill1, int pikachuSkill1Damage,
//                                         String guguName, int guguHP, String guguSkill1, int guguSkill1Damage)
//    {
//        boolean surrenderAny = false;
//        while (!surrenderAny) {
//            if (guguHP > 0) {
//                // 피카츄 공격 후 구구 HP 표시
//                System.out.println(pikachuName + "(이)가" + guguName + "(를)을공격합니다.");
//                System.out.println(pikachuSkill1 + "(를)을 사용합니다.");
//                guguHP -= pikachuSkill1Damage;
//                System.out.println(guguName + "남은 HP:" + guguHP);
//                if (guguHP <= 0) {
//                    surrenderAny = true;
//                    System.out.println(guguName + "(이)가 항복했습니다.");
//                }
//            } else {
//                surrenderAny = true;
//                System.out.println(guguName + "(이)가 항복했습니다.");
//            }
//            System.out.println("---------------------------------");
//            if (!surrenderAny) {
//                if (pikachuHP > 0 & !surrenderAny) {
//                    // 구구 공격 후 피카츄 HP 표시
//                    System.out.println(guguName + "(이)가" + pikachuName + "(를)을공격합니다.");
//                    System.out.println(guguSkill1 + "(를)을 사용합니다.");
//                    pikachuHP -= guguSkill1Damage;
//                    System.out.println(pikachuName + "남은 HP:" + pikachuHP);
//                    if (pikachuHP <= 0) {
//                        surrenderAny = true;
//                        System.out.println(pikachuName + "(이)가 항복했습니다.");
//                    }
//                } else {
//                    surrenderAny = true;
//                    System.out.println(pikachuName + "(이)가 항복했습니다.");
//                }
//                System.out.println("---------------------------------");
//            }
//        }
//    }
//
//    public static void pokemonBattle(pokemonStruct pokemon1, pokemonStruct pokemon2)
//    {
//        boolean surrenderAny = false;
//        while (!surrenderAny) {
//            if (pokemon2.hp > 0) {
//                // 피카츄 공격 후 구구 HP 표시
//                System.out.println(pokemon1.hp + "(이)가" + pokemon2.monsterName + "(를)을공격합니다.");
//                System.out.println(pokemon1.skill1Name + "(를)을 사용합니다.");
//                pokemon2.hp -= pokemon1.skill1Damage;
//                System.out.println(pokemon2.monsterName + "남은 HP:" + pokemon2.hp);
//                if (pokemon2.hp <= 0) {
//                    surrenderAny = true;
//                    System.out.println(pokemon2.monsterName + "(이)가 항복했습니다.");
//                }
//            } else {
//                surrenderAny = true;
//                System.out.println(pokemon2.monsterName + "(이)가 항복했습니다.");
//            }
//            System.out.println("---------------------------------");
//            if (!surrenderAny) {
//                if (pokemon1.hp > 0 & !surrenderAny) {
//                    // 구구 공격 후 피카츄 HP 표시
//                    System.out.println(pokemon2.monsterName + "(이)가" + pokemon1.monsterName + "(를)을공격합니다.");
//                    System.out.println(pokemon2.skill1Name + "(를)을 사용합니다.");
//                    pokemon1.hp -= pokemon2.skill1Damage;
//                    System.out.println(pokemon1.monsterName + "남은 HP:" + pokemon1.hp);
//                    if (pokemon1.hp <= 0) {
//                        surrenderAny = true;
//                        System.out.println(pokemon1.monsterName + "(이)가 항복했습니다.");
//                    }
//                } else {
//                    surrenderAny = true;
//                    System.out.println(pokemon1.monsterName + "(이)가 항복했습니다.");
//                }
//                System.out.println("---------------------------------");
//            }
//        }
//    }
//    //구조체를 한 덩어리로 만들면 편리할까?
//    public static void pokemonBattleSingleStruct(pokemonBattleStruct battleStruct)
//    {
//        boolean surrenderAny = false;
//        while (!surrenderAny) {
//            if (battleStruct.monster1hp > 0) {
//                // 피카츄 공격 후 구구 HP 표시
//                System.out.println(battleStruct.monster1hp + "(이)가" + battleStruct.monster2Name + "(를)을공격합니다.");
//                System.out.println(battleStruct.monster1Skill1Name + "(를)을 사용합니다.");
//                battleStruct.monster2hp -= battleStruct.monster1Skill1Damage;
//                System.out.println(battleStruct.monster2Name + "남은 HP:" + battleStruct.monster2hp);
//                if (battleStruct.monster2hp <= 0) {
//                    surrenderAny = true;
//                    System.out.println(battleStruct.monster2Name + "(이)가 항복했습니다.");
//                }
//            } else {
//                surrenderAny = true;
//                System.out.println(battleStruct.monster2Name + "(이)가 항복했습니다.");
//            }
//            System.out.println("---------------------------------");
//            if (!surrenderAny) {
//                if (battleStruct.monster1hp > 0 & !surrenderAny) {
//                    // 구구 공격 후 피카츄 HP 표시
//                    System.out.println(battleStruct.monster2Name + "(이)가" + battleStruct.monster1Name + "(를)을공격합니다.");
//                    System.out.println(battleStruct.monster2Skill1Name + "(를)을 사용합니다.");
//                    battleStruct.monster1hp -= battleStruct.monster2Skill1Damage;
//                    System.out.println(battleStruct.monster1Name + "남은 HP:" + battleStruct.monster1hp);
//                    if (battleStruct.monster1hp <= 0) {
//                        surrenderAny = true;
//                        System.out.println(battleStruct.monster1Name + "(이)가 항복했습니다.");
//                    }
//                } else {
//                    surrenderAny = true;
//                    System.out.println(battleStruct.monster1Name + "(이)가 항복했습니다.");
//                }
//                System.out.println("---------------------------------");
//            }
//        }
//    }
//    //구조체를 사물 단위로 묶어서 동작과 함께 다루면 어떨까?
}