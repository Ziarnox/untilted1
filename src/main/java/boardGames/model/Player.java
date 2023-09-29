package boardGames.model;

import boardGames.model.Games;

import java.util.List;

public class Player {
    private String nickName;
    private int currentAge;
    private List<Games> gamesHistory;

    public Player(String nickName, int currentAge) {
        this.nickName = nickName;
        this.currentAge = currentAge;
    }
    public void addGameHistory(Games game){
        gamesHistory.add(game);
    }

}
