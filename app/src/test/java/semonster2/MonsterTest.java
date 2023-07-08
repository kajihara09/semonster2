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
        Monster monster = new Monster("デュラハン",3);
        assertEquals("強・デュラハン:レア度[0]\n", monster.toString());
    }

    @Test
    public void TestToString2() {
        Monster monster = new Monster(4, 0);
        assertEquals("シーサーペント:レア度[0]\n", monster.toString());
    }
}
