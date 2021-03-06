package com.codecool.quest.logic.items;

import com.codecool.quest.logic.Cell;
import com.codecool.quest.logic.actors.Player;

public class Gloryhammer extends Item {
    int damage = 200;
    int health = 200;

    public Gloryhammer(Cell cell) {
        super(cell);
    }

    @Override
    public void pickUp(Player player) {
        player.setDamage(player.getDamage()+damage);
        player.setHealth(player.getHealth()+health);
        super.pickUp(player);
    }

    @Override
    public String getTileName() {
        return "Gloryhammer";
    }
}
