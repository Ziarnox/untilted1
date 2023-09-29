package boardGames.model;

import boardGames.model.enums.Complexity;
import boardGames.model.enums.GameType;

public class Games {
    private int playingTime;
    private GameType gameType;
    private Complexity complexity;
    private int minPlayers;
    private int maxPlayers;

    public Games(int playingTime, Complexity complexity, GameType gameType, int minPlayers, int maxPlayers) {
        this.playingTime = playingTime;
        this.complexity = complexity;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.gameType = gameType;
    }

    public GameType getGameType() {
        return gameType;
    }
}
