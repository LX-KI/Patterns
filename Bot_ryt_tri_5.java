public class Bot_ryt_tri_5 {
    public static void main(String[] args) {
        int rows = 5;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=5;j>=rows+1-i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}