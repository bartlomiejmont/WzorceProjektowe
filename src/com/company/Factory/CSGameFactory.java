package com.company.Factory;

import com.company.Game;
import com.company.PCGame;

public class CSGameFactory implements GameFactory {
    @Override
    public Game create() {
        return new PCGame("CS", "Shooter");
    }
}
