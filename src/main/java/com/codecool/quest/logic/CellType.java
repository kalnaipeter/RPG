package com.codecool.quest.logic;

public enum CellType {
    EMPTY("empty"),
    FLOOR("floor"),
    WALL("wall"),
    PATH("path"),
    WATER("water"),
    BRIDGE("bridge"),
    TREE("tree"),
    ROCK("rock"),
    ZALGOTRAX("zalgotrax"),
    RUINED_WALL_PIECE("ruined_wall_piece"),
    WINE("wine"),
    FALSE_WALL("false_wall"),
    BLUE_OPENED_DOOR("blue_opened_door"),
    RED_OPENED_DOOR("red_opened_door");

    private final String tileName;

    CellType(String tileName) {
        this.tileName = tileName;
    }

    public String getTileName() {
        return tileName;
    }
}
