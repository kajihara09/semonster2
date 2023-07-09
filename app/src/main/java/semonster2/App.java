/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

import java.util.LinkedList;
import java.util.Random;

public class App {
  final static Random random = new Random();
  final static int maxRandomNumber = 4;

  public String getGreeting() {
    return "こんにちは SEMonster!";
  }

  public static LinkedList<Integer> createRandomList(int count){
    LinkedList<Integer> randomNumberList = new LinkedList<>();
    for (int i=0;i<count;i++){
      randomNumberList.add(random.nextInt(maxRandomNumber + 1));
    }
    return randomNumberList;
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    Monster monster1 = new Monster("デュラハン",3);
    System.out.println(monster1.toString());

    Monster monster2 = new Monster(4, 0);
    System.out.println(monster2.toString());

    Player player = new Player("user", createRandomList(10));
    player.putMonsters();
    System.out.println(player.toString());
  }
}
