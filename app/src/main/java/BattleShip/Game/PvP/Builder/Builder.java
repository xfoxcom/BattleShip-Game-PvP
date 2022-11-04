package BattleShip.Game.PvP.Builder;

import BattleShip.Game.PvP.Ships.*;

public interface Builder {

    Ship construct(ListOfShips ships);

    Carrier buildCarrier();

    BattleShip buildBattleShip();

    Cruiser buildCruiser();

    Destroyer buildDestroyer();

    Submarine buildSubmarine();

}
