public class Diamond_char2 {

	public static void main(String[] args) {
		
	
	int rows= 5;
	for (int i = 1 ; i<=rows;i++) {
		for (int j=1;j<=rows-i;j++) {
			System.out.print(" " + " ");
		}
		for(int j=rows;j>=rows+1-i;j--) {
			System.out.print((char)(j+64) + " ");
		}
		for (int j=rows+2-i;j<=rows;j++) {
			System.out.print((char)(j+64) + " ");
		}
		System.out.println();
	}
	for (int i = rows ; i>=1;i--) {
		for (int j=1;j<=rows-i;j++) {
			System.out.print(" " + " ");
		}
		for(int j=rows;j>=rows+1-i;j--) {
			System.out.print((char)(j+64) + " ");
		}
		for (int j=rows+2-i;j<=rows;j++) {
			System.out.print((char)(j+64) + " ");
		}
		System.out.println();
	}
	}
	}

