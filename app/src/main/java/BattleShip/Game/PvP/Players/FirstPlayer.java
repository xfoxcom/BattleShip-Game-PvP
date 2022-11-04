package BattleShip.Game.PvP.Players;

import BattleShip.Game.PvP.Battlefield;
import BattleShip.Game.PvP.Builder.Builder;
import BattleShip.Game.PvP.Builder.BuilderImpl;
import BattleShip.Game.PvP.Ships.ListOfShips;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class FirstPlayer extends Player {

    private char[][] battlefield = Battlefield.getPlayerOne();

    private Builder builder = new BuilderImpl(battlefield);

    @Override
    public void start() {

        Scanner scr = new Scanner(System.in);

        System.out.println("Player 1, place your ships on the game field: \n");

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

        System.out.print("\nPress Enter and pass the move to another player\n...");
        scr.nextLine();

    }

}
