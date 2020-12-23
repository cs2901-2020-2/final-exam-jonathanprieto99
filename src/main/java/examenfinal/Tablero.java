package examenfinal;

import java.util.Arrays;

public class Tablero {
    private static Tablero instancia;
    private Tablero(){

    }

    public static Tablero getInstance(){
        if(instancia==null){
            instancia=new Tablero();
        }
        return instancia;
    }

    public int[][] draw(){
        int[][] a = new int[9][9];
        for (int[] row : a)
            Arrays.fill(row, 0);
        return a;
    }



}
