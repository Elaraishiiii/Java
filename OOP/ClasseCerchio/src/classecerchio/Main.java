package classecerchio;

public class Main {
    public static void main(String[] args) {
        Cerchio a = new Cerchio(8, 9, 2);
        Cerchio b = new Cerchio(1, 4, 6);
        Cerchio prodotto = a.Moltiplica(b);
        System.out.println(prodotto.toString());
        
        Cerchio A[] = new Cerchio[100];
        Cerchio B[] = new Cerchio[100];
        
        for (int i = 0; i < 100; i++) {
            A[i] = new Cerchio();
        }
        
        for (int i = 0; i < 100; i++) {
            A[i].setXYR((int)(Math.random()*1000), (int)(Math.random()*1000), i);
        }
        Cerchio Aux = new Cerchio(250, 100, 30);
        for (int i = 0; i < 100; i++) {
            B[i] = A[i].Moltiplica(Aux);
            System.out.println(B[i]);
        }
    }
}
