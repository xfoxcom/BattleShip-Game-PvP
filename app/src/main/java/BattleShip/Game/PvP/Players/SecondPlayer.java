package BattleShip.Game.PvP.Players;

import BattleShip.Game.PvP.Battlefield;
import BattleShip.Game.PvP.Builder.Builder;
import BattleShip.Game.PvP.Builder.BuilderImpl;
import BattleShip.Game.PvP.Ships.ListOfShips;
import java.util.List;

public class SecondPlayer extends Player{

    private char[][] battlefield = Battlefield.getPlayerTwo();

    private Builder builder = new BuilderImpl(battlefield);

    @Override
    public void start() {

        System.out.println("Player 2, place your ships on the game field: \n");

        Battlefield.showField(battlefield);

        List<ListOfShips> ships = List.of(
                ListOfShips.CARRIER,
                ListOfShips.BATTLESHIP,
                ListOfShips.SUBMARINE,
                ListOfShips.CRUISER,
                ListOfShips.DESTROYER);

        for (ListOfShips ship : ships) {

            builder
                    .construct(ship)
                    .build(battlefield);

            Battlefield.showField(battlefield);
        }

    }
}
