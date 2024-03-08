public class Quadrilatero {
    // Attributi
    protected int latoA, latoB, latoC, latoD;   //Lati del quadrilatero
    // Costruttori
    public Quadrilatero() {
        latoA = 10;
        latoB = 10;
        latoC = 10;
        latoD = 10;
    }

    public Quadrilatero(int a, int b, int c, int d) {
        if (latoA >= 0 && latoB >= 0 && latoC >= 0 && latoD >= 0){
            latoA = a;
            latoB = b;
            latoC = c;
            latoD = d;
        }
        else {
            latoB = 10;
            latoC = 10;
            latoD = 10;
        }
    }
    
    //Metodi vari
    public int perimetro() {
        int perimetro;
        perimetro = latoA + latoB + latoC + latoD;
        return  perimetro;
    }
    
    @Override
    public String toString() {
        String s;
        s = "\"(" + this.latoA + " , " + this.latoB + " , " + this.latoC + " , " + this.latoD +")\"";
        return s;
    }   
}
