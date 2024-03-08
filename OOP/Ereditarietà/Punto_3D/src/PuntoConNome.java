public class PuntoConNome extends Punto{
    
    // Variabili
    private String Nome;
    
    // Costruttori
    public PuntoConNome (){
        super();
        Nome = "";
    }
    
    public PuntoConNome(double x, double y, String n){
        super(x, y);
        Nome = n;
    }
    
    public PuntoConNome(String n){
        super();
        Nome = n;
    }
    
    public PuntoConNome (PuntoConNome p){
        super(p.getX(), p.getY());
        Nome = p.getNome();
    }
    
    public String getNome(){
        return Nome;
    }
    
    public void setPuntoConNome (double x, double y, String n){
        super.setXY(x, y);
        Nome = n;
    }
    
    public String toString (){
        String s;
        s = Nome + ": "+ super.toString();
        return s;
    }
}
