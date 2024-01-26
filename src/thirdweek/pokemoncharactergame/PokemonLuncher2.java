package thirdweek.pokemoncharactergame;

import java.util.Arrays;
import java.util.List;

public class PokemonLuncher2 {
    public static void main(String[] args) {
        PokemonStruct myPikachu = new PokemonStruct("Pikachu", "myPikachu", 50, "백만볼트", 20);
        PokemonStruct myKkobugi = new PokemonStruct("Kkobugi", "myKkobugi", 60, "물대포", 15);
        PokemonStruct myGugu = new PokemonStruct("gugu", "myGugu", 30, "부리로 쪼기", 10);
        PokemonStruct myKkoret = new PokemonStruct("Kkoret", "myKkoret", 40, "깨물기", 10);
//
//        System.out.println(myPikachu);
//        System.out.println(myKkobugi);
//        System.out.println(myGugu);
//        System.out.println(myKkoret);
//
//        pokemonStruct dexPikachu = pokemonStruct.pokeDex.get("Pikachu");
//        pokemonStruct dexKkobugi = pokemonStruct.pokeDex.get("Kkobugi");
//        pokemonStruct dexGugu = pokemonStruct.pokeDex.get("Gugu");
//        pokemonStruct dexKkoret = pokemonStruct.pokeDex.get("Kkoret");
//
//        System.out.println(dexPikachu);
//        System.out.println(dexKkobugi);
//        System.out.println(dexGugu);
//        System.out.println(dexKkoret);

        PokemonTrainer jiwoo = new PokemonTrainer("Jiwoo", new PokemonStruct[10]);

//        jiwoo.pokemonCaptured[0] = myPikachu;
//        jiwoo.pokemonCaptured[1] = myKkobugi;
//        jiwoo.pokemonCaptured[2] = myGugu;
//        jiwoo.pokemonCaptured[3] = myKkoret;

        jiwoo.captureNewPokemon(myPikachu);
        System.out.println(Arrays.toString(jiwoo.getPokemonCaptured()));

        PokemonTrainer leeseul = new PokemonTrainer("leeseul");
        leeseul.captureNewPokemonInList(myKkobugi);
        System.out.println(leeseul.getCapturedPokemenList());

        GenericPokemonTrainer<EarthPokemon> woong = new GenericPokemonTrainer<>("woong");
        //woong.capturedNewPokemonInList(myGugu); // 제네릭을 통한 타입 제한이 적용됨!
        EarthPokemon digda = new EarthPokemon(
                "Digda", "myDigda", 50, "땅파기", 20
        );
        woong.capturedNewPokemonInList(digda);
        System.out.println(woong.getCapturedPokemons());
        List<EarthPokemon> woongsPokemons = woong.getCapturedPokemons();
        System.out.println(woongsPokemons);
        EarthPokemon woongPokemon1 = woongsPokemons.get(0);
        System.out.println(woongPokemon1);

        // 만약 제네릭하지 않았다면......
        if (woongPokemon1 instanceof EarthPokemon){
            // 확인 후에 타입이 지원하는 메서드를 호출할 수가 있었을 겁니다...
        };

        woongPokemon1.dig();
    }
}
