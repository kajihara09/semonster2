package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    //名前入ってるか
    @Test public void PlayerHasName() {
        App classUnderTest = new App();
        Player classUnderTest_player = new Player("user", App.createRandomList(10));
        assertNotNull("player should have a name", classUnderTest_player.name);
    }

    //モンスター5体入ってるか
    @Test public void PlayerHas5Monsters(){
        App classUnderTest = new App();
        Player classUnderTest_player = new Player("user", App.createRandomList(10));
        assertNotNull("player should have five monsters", classUnderTest_player.monsterDeck);
    }
}
