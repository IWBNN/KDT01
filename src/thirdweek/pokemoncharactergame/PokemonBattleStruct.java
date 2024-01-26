package thirdweek.pokemoncharactergame;

public class PokemonBattleStruct {  // 기능을 중심으로 묶었더니 한계가 있다.
    String monster1Name;
    int monster1hp;
    String monster1Skill1Name;
    int monster1Skill1Damage;

    String monster2Name;
    int monster2hp;
    String monster2Skill1Name;
    int monster2Skill1Damage;

    public PokemonBattleStruct(String monster1Name, int monster1hp, String monster1Skill1Name, int monster1Skill1Damage,
                               String monster2Name, int monster2hp, String monster2Skill1Name, int monster2Skill1Damage)
    {
        this.monster1Name = monster1Name;
        this.monster1hp = monster1hp;
        this.monster1Skill1Name = monster1Skill1Name;
        this.monster1Skill1Damage = monster1Skill1Damage;
        this.monster2Name = monster2Name;
        this.monster2hp = monster2hp;
        this.monster2Skill1Name = monster2Skill1Name;
        this.monster2Skill1Damage = monster2Skill1Damage;
    }
    public void pokemonSpecialBattleInStruct(){
        boolean surrenderAny = false;
        while (!surrenderAny) {
            if (this.monster1hp > 0) {
                // 피카츄 공격 후 구구 HP 표시
                System.out.println(this.monster1hp + "(이)가" + this.monster2Name + "(를)을공격합니다.");
                System.out.println(this.monster1Skill1Name + "(를)을 사용합니다.");
                this.monster2hp -= this.monster1Skill1Damage * 2;
                System.out.println(this.monster2Name + "남은 HP:" + this.monster2hp);
                if (this.monster2hp <= 0) {
                    surrenderAny = true;
                    System.out.println(this.monster2Name + "(이)가 항복했습니다.");
                }
            } else {
                surrenderAny = true;
                System.out.println(this.monster2Name + "(이)가 항복했습니다.");
            }
            System.out.println("---------------------------------");
            if (!surrenderAny) {
                if (this.monster1hp > 0 & !surrenderAny) {
                    // 구구 공격 후 피카츄 HP 표시
                    System.out.println(this.monster2Name + "(이)가" + this.monster1Name + "(를)을공격합니다.");
                    System.out.println(this.monster2Skill1Name + "(를)을 사용합니다.");
                    this.monster1hp -= this.monster2Skill1Damage;
                    System.out.println(this.monster1Name + "남은 HP:" + this.monster1hp);
                    if (this.monster1hp <= 0) {
                        surrenderAny = true;
                        System.out.println(this.monster1Name + "(이)가 항복했습니다.");
                    }
                } else {
                    surrenderAny = true;
                    System.out.println(this.monster1Name + "(이)가 항복했습니다.");
                }
                System.out.println("---------------------------------");
            }
        }
    }
    public void pokemonSpecialBattle2InStruct(){
        boolean surrenderAny = false;
        while (!surrenderAny) {
            if (this.monster1hp > 0) {
                // 피카츄 공격 후 구구 HP 표시
                System.out.println(this.monster1hp + "(이)가" + this.monster2Name + "(를)을공격합니다.");
                System.out.println(this.monster1Skill1Name + "(를)을 사용합니다.");
                this.monster2hp -= this.monster1Skill1Damage * 2;
                System.out.println(this.monster2Name + "남은 HP:" + this.monster2hp);
                if (this.monster2hp <= 0) {
                    surrenderAny = true;
                    System.out.println(this.monster2Name + "(이)가 항복했습니다.");
                }
            } else {
                surrenderAny = true;
                System.out.println(this.monster2Name + "(이)가 항복했습니다.");
            }
            System.out.println("---------------------------------");
            if (!surrenderAny) {
                if (this.monster1hp > 0 & !surrenderAny) {
                    // 구구 공격 후 피카츄 HP 표시
                    System.out.println(this.monster2Name + "(이)가" + this.monster1Name + "(를)을공격합니다.");
                    System.out.println(this.monster2Skill1Name + "(를)을 사용합니다.");
                    this.monster1hp -= this.monster2Skill1Damage / 2;
                    System.out.println(this.monster1Name + "남은 HP:" + this.monster1hp);
                    if (this.monster1hp <= 0) {
                        surrenderAny = true;
                        System.out.println(this.monster1Name + "(이)가 항복했습니다.");
                    }
                } else {
                    surrenderAny = true;
                    System.out.println(this.monster1Name + "(이)가 항복했습니다.");
                }
                System.out.println("---------------------------------");
            }
        }
    }
}
