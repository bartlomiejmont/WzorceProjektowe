package com.company;

public class PCGame implements Game{

    private String name;
    private String type;

    public PCGame(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return true;
    }

    @Override
    public String toString() {
        return "PCGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
