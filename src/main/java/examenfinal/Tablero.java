package examenfinal;

import java.util.Arrays;

public class Tablero {
    private static Tablero instancia;
    private static int[][] a = new int[9][9];
    private Tablero(){

    }

    public static Tablero getInstance(){
        if(instancia==null){
            instancia=new Tablero();
            for (int[] row : a)
                Arrays.fill(row, 0);
        }
        return instancia;
    }

    public boolean drawPieza(Pieza pieza, int x, int y){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (a[x-i][y-j] == 1 && pieza.figura[i][j]==1){
                    return false;
                }
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (pieza.figura[i][j] == 1) {
                    a[x-i][y-j] = 1;
                }
            }
        }
        checkIfFigure();
        return true;
    }

    public void checkIfFigure(){
        for (int i = 0; i < 9; i++){
            boolean fila = true;
            for (int j = 0; j < 9; j++){
                if (a[i][j] == 0) {
                    fila = false;
                }
            }
            if (fila){
                for (int j = 0; j < 9; j++){
                    a[i][j] = 0;
                }
            }
        };
        for (int i = 0; i < 9; i++){
            boolean columna = true;
            for (int j = 0; j < 9; j++){
                if (a[j][i] == 0) {
                    columna = false;
                }
            }
            if (columna){
                for (int j = 0; j < 9; j++){
                    a[j][i] = 0;
                }
            }
        }
        //TODO check 3x3 to erase
    }

    public boolean checkIfWinner(){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if ( a[i][j]== 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
