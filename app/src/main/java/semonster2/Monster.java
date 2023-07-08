package semonster2;

public class Monster {
  String name;
  int rare;

    Monster(String name,int rareNum){
    this.name = name;
    this.rare = rareNum;
    if (this.rare >= 3){
      this.evolutionMonster();
    }
  }

  Monster(int nameNum,int rareNum){
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;
    if (this.rare >= 3){
      this.evolutionMonster();
    }
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  void evolutionMonster(){
    this.name = "強・" + this.name;
  }

  @Override
  public String toString(){
    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
