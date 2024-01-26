package thirdweek.pokemoncharactergame;

public class LegendaryPokemon extends PokemonStruct {

    private static LegendaryPokemon lugia = null;

    public LegendaryPokemon(String monsterName, int maxHp, String skill1Name, int skill1Dmg) {
        super(monsterName, maxHp, skill1Name, skill1Dmg);
    }

    private LegendaryPokemon(String monsterName, String nickName, int maxHp, String skill1Name, int skill1Dmg) {
        super(monsterName, nickName, maxHp, skill1Name, skill1Dmg);
    }

    public static LegendaryPokemon getLugia() {
        if(lugia == null) {
            lugia = new LegendaryPokemon(
                    "Lugia", "Legend Lugia", 30_000,
                    "눈보라", 3000);
            return lugia;
        }
        return null;
    }

    public static LegendaryPokemon getDuplicateLugia() {
        if(lugia == null) {
            lugia = new LegendaryPokemon(
                    "Lugia", "Legend Lugia", 30_000,
                    "눈보라", 3000);
        }
        return lugia;
    }

//    public void attack(pokemonStruct targetPokemon) {
//        if (targetPokemon.getHp() > 0) {
//            // 피카츄 공격 후 구구 HP 표시
//            System.out.println(this.getNickName() + "(이)가 " + this.getNickName() + "(를)을공격합니다.");
//            System.out.println(this.getSkill1Name() + "(를)을 사용합니다.");
//            targetPokemon.getHp() -= this.getSkill1Dmg();
//            System.out.println(targetPokemon.getNickName() + "의남은 HP: " + targetPokemon.getHp());
//            if (targetPokemon.getHp() <= 0) {
//                System.out.println(this.getNickName() + " (이)가 항복했습니다.");
//            }
//        }
//        System.out.println("---------------------------------");
//    }
}
