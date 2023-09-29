package boardGames.Interfaces;
import boardGames.model.Games;
import boardGames.model.enums.GameType;

import java.util.ArrayList;
import java.util.List;

public class BoardGamePubImpl implements BoardGamePub {
    private List<Games> ongoingStorytellingGames = new ArrayList<>();
    @Override
    public boolean canGameStart(int minPlayers, int maxPlayers, GameType gameType) {
        if (isFree()){
            return ;
        }
        if (gameType == GameType.STORYTELLING) {
            if (isStorytellingGameInProgress()) {
                return false;
            }
        }
        if (gameType == GameType.PUZZLE && minPlayers != 1 && maxPlayers != 1) {
            return false;
        }
        if (gameType == GameType.CARDGAME && minPlayers < 1 && maxPlayers > 6) {
            return false;
        }
        if (gameType == GameType.STORYTELLING && minPlayers < 1 && maxPlayers > 6) {
            return false;
        }
        return true;
    }

    private boolean isStorytellingGameInProgress() {
        for (Games games : ongoingStorytellingGames) {
            if (games.getGameType() == GameType.STORYTELLING) {
                return true;
            }
        }
        return false;
    }
    private boolean isFree(){

        return ;
    }
}
