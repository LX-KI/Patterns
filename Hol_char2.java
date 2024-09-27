public class Hol_char2 {
    public static void main(String[] args) {
            int i;
            int j;
            int rows = 5;
            for (i = 1; i <= rows; i++) {
                int k = i;
                for (j = 1; j <= rows; j++) {
                    if (i == 1 || i == rows || j == 1 || j == rows) {
                        System.out.print((char) (k + 64) + " ");
                        k++;
                    } else {
                        System.out.print(" " + " ");
                        k++;
                    }
                }
                System.out.println();
            }
        }
    }

