package complesso;
public class Main {
    public static void main(String[] args) {
        Complesso c = new Complesso(-2, -3);
        Complesso c1 = new Complesso(-4, -3);
        System.out.println(c1.sottrai(c));
    }
}
