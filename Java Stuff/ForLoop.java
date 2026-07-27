public class ForLoop {
    public static void main (String[] args) {
        int n = 5;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}