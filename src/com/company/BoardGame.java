package com.company;

public class BoardGame implements Game {

    private String name;
    private String type;

    public BoardGame(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return false;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
