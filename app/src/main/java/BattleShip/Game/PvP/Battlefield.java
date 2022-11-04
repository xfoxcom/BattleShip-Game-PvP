package BattleShip.Game.PvP;

import lombok.Data;

import java.util.Arrays;

@Data
public class Battlefield {

    private static char[][] playerOne;
    private static char[][] playerTwo;
    private static char[][] playerOneFogged;
    private static char[][] playerTwoFogged;

    public Battlefield() {}

    public static char[][] getPlayerOne() {
        if (playerOne == null) {
            playerOne = new char[10][10];
            for (char[] i : playerOne) {
                Arrays.fill(i, '~');
            }
        }
        return playerOne;
    }

    public static char[][] getPlayerTwo() {
        if (playerTwo == null) {
            playerTwo = new char[10][10];
            for (char[] i : playerTwo) {
                Arrays.fill(i, '~');
            }
        }
        return playerTwo;
    }

    public static char[][] getPlayerOneFogged() {
        if (playerOneFogged == null) {
            playerOneFogged = new char[10][10];
            for (char[] i : playerOneFogged) {
                Arrays.fill(i, '~');
            }
        }
        return playerOneFogged;
    }

    public static char[][] getPlayerTwoFogged() {
        if (playerTwoFogged == null) {
            playerTwoFogged = new char[10][10];
            for (char[] i : playerTwoFogged) {
                Arrays.fill(i, '~');
            }
        }
        return playerTwoFogged;
    }

    public static void showField(char[][] player) {
        char A = 'A';
        System.out.print(" ");
        for (int i =1; i<=10; i++) {
            System.out.print(" " + i);
        }
        for (char[] chars : player) {
            System.out.print("\n" + A++ + " ");
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
        }
    }

}
