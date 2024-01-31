package calcolatrice_frazioni;
public class Frazione {
    // Variabili
    private int n,d;
   
    // Costruttore Default
    public Frazione(){
        n=1;
        d=1;
    }
   
    // Costruttore a 2 parametri
    public Frazione(int n,int d){
        if(d==0) d=1;
        else if(d<0){
            n= -n;
            d= -d;
        }
        this.n=n;
        this.d=d;
        Semplifica();
    }
   
    // Costruttore Copia
    public Frazione(Frazione due){
        this.n=due.getN();
        this.d=due.getD();
    }
   
    // Costruttore a un Parametro
    public Frazione (int n){
        this.n =  n;
        this.d = 1;
    }
   
    // Costruttore
    public Frazione (double x){
        int Xi,d = 1;
        Xi = (int)x;
        while ((x-Xi)!=0) {            
            x = x * 10;
            Xi = (int)x;
            d = d*10;
        }
        this.n = Xi;
        this.d = d;
        Semplifica();
    }
   
    // Funzione Semplifica
    private void Semplifica(){
        int m = MCD();
        n = n/m;
        d = d/m;
    }
   
    public int getN(){
        return n;
    }
   
    public int getD(){
        return d;
    }
   
    public void setFrazione(int n,int d){
        if(d==0)
            d=1;
        if(d<0){
            n= -n;
            d= -d;
        }
        this.n=n;
        this.d=d;
        Semplifica();
    }
   
    @Override
    public String toString(){
        String s;
        if(n==0)
            s="0";
        else if(d==1)
             s=""+n;
        else
            s=n+"/"+d;
        return s;
    }
   
    private int MCD(){
        int m;
        if (n>d) {
            m = d;
        }
        else m = n;
        while (!(((n%m)==0)&&(d%m)==0)){            
            m--;
        }
        return m;
    }
   
    public boolean Equals(Frazione due){
        if((n==due.getN())&&(d==due.getD()))
            return true;
        else
            return false;
    }
   
    public double getValore(){
        double r;
        r = (double) n/d;
        return r;
    }
   
    public boolean Maggiore(Frazione due){
        if (this.getValore() > due.getValore())
            return true;
        else
            return false;
    }
   
    public boolean Minore(Frazione due){
        if(this.getValore()<due.getValore())
            return true;
        else
            return false;
    }
   
    public Frazione Moltiplica(Frazione due){
        Frazione r;
        int nn=n*due.getN();
        int nd=d*due.getD();
        r=new Frazione(nn,nd);
        return r;
    }
   
    public Frazione MoltiplicaNum(int n){
        Frazione r;
        int nn= this.n * n;
        r=new Frazione(nn,d);
        return r;
    }
   
    public Frazione Dividi(Frazione due){
        Frazione r;
        int nn = n*due.getD();
        int dd = d*due.getN();
        r = new Frazione(nn,dd);
        return r;
    }
     
    public Frazione Somma(Frazione due){
          Frazione r;
          int nn = n*due.getD() + due.getN()*d;
          int nd = d*due.getD();
          r = new Frazione(nn,nd);
          return r;
      }
     
    public Frazione Sottrai(Frazione due){
          Frazione r;
          int nn=n*due.getD()- due.getN()*d;
          int nd=d*due.getD();
          r = new Frazione(nn,nd);
          return r;
      }
}

// HEllo