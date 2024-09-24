package Posizione;
public class Posizione {
    // Attributi
    private int LA, LO, AL;
    
    // Costruttori
    public Posizione (){
        this.AL = 0;
        this.LA = 0;
        this.LO = 0;
    }
    public Posizione (int LA, int LO, int AL){
        if (LA < 0) this.LA = 0;
        else this.LA = LA;
        
        if (LO < 0) this.LO = 0;
        else this.LO = LO;
        
        this.AL = AL;
    }
    public Posizione (Posizione Due){
        this.AL = Due.getAL();
        this.LA = Due.getLA();
        this.LO = Due.getLO();
    }
    
    // Metodi
    public void setPosizione (int LA, int LO, int AL){
        if (LA < 0) this.LA = 0;
        else this.LA = LA;
        
        if (LO < 0) this.LO = 0;
        else this.LO = LO;
        
        this.AL = AL;
    }
    public int getLA (){
        return LA;
    }
    public int getLO (){
        return LO;
    }
    public int getAL (){
        return AL;
    }
    public String toString (){
        return "(LA = " + LA + " LO = " + LO + " AL = " + AL + " )";
    }
    public boolean Equals (Posizione due){
        if ((this.LA == due.getLA()) && (this.AL == due.getAL())) return true;
        else return false;
    }
    public boolean Maggiore (Posizione due){
        if ((this.AL > due.getAL())) return true;
        else return false;
    }
    public boolean Minore (Posizione due){
        if ((this.AL < due.getAL())) return true;
        else return false;
    }
    public Posizione PosizioneMedia (Posizione due){
        Posizione Risultato;
        int NLA = (this.LA + due.getLA())/2;
        int NAL = (this.AL + due.getAL())/2;
        int NLO = (this.LO + due.getLO())/2;
        Risultato = new Posizione ( NLA, NLO, NAL);
        return Risultato;
    }
    public boolean SoppraLivelloMare (){
        if (this.AL >= 0) return true;
        else return false;
    }
}
