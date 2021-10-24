package com.company.Factory;

import com.company.BoardGame;
import com.company.Game;

public class MonopolyGameFactory implements GameFactory {
    @Override
    public Game create() {
        return new BoardGame("Monopoly", "Family game");
    }
}
