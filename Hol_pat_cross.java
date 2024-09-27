public class Hol_pat_cross {

	public static void main(String[] args) {
		int i;
		int j;
		int rows=5;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=rows;j++) {
				if(i==1 || i==rows || j==1 || j==rows||i==j||i+j==rows+1) {
					System.out.print("*"+ " ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}


