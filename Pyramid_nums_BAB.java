public class Pyramid_nums_BAB {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            // Numbers part1
            for (int k = 64+i; k >= 65; k--) {
                System.out.print((char)(k) + " ");
            }
            for (int k = 66; k <=64+i ; k++) {
                System.out.print((char)(k) + " ");
            }
            System.out.println();
        }
    }
}
