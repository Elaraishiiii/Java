public class Mazzo {
    // Variabili
    private Carta v[];
    // Costruttori
    public Mazzo (){
        //int i; 
        v = new Carta[40];
        for (int i = 0; i < 10 ; i++)
            v[i] = new Carta(i+1, 'b');
        for (int i = 10; i < 20 ; i++)
            v[i] = new Carta(i-9, 'c');
        for (int i = 20; i < 30 ; i++)
            v[i] = new Carta(i-19, 'o');
        for (int i = 30; i < 40 ; i++)
            v[i] = new Carta(i-29, 's');
    }
    @Override
    public String toString (){
        String s = "Mazzo: \n";
        for (int i = 0; i < v.length; i++) {
            if (v[i] != null)
                s += v[i].toString()+"\n";
            else
                s += "Null \n";
        }
        return s;
    }
    public int Conta (){
        int c = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != null) {
                c++;
            }
        }
        return c;
    }
    public Carta EstraiBasso (){
        Carta r = null;
        int nc = Conta();
        if (nc > 0) {
            r = v[nc-1];
            v[nc-1] = null;
        }
        return r;
    }
    public void InserisciBasso (Carta c){
        int nc = Conta();
        if (nc < 40) {
            v[nc] = c;
        }
    }
    public Carta EstraiAlto (){
        Carta r = null;
        int nc = Conta();
        if (nc > 0) {
            r = v[0];
            v[0] = null;
            Compatta();
        }
        return r;
    }
    public void Compatta(){
        int nc = Conta();
        for (int i = 0; i < nc; i++) {
            if (v[i]==null) {
                v[i] = v[i+1];
                v[i+1] = null;
            }
            
        }
    }
    public void InserisciAlto (Carta c){
        int nc = Conta();
        if (nc<40) {
            for (int i = nc; i > 0; i--) {
                v[i] = v[i-1];
                v[0] = c;
            }
        }
    }
    public Carta EstraiCaso (){
        Carta r = null;
        int nc = Conta();
        if (nc > 0) {
            int p = (int)(Math.random()*nc);
            r = v[p];
            v[p] = null;
            Compatta();
        }
        return r;
    }
    public void inserisciCaso (Carta c){ // Da Finire
        int nc = Conta();
        if (nc<40) {
            int pos = (int)(Math.random()*nc);
            for (int i = nc; i > pos; i--) {
                v[i] = v[i-1];
                v[pos] = c;
            }
        }
    }
    public void Mischia (){
        for (int i = 0; i < 100; i++) {
            InserisciAlto(EstraiCaso());
            InserisciBasso(EstraiCaso());
        }
    }    
    public void Rigenera (){
         for (int i = 0; i < 10 ; i++)
            v[i] = new Carta(i+1, 'b');
        for (int i = 10; i < 20 ; i++)
            v[i] = new Carta(i-9, 'c');
        for (int i = 20; i < 30 ; i++)
            v[i] = new Carta(i-19, 'o');
        for (int i = 30; i < 40 ; i++)
            v[i] = new Carta(i-29, 's');
    }
    public void Svuota(){
        for (int i = 0; i < v.length; i++) {
            v[i] = null;
        }
    }
}

// Bella Dal Pc Della Scuola
