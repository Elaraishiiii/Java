public class Main {
        static int a;
        static float b;
        public static void prima(int k, float y){
            b=k*y;
            System.out.println("b="+b+" y="+y);
        }
        public static float seconda(float h){
            return(h-b);
        }
        public static void main(String[] args) {
            a=12;
            prima(a,6);
            System.out.println("b="+b+" a="+a);
            b=seconda(a/b);
            System.out.println("b="+b+" a="+a);
        }
    }
