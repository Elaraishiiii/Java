public class Main {
    public static int casuale (){
        int c,c2;
        c= (int) (Math.random()*6+1);
        return c;
    }
    public static int casuale2 (){
        int c,c2;
        c= (int) (Math.random()*6+1);
        return c;
    }
    public static void presentazione() {
        System.out.println("Questo è il gioco del lancio del Dado");
        System.out.println("-------------------------------------");
    }
    public static void dado (int n){
        if (n==1){
            System.out.println ("|           |");
            System.out.println ("|     *     |");
            System.out.println ("|           |");
        }
        else if (n==2){
            System.out.println ("|         * |");
            System.out.println ("|           |");
            System.out.println ("| *         |");
        }
        else if (n==3){
            System.out.println ("|         * |");
            System.out.println ("|     *     |");
            System.out.println ("| *         |");
        }
        else if (n==4){
            System.out.println ("| *       * |");
            System.out.println ("|           |");
            System.out.println ("| *       * |");
        }
        else if (n==5){
            System.out.println ("| *       * |");
            System.out.println ("|     *     |");
            System.out.println ("| *       * |");
        }
        else if (n==6){
            System.out.println ("| *       * |");
            System.out.println ("| *       * |");
            System.out.println ("| *       * |");
        }
    }
    public static void main(String[] args) {
        presentazione();
        dado(casuale());
        System.out.println("-------------------------------------");
        dado(casuale2());
    }
}