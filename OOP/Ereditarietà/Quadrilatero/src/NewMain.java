public class NewMain {
    public static void main(String[] args) {
        Quadrilatero v[] = new Quadrilatero[6];
        for (int i = 0; i < v.length; i++) {
            if (i < 2) {
                v[i] = new Quadrilatero();
            }
            else if (i >=2 && i <4) {
                v[i] = new Quadrato(10);
            }
            else {
                v[i] = new Rettangolo(5, 1);
            }
            System.out.println(v[i].toString());
        }

    }
    
}
