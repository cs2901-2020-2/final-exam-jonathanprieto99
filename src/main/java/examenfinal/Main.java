package examenfinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Bienvenido!");
        System.out.println("Iniciando nuevo tablero");
        int posicionX, posicionY;
        boolean ganar = false;
        Tablero tablero = Tablero.getInstance();
        PiezaA piezaA = new PiezaA();
        PiezaB piezaB = new PiezaB();
        PiezaC piezaC = new PiezaC();
        PiezaD piezaD = new PiezaD();
        PiezaE piezaE = new PiezaE();
        PiezaF piezaF = new PiezaF();
        PiezaG piezaG = new PiezaG();
        PiezaH piezaH = new PiezaH();
        PiezaMaker facade = new PiezaMaker(piezaA, piezaB, piezaC, piezaD, piezaE, piezaF, piezaG, piezaH);
        facade.drawPiezas();
        while(!ganar){
            do {
                System.out.println("Elija la posicion del tablero donde aparecera nueva pieza: ");
                Scanner scanner = new Scanner(System.in);
                posicionX = scanner.nextInt();
                posicionY = scanner.nextInt();
                if (posicionX <= 2 || posicionY >= 7) {
                    System.out.println("Coordenadas incorrectas, intente nuevamente.");
                }
            } while(posicionX <= 2 || posicionY >= 7);
            int pieza = (int)(Math.random() * 8) + 1;
            switch (pieza){
                case 1: {
                    tablero.drawPieza(piezaA, posicionX, posicionY);
                    break;
                }
                case 2: {
                    tablero.drawPieza(piezaB, posicionX, posicionY);
                    break;
                }
                case 3: {
                    tablero.drawPieza(piezaC, posicionX, posicionY);
                    break;
                }
                case 4: {
                    tablero.drawPieza(piezaD, posicionX, posicionY);
                    break;
                }
                case 5: {
                    tablero.drawPieza(piezaE, posicionX, posicionY);
                    break;
                }
                case 6: {
                    tablero.drawPieza(piezaF, posicionX, posicionY);
                    break;
                }
                case 7: {
                    tablero.drawPieza(piezaG, posicionX, posicionY);
                    break;
                }
                case 8: {
                    tablero.drawPieza(piezaH, posicionX, posicionY);
                    break;
                }
            }
            ganar = tablero.checkIfWinner();
        }
    }
}
