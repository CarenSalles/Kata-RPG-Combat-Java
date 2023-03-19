package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {

    @Test
    public void Character_Health_is_1000() {
        Character miCharacter =  new Character();
        assertEquals(1000, miCharacter.getHealth());
    }

    @Test
    public void level_is_1() {
        Character miCharacter = new Character("1000, 1, true")
        assertEquals(1, miCharacter.getLevel());
    }

    @Test
    public void Character__is__alive() {
        Character micCharacter = new Character("health:1000, 1, true")
        assertEquals(true, miCharacter.getAlive());
    }

    @Test
    public void damaged() {
        Character miCharacter = new Character("1000, 1, true");
        assertEquals(damage(50), miCharacter.getAlive());
    }

    private Object damage(int i) {
        return null;
    }

}
