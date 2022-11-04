package BattleShip.Game.PvP.Players;

import BattleShip.Game.PvP.Builder.Builder;
import lombok.Data;

@Data
public abstract class Player {

    private Builder builder;

    private char[][] battlefield;

    abstract public void start();

}
