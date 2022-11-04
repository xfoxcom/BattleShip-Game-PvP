package BattleShip.Game.PvP.Ships;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Ship  {

    private char x1;
    private int y1;
    private char x2;
    private int y2;

    public void build(char[][] field) {

        if (y1 <= y2 & x1 <= x2) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (i == (x1 - 'A') & (j == (y1 - 1))) {
                        for (int k = (x1 - 'A'); k <= (x2 - 'A'); k++) {
                            for (int n = (y1 - 1); n < y2; n++) {
                                field[k][n] = 'O';
                            }
                        }
                    }
                }
            }
        }
        if (y1 >= y2 & x1 >= x2) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (i == (x1 - 'A') & (j == (y1 - 1))) {
                        for (int k = (x2 - 'A'); k <= (x1 - 'A'); k++) {
                            for (int n = (y2 - 1); n < y1; n++) {
                                field[k][n] = 'O';
                            }
                        }
                    }
                }
            }

        }
    }

}
