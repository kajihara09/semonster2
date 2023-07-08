package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {

    @Test
    public void TestToString() {
        Monster monster = new Monster("デュラハン",0);
        assertEquals("デュラハン:レア度[0]\n", monster.toString());
    }
}
