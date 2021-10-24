package com.company.Prototype;

public class GameInfoManager {

    private static final GameInfo GAME_INFO = new GameInfo("CS","PC");

    public GameInfo crateGameInfoPrototype(final String title, final String platform) throws CloneNotSupportedException {
        GameInfo gameInfo = GAME_INFO.crateClone();
        gameInfo.setTitle(title);
        gameInfo.setPlatform(platform);
        return  gameInfo;
    }

}
