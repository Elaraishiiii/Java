package punto3d;
public class Punto3D extends Punto{
    // Variabili
    private double z;
    // Metodi
    public Punto3D() {
        // Protected -> Private a tutti gli effetti ma usabili nelle classi derivate
        // Super() -> Dà la possibilità di chiamare i costruttori della classe da cui eredito
        super();
        z = 0;
    }
    public Punto3D (double x, double y, double z){
        super(x,y);
        this.z = z;
    }
    public Punto3D (Punto p, double z){
        super(p);
        this.z = z;
    }
    public Punto3D (double x, double y){
        super(x, y);
        z = 0;
    }
    public Punto3D (double z){
    super();
    this.z = z;
    }
    public Punto3D (Punto3D due){
        super(due.getX(), due.getY());
        z = due.getZ();
    }
    public double getZ(){
        return z;
    }
            
}
