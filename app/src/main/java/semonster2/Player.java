package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
    String name;
    ArrayList<Monster> monsterDeck = new ArrayList<>();
    LinkedList<Integer> randomNumberList; //ランダムな数字(0~4)を保存するLinkedList(連結リスト)

    Player(String playername, LinkedList<Integer> randomNumberList){
        this.name = playername;
        this.randomNumberList = randomNumberList;
    }

    //Monster5体入れる
    //Monsterクラスのコンストラクタの引数が(int name_num, int rare_num)であることが前提
    //summmonMonsterメソッドがある前提
    // public void putMonsters(){
    //     for(int i=0;i<5;i++){
    //         this.monsterDeck.add(new Monster(this.randomNumberList.pop(), this.randomNumberList.pop()));
    //     }
    // }

    @Override
    public String toString(){
        String deckName = "Deck:" + this.name + "\n";
        String deck = "";
        // for(int i=0;i<5;i++){
        //     deck += this.monsterDeck.get(i);
        // }
        return deckName + deck;
    }
}
