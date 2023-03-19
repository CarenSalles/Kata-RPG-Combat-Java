package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactionTest {

    private RangeCharacter superman = new RangeCharacter(12);
    private MyCharacter goku = new MyCharacter(2);
    private MyCharacter batman = new MyCharacter(2);
    Faction archers = new Faction("archers");
    Faction strikers = new Faction("strikers");

    public FactionTest() {
        strikers.addCharacter(goku);
        strikers.addCharacter(batman);
    }

    @Test
    void add_character_faction() {
        archers.addCharacter(superman);
        assertEquals("archers", superman.getFaction().getName());
    }

    @Test
    void character_dont_attack_allies() {
        goku.attackCharacter(batman);
        assertEquals(1000, batman.getActualHealth());
    }

    @Test
    void enemys_cant_heal() {
        superman.attackCharacter(goku);
        superman.attackCharacter(goku);
        superman.attackCharacter(goku);
        assertEquals(600, goku.getActualHealth());
    }

    @Test
    void allies_can_heal() {
        superman.attackCharacter(goku);
        superman.attackCharacter(goku);
        batman.healCharacter(goku);
        assertEquals(650, goku.getActualHealth());
    }

}
