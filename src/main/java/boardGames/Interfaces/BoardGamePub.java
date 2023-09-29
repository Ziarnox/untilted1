package boardGames.Interfaces;

import boardGames.model.enums.GameType;
public interface BoardGamePub {
    public default boolean canGameStart(){

    return true;
    }

    boolean canGameStart(int minPlayers,int maxPlayers, GameType gameType);
}
