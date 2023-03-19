package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {

    private RangeCharacter superman = new RangeCharacter(12);
    private MyCharacter goku = new MyCharacter(2);
    private MyCharacter batman = new MyCharacter(2);
    Faction archers = new Faction("archers");
    Faction strikers = new Faction("strikers");

    public CharacterTest() {
        archers.addCharacter(superman);
        strikers.addCharacter(goku);
        strikers.addCharacter(batman);
    }

    @Test
    public void Health_is_1000() {
        assertEquals(1000, superman.getInitHealth());
    }

    @Test
    public void Level_is_1() {
        assertEquals(1, goku.getInitLevel());
    }

    @Test
    public void Character_Is_Alive() {
        assertEquals(true, goku.isAlive());

    }

    @Test
    public void no_faction_default() {
        RangeCharacter supermanneitor = new RangeCharacter(2);
        assertEquals(2, supermanneitor.getFaction());

    }

    @Test
    public void checked_damage() {
        goku.attackCharacter(superman);
        assertEquals(800, superman.getActualHealth());
    }

    @Test
    public void character_is_die() {
        superman.attackCharacter(goku);
        superman.attackCharacter(goku);
        superman.attackCharacter(goku);
        superman.attackCharacter(goku);
        superman.attackCharacter(goku);
        assertEquals(false, goku.isAlive());

    }

    @Test
    public void checked_sanation() {
        superman.attackCharacter(goku);
        superman.attackCharacter(goku);
        superman.attackCharacter(goku);
        goku.healCharacter(superman);
        assertEquals(450, goku.getActualHealth());
    }

    @Test
    public void checked_damage_myself() {
        goku.attackCharacter(goku);
        assertEquals(1000, goku.getActualHealth());

    }

    @Test
    public void checked_damage_level() {
        superman.setActualLevel(100);
        batman.setActualLevel(12);
        batman.attackCharacter(superman);
        assertEquals(900, superman.getActualHealth());
    }

    @Test
    public void MyCharacter_can_attack() {
        batman.attackCharacter(superman);

        assertEquals(800, superman.getActualHealth());
    }

    @Test
    public void Character_cant_attack() {
        MyCharacter miCharacter = new MyCharacter(5);
        Character youCharacter = new Character();

        miCharacter.attackCharacter(youCharacter);

        assertEquals(1000, youCharacter.getActualHealth());
    }

    @Test
    public void RangeCharacter_can_attack() {
        superman.attackCharacter(goku);
        assertEquals(800, goku.getActualHealth());
    }

    @Test
    public void RangeCharacter_cant_attack() {
        RangeCharacter miCharacter = new RangeCharacter(21);
        Character youCharacter = new Character();

        miCharacter.attackCharacter(youCharacter);

        assertEquals(1000, youCharacter.getActualHealth());
    }
}