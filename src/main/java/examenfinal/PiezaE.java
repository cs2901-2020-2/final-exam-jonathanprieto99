package examenfinal;

public class PiezaE implements Pieza {
    public void draw(int [][]a){
        a[0][0]=0;
        a[0][1]=0;
        a[0][2]=1;
        a[1][0]=1;
        a[1][1]=1;
        a[1][2]=1;
        a[2][0]=0;
        a[2][1]=0;
        a[2][2]=1;
    }
}
