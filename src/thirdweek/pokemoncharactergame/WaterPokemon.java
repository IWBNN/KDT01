package thirdweek.pokemoncharactergame;

public class WaterPokemon extends PokemonStruct {
    WaterPokemon(String monsterName, int maxHp,
                 String skill1Name, int skill1Dmg) {
        super(monsterName, maxHp, skill1Name, skill1Dmg);
    }

    WaterPokemon(String monsterName, String nickName,
                 int maxHp, String skill1Name, int skill1Dmg) {
        super(monsterName, nickName, maxHp, skill1Name, skill1Dmg);
    }
}
