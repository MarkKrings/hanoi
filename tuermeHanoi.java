public class tuermeHanoi {

    public static void bewegen(char a, char b, char c, int n) {
        if (n == 1) {
            System.out.println("Lege die Scheibe von Turm " + a + " auf Turm " + c + ".");
        } else {
            bewegen(a, c, b, n-1);          
            bewegen(a, b, c, 1);
            bewegen(b, a , c , n-1);
        }
    }

    public static void main(String[] args) {

        bewegen('a', 'b','c',3);
    }
}
