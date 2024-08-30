
public class Pat_11_35 {
    public static void main(String[] args) {
        int rows = 5;
        int k = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(k + 10 + " ");
                k++;
            }
            System.out.println();
        }
    }
}