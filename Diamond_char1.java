public class Diamond_char1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int rev = (i <= n ? i : 2 * n - i);
            // Spaces
            for (int j = 1; j <= n - rev; j++) {
                System.out.print(" " + " ");
            }
            // Numbers part1
            for (int k = 64 + rev; k >= 65; k--) {
                System.out.print((char) (k) + " ");
            }
            for (int k = 66; k <= 64 + rev; k++) {
                System.out.print((char) (k) + " ");
            }
            System.out.println();
        }
    }
}
