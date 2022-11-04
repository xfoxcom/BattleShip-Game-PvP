package BattleShip.Game.PvP.Builder;

import BattleShip.Game.PvP.Ships.*;

import java.util.Scanner;

public class BuilderImpl implements Builder {

    private final char[][] battlefield;

    public BuilderImpl(char[][] battlefield) {
        this.battlefield = battlefield;
    }

    @Override
    public Ship construct(ListOfShips ships) {
        switch (ships) {

            case CARRIER:
                return buildCarrier();
            case BATTLESHIP:
                return buildBattleShip();
            case CRUISER:
                return buildCruiser();
            case DESTROYER:
                return buildDestroyer();
            case SUBMARINE:
                return buildSubmarine();
            default:
                return null;

        }
    }

    @Override
    public Carrier buildCarrier() {
        Scanner scr = new Scanner(System.in);
        System.out.print("\nEnter the coordinates of the Aircraft Carrier (" + Carrier.getShipSize() + " cells): ");

        while (true) {
            String str = scr.nextLine();
            String[] str1 = str.split("(?<=\\D)(?=\\d)|(?<=\\d\\s)(?=\\D)");
            char c1 = str1[0].charAt(0);
            int c2 = Integer.parseInt(str1[1].trim());
            char c3 = str1[2].charAt(0);
            int c4 = Integer.parseInt(str1[3].trim());

            if (c1 != c3 & c2 != c4) {
                System.out.println("Error! Wrong ship location! Try again:\n");
                continue;
            }

            if (Math.abs(c3 - c1) != (Carrier.getShipSize() - 1) & Math.abs(c4 - c2) != (Carrier.getShipSize() - 1)) {
                System.out.println("Error! Wrong length of the Aircraft Carrier! Try again:\n ");
                continue;
            }

            return new Carrier(c1, c2, c3, c4);

        }
    }

    @Override
    public BattleShip buildBattleShip() {
        Scanner scr = new Scanner(System.in);
        System.out.print("\nEnter the coordinates of the Battleship (" + BattleShip.getShipSize() + " cells): ");

        while (true) {
            String str = scr.nextLine();
            String[] str1 = str.split("(?<=\\D)(?=\\d)|(?<=\\d\\s)(?=\\D)");
            char c1 = str1[0].charAt(0);
            int c2 = Integer.parseInt(str1[1].trim());
            char c3 = str1[2].charAt(0);
            int c4 = Integer.parseInt(str1[3].trim());

            if (c1 != c3 & c2 != c4) {
                System.out.println("Error! Wrong ship location! Try again:\n");
                continue;
            }

            if (Math.abs(c3 - c1) != (BattleShip.getShipSize() - 1) & Math.abs(c4 - c2) != (BattleShip.getShipSize() - 1)) {
                System.out.println("Error! Wrong length of the Battleship! Try again:\n ");
                continue;
            }

            if (checkDistance(c1, c2, c3, c4)) {
                System.out.println("Error! You placed it too close to another one. Try again:");
                continue;
            }

            return new BattleShip(c1, c2, c3, c4);

        }
    }

    @Override
    public Cruiser buildCruiser() {

        Scanner scr = new Scanner(System.in);
        System.out.print("\nEnter the coordinates of the Cruiser (" + Cruiser.getShipSize() + " cells): ");

        while (true) {

            String str = scr.nextLine();
            String[] str1 = str.split("(?<=\\D)(?=\\d)|(?<=\\d\\s)(?=\\D)");
            char c1 = str1[0].charAt(0);
            int c2 = Integer.parseInt(str1[1].trim());
            char c3 = str1[2].charAt(0);
            int c4 = Integer.parseInt(str1[3].trim());

            if (c1 != c3 & c2 != c4) {
                System.out.println("Error! Wrong ship location! Try again:\n");
                continue;
            }

            if (Math.abs(c3 - c1) != (Cruiser.getShipSize() - 1) & Math.abs(c4 - c2) != (Cruiser.getShipSize() - 1)) {
                System.out.println("Error! Wrong length of the Cruiser! Try again:\n ");
                continue;
            }

            if (checkDistance(c1, c2, c3, c4)) {
                System.out.println("Error! You placed it too close to another one. Try again:");
                continue;
            }

            return new Cruiser(c1, c2, c3, c4);

        }
    }

