package PuntoInteresse;

public class PuntoInteresse extends Posizione{
    // Attributi
    String Nome;
    int v;
    
    //Costruttori
    public PuntoInteresse (){
        super(0, 0, 0);
        this.Nome = "Senza Nome";
        this.v = 1;
    }
    public PuntoInteresse (int LA, int LO, int AL, String Nome, int v){
        super(LA, LO, AL);
        this.Nome = Nome;
        if ((v > 0) && (v < 6)) this.v = v;
        else this.v = 1;
    }
    
    // Metodi 
    public String toString (){
        String s = "";
        s = Nome + super.toString() + " Valutazione : " + v; 
        return s;
    }
    public String getNome(){
        return Nome;
    }
    public int getV (){
        return v;
    }
    public void setPuntoInteresse (int LA, int LO, int AL, String Nome, int v){
        super.setPosizione(LA, LO, AL);
        this.Nome = Nome;
        if ((v > 0) && (v < 6)) this.v = v;
        else this.v = 1;
    }
}
