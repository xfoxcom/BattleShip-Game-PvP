package BattleShip.Game.PvP.Ships;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Cruiser extends Submarine{

    public Cruiser(char x1, int y1, char x2, int y2) {
        super(x1, y1, x2, y2);
    }

}
