package thirdweek.pokemoncharactergame;

public class EvolvedPokemonStruct extends PokemonStruct { // is a 관계를 밝혀준다.
    private String skill2Name;
    private int skill2Dmg;

    EvolvedPokemonStruct(String monsterName, int maxHp,
                         String skill1Name, int skill1Dmg,
                         String skill2Name, int skill2Dmg) {
        super(monsterName, maxHp, skill1Name, skill1Dmg);
        this.skill2Name = skill2Name;
        this.skill2Dmg = skill2Dmg;
        // 원래 있었던 부모를 지칭하는 키워드 super 로 코드 재사용이 가능해 졌다.
    }

    EvolvedPokemonStruct(String monsterName, String nickName, int maxHp,
                         String skill1Name, int skill1Dmg,
                         String skill2Name, int skill2Dmg) {
        super(monsterName, nickName, maxHp, skill1Name, skill1Dmg);
        this.skill2Name = skill2Name;
        this.skill2Dmg = skill2Dmg;
        // 원래 있었던 부모를 지칭하는 키워드 super 로 코드 재사용이 가능해 졌다.
    }

    @Override
    public String toString() {
        String beforeEvolutionStringInfo = super.toString();
        return "EvolvedPokemonStruct{" + beforeEvolutionStringInfo +
                " skill2Name='" + skill2Name + '\'' +
                ", skill2Dmg=" + skill2Dmg +
                "}";
    }

    public String getSkill2Name() {
        return skill2Name;
    }

    public void setSkill2Name(String skill2Name) {
        this.skill2Name = skill2Name;
    }

    public int getSkill2Dmg() {
        return skill2Dmg;
    }

    public void setSkill2Dmg(int skill2Dmg) {
        this.skill2Dmg = skill2Dmg;
    }
    //    public EvolvedPokemonStruct pokemonStructEvolve(pokemonStruct beforeEvolution) {
//        EvolvedPokemonStruct afterEvolution = beforeEvolution.evolve();
//        return afterEvolution;
//    }

    public void crossOcean(){
        if(this instanceof EvolvedSurfablePokemon){
            ((EvolvedSurfablePokemon) this).surf();
        }else if (this instanceof EvolvedFlyablePokemon){
            ((EvolvedFlyablePokemon) this).fly();
        }
        else {
            System.out.println(this.getNickName() + "은(는) 바다를 건널 수 없습니다.");
        }
    }

    public static void crossOcean2(ICrossable crossablePokemon){
        // 인터페이스 추상화 : 동작의 이름을 합의하는 과정
        crossablePokemon.crossOcean();
    }

    public static void crossOceanOption(PokemonStruct pokemon){
        // 객체의 다형성을 가지고 여러가지 수단을 통해 달성될 수 있는 한가지 기능을 처리하는 방법
        if(pokemon instanceof EvolvedSurfablePokemon){
            ((EvolvedSurfablePokemon) pokemon).surf();
        }else if (pokemon instanceof EvolvedFlyablePokemon){
            ((EvolvedFlyablePokemon) pokemon).fly();
        }
        else {
            System.out.println(pokemon.getNickName() + "은(는) 바다를 건널 수 없습니다.");
        }
    }
}
