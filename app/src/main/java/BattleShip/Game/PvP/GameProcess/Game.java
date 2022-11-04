package BattleShip.Game.PvP.GameProcess;

import BattleShip.Game.PvP.Battlefield;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class Game implements Process {


    @Override
    public void play() {

        Scanner scr = new Scanner(System.in);

        while (winCondition(Battlefield.getPlayerOne()) & winCondition(Battlefield.getPlayerTwo())) {

            System.out.println("\nPress Enter and pass the move to another player\n...");
            scr.nextLine();

            Battlefield.showField(Battlefield.getPlayerTwoFogged());
            System.out.println("\n---------------------");
            Battlefield.showField(Battlefield.getPlayerOneFogged());

            System.out.println("\nPlayer 1, it's your turn:");
            shootShip(Battlefield.getPlayerTwo(), Battlefield.getPlayerTwoFogged());
            System.out.print("\nPress Enter and pass the move to another player\n...");
            scr.nextLine();


            Battlefield.showField(Battlefield.getPlayerOneFogged());
            System.out.println("\n---------------------");
            Battlefield.showField(Battlefield.getPlayerTwoFogged());
            System.out.println("\nPlayer 2, it's your turn:");
            shootShip(Battlefield.getPlayerOne(), Battlefield.getPlayerOneFogged());
        }

        System.out.println("You sank the last ship. You won. Congratulations!");
    }

    public boolean winCondition(char[][] field) {
        for (char[] chars : field) {
            for (char aChar : chars) {
                if (aChar == 'O') return true;
            }
        }
        return false;
    }

    void shootShip(char[][] field, char[][] fogField) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String[] str1 = str.split("(?<=\\D)(?=\\d)|(?<=\\d\\s)(?=\\D)");
        char c1 = str1[0].charAt(0);
        int c2 = Integer.parseInt(str1[1].trim());
        if (c1 >= 'A' & c1 <= 'J' | c2 >= 1 & c2 <= 10) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if ((field[i][j] == 'X' | field[i][j] == 'O') & i == (c1 - 'A') & j == (c2 - 1)) {
                        field[i][j] = 'X';
                        fogField[i][j] = 'X';
                        if (ship_is_up(field, c1, c2)) {
                            System.out.println("\nYou hit a ship!");
                        } else System.out.println("\nYou sank a ship!");

                    } else if ((field[i][j] == 'M' | field[i][j] == '~') & i == (c1 - 'A') & j == (c2 - 1)) {
                        field[i][j] = 'M';
                        fogField[i][j] = 'M';
                        System.out.println("\nYou missed!");

                    }
                }
            }
        } else System.out.println("Error! You entered the wrong coordinates! Try again: ");
    }

    public boolean ship_is_up(char[][] field, char c1, int c2) throws IndexOutOfBoundsException {

        int k = c1 - 'A', n = c2 - 1;

        try {
            return field[k-1][n] == 'O';
        }catch (IndexOutOfBoundsException e) {
            e.getMessage();
        }

        try {
           return field[k][n+1] == 'O';
        }catch (IndexOutOfBoundsException e) {
            e.getMessage();
        }

        try {
            return field[k+1][n] == 'O';
        }catch (IndexOutOfBoundsException e) {
            e.getMessage();
        }

        try {
            return field[k][n-1] == 'O';
        }catch (IndexOutOfBoundsException e) {
            e.getMessage();
        }

        return false;
    }
}

