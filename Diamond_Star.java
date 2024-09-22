public class Diamond_Star {
    public static void main(String[] args) {
        int rows = 5;
        for(int i=1;i<=2*rows-1;i++)
        {
            int stars=i<=5?i:2*rows-i;
            for(int j=1;j<=rows-stars;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            
            }
            for(int j=1;j<=stars-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
