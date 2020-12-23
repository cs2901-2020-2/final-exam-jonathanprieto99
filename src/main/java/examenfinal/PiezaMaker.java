package examenfinal;

public class PiezaMaker {
    Pieza piezaA;
    Pieza piezaB;
    Pieza piezaC;
    Pieza piezaD;
    Pieza piezaE;
    Pieza piezaF;
    Pieza piezaG;
    Pieza piezaH;


    public PiezaMaker(PiezaA piezaA, PiezaB piezaB, PiezaC piezaC, PiezaD piezaD, PiezaE piezaE, PiezaF piezaF, PiezaG piezaG, PiezaH piezaH) {
        this.piezaA=piezaA;
        this.piezaB=piezaB;
        this.piezaC=piezaC;
        this.piezaD=piezaD;
        this.piezaE=piezaE;
        this.piezaF=piezaF;
        this.piezaG=piezaG;
        this.piezaH=piezaH;
    }

    public void drawPiezaA(){ piezaA.draw(piezaA.figura);}
    public void drawPiezaB(){
        piezaB.draw(piezaB.figura);
    }
    public void drawPiezaC(){
        piezaC.draw(piezaC.figura);
    }
    public void drawPiezaD(){
        piezaD.draw(piezaD.figura);
    }
    public void drawPiezaE(){
        piezaE.draw(piezaE.figura);
    }
    public void drawPiezaF(){
        piezaF.draw(piezaF.figura);
    }
    public void drawPiezaG(){
        piezaG.draw(piezaG.figura);
    }
    public void drawPiezaH(){
        piezaH.draw(piezaH.figura);
    }
}
