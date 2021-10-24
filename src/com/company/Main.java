package com.company;

import com.company.Adapter.Adapter;
import com.company.Adapter.NewInterface;
import com.company.Adapter.OldClass;
import com.company.Factory.CSGameFactory;
import com.company.Factory.GameFactory;
import com.company.Factory.MonopolyGameFactory;
import com.company.Prototype.GameInfo;
import com.company.Prototype.GameInfoManager;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
//        Singleton s = new Singleton();
//        Singleton.instance

        final GameInfoManager gameInfoManager = new GameInfoManager();

        GameInfo gameInfo1 = null;
        GameInfo gameInfo2 = null;

        try {
             gameInfo1 = gameInfoManager.crateGameInfoPrototype("Witcher","Xbox");
             gameInfo2 = gameInfoManager.crateGameInfoPrototype("Tetris","GameBoy");
        } catch (CloneNotSupportedException e){

        }
        List<String> movies = new ArrayList<String>();
        movies.add("movie1");
        movies.add("movie2");
        movies.add("movie3");

        NewInterface person = (new Adapter(new OldClass("Bartek", "Mont", movies)));
        System.out.println(person.getFullName());
        System.out.println(person.getFirstAndLastMovie());
    }
}
