package BattleShip.Game.PvP;

import BattleShip.Game.PvP.GameProcess.Game;
import BattleShip.Game.PvP.Players.FirstPlayer;
import BattleShip.Game.PvP.Players.SecondPlayer;

public class Play {

    public static void main(String[] args) {

        FirstPlayer firstPlayer = new FirstPlayer();

        SecondPlayer secondPlayer = new SecondPlayer();

        firstPlayer.start();

        secondPlayer.start();

        Game game =new Game();

        game.play();

    }

}
