package BattleShip.Game.PvP.Ships;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BattleShip extends Ship{

    private static final int shipSize = 4;

    public BattleShip(char x1, int y1, char x2, int y2) {
        super(x1, y1, x2, y2);
    }

    public static int getShipSize() {
        return shipSize;
    }

}
