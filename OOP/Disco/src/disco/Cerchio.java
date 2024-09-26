package disco;

public class Cerchio {
    //Attributi
    private int x,y,r;
    //Costruttori
    public Cerchio(){
        this.x = 10;
        this.y = 100;
        this.r = 1;
    }
    public Cerchio (int x, int y, int r){
        this.x = x;
        this.y = y;
        if (r > 0) {
            this.r = r;
        }
        else this.r = 0;
    }
    public Cerchio (Cerchio due){
        this.x = due.getX();
        this.y = due.getY();
        this.r = due.getR();
    }
    //Metodi
    public void setXYR(int x, int y, int r){
        this.x = x;
        this.y = y;
        if (r > 0) {
            this.r = r;
        }
        else this.r = 0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y; 
    }
    public int getR(){
        return r;
    }
    public String toString (){
        String s = "( "+ this.x + "," + this.y+ " )R= "+ this.r;
        return s;
    }
    public boolean Equals (Cerchio due){
        if (this.r == due.getR()) {
            return true;
        }
        else return false;
    }
    public Cerchio Moltiplica (Cerchio due){
        Cerchio prodotto = new Cerchio(0, 0,(this.r * due.getR()));
        return prodotto;
    }
    public void Prova(){
        System.out.println("Questa è una prova");
    }
}
