package disco;

import java.awt.Color;

public class Main {
    
    public static void main(String[] args) {
        Cerchio a = new Cerchio(4,5,3);
        Disco b = new Disco(12, 30, 10, Color.red);
        
        System.out.println(b.toString());
        b.setDisco(112, 320, 430, Color.blue);
        System.out.println(b.toString());
        Disco o = new Disco(21, 10, 03, Color.red);
        Disco Copia = new Disco(o);
        System.out.println(Copia.toString());

    }
}