    @Override
    public Destroyer buildDestroyer() {

        Scanner scr = new Scanner(System.in);
        System.out.print("\nEnter the coordinates of the Destroyer (" + Destroyer.getShipSize() + " cells): ");

        while (true) {

            String str = scr.nextLine();
            String[] str1 = str.split("(?<=\\D)(?=\\d)|(?<=\\d\\s)(?=\\D)");
            char c1 = str1[0].charAt(0);
            int c2 = Integer.parseInt(str1[1].trim());
            char c3 = str1[2].charAt(0);
            int c4 = Integer.parseInt(str1[3].trim());

            if (c1 != c3 & c2 != c4) {
                System.out.println("Error! Wrong ship location! Try again:\n");
                continue;
            }

            if (Math.abs(c3 - c1) != (Destroyer.getShipSize() - 1) & Math.abs(c4 - c2) != (Destroyer.getShipSize() - 1)) {
                System.out.println("Error! Wrong length of the Destroyer! Try again:\n ");
                continue;
            }

            if (checkDistance(c1, c2, c3, c4)) {
                System.out.println("Error! You placed it too close to another one. Try again:");
                continue;
            }

            return new Destroyer(c1, c2, c3, c4);

        }

    }

    @Override
    public Submarine buildSubmarine() {

        Scanner scr = new Scanner(System.in);
        System.out.print("\nEnter the coordinates of the Submarine (" + Submarine.getShipSize() + " cells): ");

        while (true) {

            String str = scr.nextLine();
            String[] str1 = str.split("(?<=\\D)(?=\\d)|(?<=\\d\\s)(?=\\D)");
            char c1 = str1[0].charAt(0);
            int c2 = Integer.parseInt(str1[1].trim());
            char c3 = str1[2].charAt(0);
            int c4 = Integer.parseInt(str1[3].trim());

            if (c1 != c3 & c2 != c4) {
                System.out.println("Error! Wrong ship location! Try again:\n");
                continue;
            }

            if (Math.abs(c3 - c1) != (Submarine.getShipSize() - 1) & Math.abs(c4 - c2) != (Submarine.getShipSize() - 1)) {
                System.out.println("Error! Wrong length of the Submarine! Try again:\n ");
                continue;
            }

            if (checkDistance(c1, c2, c3, c4)) {
                System.out.println("Error! You placed it too close to another one. Try again:");
                continue;
            }

            return new Submarine(c1, c2, c3, c4);

        }

    }

    public boolean checkDistance(char c1, int c2, char c3, int c4) throws IndexOutOfBoundsException {
        if (c2 <= c4 & c1 <= c3) {
            for (int k = (c1 - 'A'); k <= (c3 - 'A'); k++) {
                for (int n = (c2 - 1); n < c4; n++) {
                    if (battlefield[k][n] == 'O') {
                        return true;
                    } else
                        try {
                            if (
                                    (battlefield[k - 1][n - 1] == 'O') | (battlefield[k - 1][n + 1] == 'O') |
                                            (battlefield[k - 1][n] == 'O') | (battlefield[k][n - 1] == 'O') |
                                            (battlefield[k + 1][n + 1] == 'O') | (battlefield[k][n + 1] == 'O') |
                                            (battlefield[k + 1][n - 1] == 'O') | (battlefield[k + 1][n] == 'O')) {
                                return true;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            e.getMessage();
                        }
                }
            }
        }
        if (c2 >= c4 & c1 >= c3) {
            for (int k = (c3 - 'A'); k <= (c1 - 'A'); k++) {
                for (int n = (c4 - 1); n < c2; n++) {
                    if (battlefield[k][n] == 'O') {
                        return true;
                    } else
                        try {
                            if (
                                    (battlefield[k - 1][n - 1] == 'O') | (battlefield[k - 1][n + 1] == 'O') |
                                            (battlefield[k - 1][n] == 'O') | (battlefield[k][n - 1] == 'O') |
                                            (battlefield[k + 1][n + 1] == 'O') | (battlefield[k][n + 1] == 'O') |
                                            (battlefield[k + 1][n - 1] == 'O') | (battlefield[k + 1][n] == 'O')) {
                                return true;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            e.getMessage();
                        }
                }
            }
        }
        return false;
    }

}
