public class Pyramid_nums_454 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            // Numbers part1
            for (int k = n - i + 1; k <= n; k++) {
                System.out.print(k + " ");
            }
            for (int k = 4; k >= n - i + 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println(); 
        }
    }
}
