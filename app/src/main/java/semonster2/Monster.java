package semonster2;

public class Monster {
  String name;
  int rare;

  Monster(int rare_num) {
    this.name = summonMonster(rare_num);
    this.rare = rare_num;
  }

  Monster(String name, int rare_num) {
    this.name = evolutionMonster(name, rare_num);
    this.rare = rare_num;
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]\n";
  }

  public String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  public String evolutionMonster(String name, int mnumber) {
    if (mnumber >= 3) {
      name = "強" + name;
    }
    return name;
  }

}
