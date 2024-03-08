public class Main {
    public static void main(String[] args) {
        double c=0;
        double vettore[]= new double[50];
        for (int i = 0; i < 50; i++) {
            vettore[i]=Math.cos(c);
            System.out.println(vettore[i]);
            c=c+0.1;
        }
    }
}