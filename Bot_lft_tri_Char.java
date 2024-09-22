public class Bot_lft_tri_Char {
    public static void main(String[] args) {
        int rows = 5;
        int k = 1;
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(k + 64) + " ");
                k++;
            }
            System.out.println();
        }
    }
}
