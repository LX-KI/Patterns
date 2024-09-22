public class Bot_Lft_Tri_i_sum_j {
public static void main(String[] args) {
    int n=5;
    for(int i=0;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print((i+j+1)%2+" ");
        }
        System.out.println();
    }
}
}
