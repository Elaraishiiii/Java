package punto3d;
public class Punto { 
    // Attributi
    private double x,y;
    // costruttori (Non ha tipo restituito, si chiama come la classe)
    public Punto(){
        x=0;
        y=0;
    }
    public Punto (double x, double y){
        this.x = x ; 
        this.y = y ;
    }
    public void setXY(double x, double y){
        this.x = x ; 
        this.y = y ;
    }
    public void setx(double x){
        this.x = x ; 
    }
    public void sety(double y){
        this.y = y ; 
    }
    public double getX()  {
        return x;
    }
    public double getY()  {
        return y;
    }
    
    @Override
    public String toString(){
        return("("+x+" , "+y+")"); 
    }
    
    public Punto (Punto p){
        this.x = p.getX();
        this.y=p.getY();
    }
    
    // Calcola la distanza del punto dal punto 0, 0 (Origine)
    public double getDistanza(){
        double D;
        D = Math.sqrt((x*x)+(y*y));
        return D;
    }
    // Calcola la distanza tra due punti
    public double getDistanza (Punto due){
        double D;
        //D = Math.sqrt(Math.pow((x-due.getX()), 2)+Math.pow((y-due.getY()), 2));
        D= Math.sqrt(Math.pow(x-due.getX(),2) + Math.pow(y-due.getY(),2) ); 
        return D;
    }
    public boolean Equals(Punto due){
        if ((x==due.getX())&&(y==due.getY())) {
            return true;
        }
        else
            return false;
    }
    public void setCasuale (){
        x = Math.random()*100.0;
        y = Math.random()*100.0;
    }
    public Punto getMedio (Punto m){
        Punto r;
        double xm = (x+m.getX())/2;
        double ym = (y+m.getY())/2;
        r = new Punto(xm,ym);
        return r;
    }     
}
