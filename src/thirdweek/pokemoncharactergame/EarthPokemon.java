package thirdweek.pokemoncharactergame;

public class EarthPokemon extends PokemonStruct {

    EarthPokemon(String monsterName, int maxHp,
                 String skill1Name, int skill1Dmg) {
        super(monsterName, maxHp, skill1Name, skill1Dmg);
    }

    EarthPokemon(String monsterName, String nickName,
                 int maxHp, String skill1Name, int skill1Dmg) {
        super(monsterName, nickName, maxHp, skill1Name, skill1Dmg);
    }

    public void dig() {
        System.out.println("땅을 파서 대륙을 횡단합니다.");
    }
}