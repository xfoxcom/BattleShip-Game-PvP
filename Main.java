import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        boolean check = true;
        char[][] field = new char[10][10];
        char[][] field2 = new char[10][10];
        char[][] fogField = new char[10][10];
        char[][] fogField2 = new char[10][10];
        for (char[] i: fogField) {
            Arrays.fill(i, '~');
        }
        for (char[] chars : field) {
            Arrays.fill(chars, '~');
        }
        for (char[] i: fogField2) {
            Arrays.fill(i, '~');
        }
        for (char[] chars : field2) {
            Arrays.fill(chars, '~');
        }

        System.out.println("Player 1, place your ships on the game field");
        showField(field);

        System.out.print("\nEnter the coordinates of the Aircraft Carrier (5 cells): ");
        while (check) {
            try {
                buildCarrier(field);
                check = false;
            } catch (wrongLengthException e) {
                System.out.println("Error! Wrong length of the Aircraft Carrier! Try again:\n ");
            } catch (wrongLocationException e) {
                System.out.println("Error! Wrong ship location! Try again:\n");
            } catch (tooCloseException e) {
                System.out.println("Error! You placed it too close to another one. Try again:\n");
            }
        }

        showField(field);

        System.out.print("\nEnter the coordinates of the Battleship (4 cells): ");

        while (!check) {
            try {
                battleShip(field);
                check = true;
            } catch (wrongLengthException e) {
                System.out.println("Error! Wrong length of the Battleship! Try again:\n ");
            } catch (wrongLocationException e) {
                System.out.println("Error! Wrong ship location! Try again:\n");
            } catch (tooCloseException e) {
                System.out.println("Error! You placed it too close to another one. Try again:\n");
            }
        }

        showField(field);

        System.out.print("\nEnter the coordinates of the Submarine (3 cells): ");

        while (check) {
            try {
                buildSubmarine(field);
                check = false;
            } catch (wrongLengthException e) {
                System.out.println("Error! Wrong length of the Submarine! Try again:\n ");
            } catch (wrongLocationException e) {
                System.out.println("Error! Wrong ship location! Try again:\n");
            } catch (tooCloseException e) {
                System.out.println("Error! You placed it too close to another one. Try again:\n");
            }
        }

        showField(field);

        System.out.print("\nEnter the coordinates of the Cruiser (3 cells): ");

        while (!check) {
            try {
                buildSubmarine(field);
                check = true;
            } catch (wrongLengthException e) {
                System.out.println("Error! Wrong length of the Cruiser! Try again:\n ");
            } catch (wrongLocationException e) {
                System.out.println("Error! Wrong ship location! Try again:\n");
            } catch (tooCloseException e) {
                System.out.println("Error! You placed it too close to another one. Try again:\n");
            }
        }

        showField(field);

        System.out.print("\nEnter the coordinates of the Destroyer (2 cells): ");

        while (check) {
            try {
                buildDestroyer(field);
                check = false;
            } catch (wrongLengthException e) {
                System.out.println("Error! Wrong length of the Destroyer! Try again:\n ");
            } catch (wrongLocationException e) {
                System.out.println("Error! Wrong ship location! Try again:\n");
            } catch (tooCloseException e) {
                System.out.println("Error! You placed it too close to another one. Try again:\n");
            }
        }
        showField(field);

        ///////  Second Player

        System.out.print("\nPress Enter and pass the move to another player\n...");
        scr.nextLine();
        System.out.println("Player 2, place your ships on the game field");
        showField(field2);

        System.out.print("\nEnter the coordinates of the Aircraft Carrier (5 cells): ");
        while (!check) {
            try {
                buildCarrier(field2);
                check = true;
            } catch (wrongLengthException e) {
                System.out.println("Error! Wrong length of the Aircraft Carrier! Try again:\n ");
            } catch (wrongLocationException e) {
                System.out.println("Error! Wrong ship location! Try again:\n");
            } catch (tooCloseException e) {
                System.out.println("Error! You placed it too close to another one. Try again:\n");
            }
        }

        showField(field2);

        System.out.print("\nEnter the coordinates of the Battleship (4 cells): ");

        while (check) {
            try {
                battleShip(field2);
                check = false;
            } catch (wrongLengthException e) {
                System.out.println("Error! Wrong length of the Battleship! Try again:\n ");
            } catch (wrongLocationException e) {
                System.out.println("Error! Wrong ship location! Try again:\n");
            } catch (tooCloseException e) {
                System.out.println("Error! You placed it too close to another one. Try again:\n");
            }
        }

        showField(field2);

        System.out.print("\nEnter the coordinates of the Submarine (3 cells): ");

        while (!check) {
            try {
                buildSubmarine(field2);
                check = true;
            } catch (wrongLengthException e) {
                System.out.println("Error! Wrong length of the Submarine! Try again:\n ");
            } catch (wrongLocationException e) {
                System.out.println("Error! Wrong ship location! Try again:\n");
            } catch (tooCloseException e) {
                System.out.println("Error! You placed it too close to another one. Try again:\n");
            }
        }

        showField(field2);

        System.out.print("\nEnter the coordinates of the Cruiser (3 cells): ");

        while (check) {
            try {
                buildSubmarine(field2);
                check = false;
            } catch (wrongLengthException e) {
                System.out.println("Error! Wrong length of the Cruiser! Try again:\n ");
            } catch (wrongLocationException e) {
                System.out.println("Error! Wrong ship location! Try again:\n");
            } catch (tooCloseException e) {
                System.out.println("Error! You placed it too close to another one. Try again:\n");
            }
        }

        showField(field2);

        System.out.print("\nEnter the coordinates of the Destroyer (2 cells): ");

        while (!check) {
            try {
                buildDestroyer(field2);
                check = true;
            } catch (wrongLengthException e) {
                System.out.println("Error! Wrong length of the Destroyer! Try again:\n ");
            } catch (wrongLocationException e) {
                System.out.println("Error! Wrong ship location! Try again:\n");
            } catch (tooCloseException e) {
                System.out.println("Error! You placed it too close to another one. Try again:\n");
            }
        }
        showField(field2);

        while (winCondition(field) & winCondition(field2)) {
            System.out.println("\nPress Enter and pass the move to another player\n...");
            scr.nextLine();

            showField(fogField2);
            System.out.println("\n---------------------");
            showField(field);
            System.out.println("\nPlayer 1, it's your turn:");
            shootShip(field2, fogField2);
            System.out.print("\nPress Enter and pass the move to another player\n...");
            scr.nextLine();


            showField(fogField);
            System.out.println("\n---------------------");
            showField(field2);
            System.out.println("\nPlayer 2, it's your turn:");
            shootShip(field, fogField);
        }
        System.out.println("You sank the last ship. You won. Congratulations!");
    }


    public static boolean winCondition(char[][] field) {
        for (int i = 0 ; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j]=='O') return true;
            }
        }
        return false;
    }

    public static void shootShip(char[][] field, char[][] fogField) {
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
                        fogField[i][j]='X';
                        //  showField(fogField);
                        if (sinkShip(field, c1, c2)) {
                            System.out.println("\nYou hit a ship!");
                        } else System.out.println("\nYou sank a ship!");

                    } else if ((field[i][j] == 'M' | field[i][j] == '~') & i == (c1 - 'A') & j == (c2 - 1)) {
                        field[i][j] = 'M';
                        fogField[i][j]='M';
                        // showField(fogField);
                        System.out.println("\nYou missed!");

                    }
                }
            }
        } else System.out.println("Error! You entered the wrong coordinates! Try again: ");
    }

    public static void showField(char[][] field) {
        char A = 'A';
        System.out.print(" ");
        for (int i =1; i<=10; i++) {
            System.out.print(" " + i);
        }
        for (int i=0; i< field.length; i++) {
            System.out.print("\n" + A++ + " ");
            for (int j=0; j<field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
        }
    }

    public static void shipBuilder(char[][] field, char c1, int c2, char c3, int c4) {
        System.out.println(" ");
        if (c2<=c4 & c1<=c3) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (i == (c1 - 'A') & (j == (c2 - 1))) {
                        for (int k = (c1 - 'A'); k <= (c3 - 'A'); k++) {
                            for (int n = (c2 - 1); n < c4; n++) {
                                field[k][n] = 'O';
                            }
                        }
                    }
                }
            }
        }
        if (c2>=c4 & c1>=c3) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (i == (c1 - 'A') & (j == (c2 - 1))) {
                        for (int k = (c3 - 'A'); k <= (c1 - 'A'); k++) {
                            for (int n =(c4-1) ; n < c2  ; n++) {
                                field[k][n] = 'O';
                            }
                        }
                    }
                }
            }

        }
    }

    public static void buildCarrier(char[][] field)  throws wrongLengthException, tooCloseException, wrongLocationException {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String[] str1 = str.split("(?<=\\D)(?=\\d)|(?<=\\d\\s)(?=\\D)");
        char c1 = str1[0].charAt(0);
        int c2 = Integer.parseInt(str1[1].trim());
        char c3 = str1[2].charAt(0);
        int c4 = Integer.parseInt(str1[3].trim());


        if (c1!=c3 & c2!=c4) {
            throw new wrongLocationException("Error! Wrong ship location! Try again:\n");
        }

        if (Math.abs(c3-c1) != 4 & Math.abs(c4-c2) != 4) {
            throw new wrongLengthException("Error! Wrong length of the Aircraft Carrier! Try again:\n ");
        }
        else {
            shipBuilder(field, c1, c2, c3, c4);
        }
    }

    public static void battleShip(char[][] field)  throws wrongLengthException, tooCloseException, wrongLocationException {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String[] str1 = str.split("(?<=\\D)(?=\\d)|(?<=\\d\\s)(?=\\D)");
        char c1 = str1[0].charAt(0);
        int c2 = Integer.parseInt(str1[1].trim());
        char c3 = str1[2].charAt(0);
        int c4 = Integer.parseInt(str1[3].trim());


        if (c1!=c3 & c2!=c4) {
            throw new wrongLocationException("Error! Wrong ship location! Try again:\n");
        }

        if (Math.abs(c3-c1) != 3 & Math.abs(c4-c2) != 3) {
            throw new wrongLengthException("Error! Wrong length of the Aircraft Carrier! Try again:\n ");
        }

        if (checkDistance(field, c1, c2, c3, c4)) {
            throw new tooCloseException("Error! You placed it too close to another one. Try again:");
        }
        else {
            shipBuilder(field, c1, c2, c3, c4);
        }
    }

    public static void buildSubmarine(char[][] field) throws wrongLengthException, tooCloseException, wrongLocationException {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String[] str1 = str.split("(?<=\\D)(?=\\d)|(?<=\\d\\s)(?=\\D)");
        char c1 = str1[0].charAt(0);
        int c2 = Integer.parseInt(str1[1].trim());
        char c3 = str1[2].charAt(0);
        int c4 = Integer.parseInt(str1[3].trim());


        if (c1!=c3 & c2!=c4) {
            throw new wrongLocationException("Error! Wrong ship location! Try again:\n");
        }

        if (Math.abs(c3-c1) != 2 & Math.abs(c4-c2) != 2) {
            throw new wrongLengthException("Error! Wrong length of the Aircraft Carrier! Try again:\n ");
        }

        if (checkDistance(field, c1, c2, c3, c4)) {
            throw new tooCloseException("Error! You placed it too close to another one. Try again:");
        }
        else {
            shipBuilder(field, c1, c2, c3, c4);
        }
    }

    public static void buildDestroyer(char[][] field) throws wrongLengthException, tooCloseException, wrongLocationException {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String[] str1 = str.split("(?<=\\D)(?=\\d)|(?<=\\d\\s)(?=\\D)");
        char c1 = str1[0].charAt(0);
        int c2 = Integer.parseInt(str1[1].trim());
        char c3 = str1[2].charAt(0);
        int c4 = Integer.parseInt(str1[3].trim());


        if (c1!=c3 & c2!=c4) {
            throw new wrongLocationException("Error! Wrong ship location! Try again:\n");
        }

        if (Math.abs(c3-c1) != 1 & Math.abs(c4-c2) != 1) {
            throw new wrongLengthException("Error! Wrong length of the Aircraft Carrier! Try again:\n ");
        }

        if (checkDistance(field, c1, c2, c3, c4)) {
            throw new tooCloseException("Error! You placed it too close to another one. Try again:");
        }
        else {
            shipBuilder(field, c1, c2, c3, c4);
        }
    }

    public static boolean checkDistance(char[][] field, char c1, int c2, char c3, int c4) throws IndexOutOfBoundsException {
        // boolean p = true;
        if (c2<=c4 & c1<=c3) {
            for (int k = (c1 - 'A'); k <= (c3 - 'A'); k++) {
                for (int n = (c2 - 1); n < c4; n++) {
                    if (field[k][n] == 'O') {
                        return true;
                    } else
                        try {
                            if ((field[k - 1][n - 1] == 'O') | (field[k - 1][n + 1] == 'O') | (field[k - 1][n] == 'O') | (field[k][n - 1] == 'O') | (field[k+1][n+1] == 'O') | (field[k][n + 1] == 'O') | (field[k + 1][n - 1] == 'O') | (field[k + 1][n] == 'O')) {
                                return true;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            //System.out.println("");
                        }
                }
            }
        }
        if (c2>=c4 & c1>=c3) {
            for (int k = (c3 - 'A'); k <= (c1 - 'A'); k++) {
                for (int n = (c4 - 1); n < c2; n++) {
                    if (field[k][n] == 'O') {
                        return true;
                    } else
                        try {
                            if ((field[k - 1][n - 1] == 'O') | (field[k - 1][n + 1] == 'O') | (field[k - 1][n] == 'O') | (field[k][n - 1] == 'O') | (field[k+1][n+1] == 'O') | (field[k][n + 1] == 'O') | (field[k + 1][n - 1] == 'O') | (field[k + 1][n] == 'O')) {
                                return true;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            //System.out.println("");
                        }
                }
            }
        }
        return false;
    }

    public static boolean sinkShip(char[][] field, char c1, int c2) throws IndexOutOfBoundsException {
        int k=c1-'A', n=c2-1;
        try {
            if ((field[k - 1][n - 1] == 'O') | (field[k - 1][n + 1] == 'O') | (field[k - 1][n] == 'O') | (field[k][n - 1] == 'O') | (field[k+1][n+1] == 'O') | (field[k][n + 1] == 'O') | (field[k + 1][n - 1] == 'O') | (field[k + 1][n] == 'O')) {
                return true;
            } else return false;
        } catch (IndexOutOfBoundsException ignored) {

        }
        return false;
    }
}