package linea;

public class main {

    public static void main(String[] args) {
        Linea v[] = new Linea[10];
        Punto a = new Punto();
        Punto b;
        int cont = v.length;
        double max = 0;
        int lineaMax = 0;
        int lineaMin = 0;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                b = new Punto(i, cont);
                v[i] = new Linea(a, b);
            }
            cont--;
            System.out.println(v[i]);
            if (v[i].getLunghezza() > max) {
                max = v[i].getLunghezza();
                lineaMax = i;
            }
            if (v[i].getLunghezza() < min) {
                min = v[i].getLunghezza();
                lineaMin = i;
            }
        }
        System.out.println("================");
        System.out.println("Linea Più Lunga è " + v[lineaMax] + "; di cui Lunghezza = " + max);
        System.out.println("Linea Più Corta è " + v[lineaMin] + "; di cui Lunghezza = " + min);
    }
}
