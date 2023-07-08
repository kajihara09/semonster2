package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {

    @Test
    public void TestToString1() {
        Monster monster = new Monster("デュラハン",0);
        assertEquals("デュラハン:レア度[0]\n", monster.toString());
    }

    @Test
    public void TestToString2() {
      Monster classUnderTest_monster = new Monster("スライム", 3);
      String String_expected = "強スライム:レア度[3]\n";
      assertEquals(String_expected, classUnderTest_monster.toString());
    }

    @Test
    public void TestSummonMonster() {
      Monster classUnderTest_monster = new Monster(0);
      String String_expected = "スライム:レア度[0]\n";
      assertEquals(String_expected, classUnderTest_monster.toString());
    }

}
