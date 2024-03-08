package esercizio.pkg7;
public class Esercizio7 {
    
    public static void riempi (int m[][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                int c = (int)(Math.random()*20+1);
                m[i][j]=c;
            }
            
        }
    }
    public static void visualizza (int m[][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.printf("%4d",m[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int m1 [][] = new int [5][5];
        int m2 [][] = new int [5][5];
        
        riempi(m1);
        visualizza(m1);
        System.out.println("--------------------------------");
        riempi(m2);
        visualizza(m2);
    }
    
}
