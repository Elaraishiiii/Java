public class Main {
    public static void main(String[] args) {
        Quadro q = new Quadro(100, 60, 2, "Giotto", "AZ556");
        System.out.println(q.toString() + " (Area: " + q.getAreaCornice()+"cm^2)");
    }
    
}
