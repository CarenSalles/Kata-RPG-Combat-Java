package com.factoriaf5.kata;

public class Character {
    private Integer health = 1000;
    private Integer level = 1;
    private boolean alive = true;

    public Character(Integer health, Integer level, boolean alive) {
        this.health = health;
        this.level = level;
        this.alive = alive;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;

    }

    public Integer damage(Integer dmg) {
        return this.health - dmg;
    }

}
