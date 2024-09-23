public class Pyramid_nums_545 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            // Numbers part1
            for (int k = n; k >= n + 1 - i; k--) {
                System.out.print(k + " ");
            }
            // numbers part2
            for (int k = n + 2 - i; k <= n; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
