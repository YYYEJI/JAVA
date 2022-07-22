
public class CH07_Matrix2 {
	public static void main(String[] args) {
		int [][] A = new int[3][3];
		int [][] B = new int[3][3];
		
		CH07_Matrix2.makeMatrix2(A);
		CH07_Matrix.makeMatrix(B);
		
		System.out.println("\nMatrix A is . .");
		CH07_Matrix.printMatrix(A);
		System.out.println("\nMatrix B is . .");
		CH07_Matrix.printMatrix(B);
		
		CH07_Matrix2.addtion(A,B);
		CH07_Matrix2.subtraction(A,B);
		CH07_Matrix2.multiplication(A,B);
	}
	public static void makeMatrix2(int m[][]) {
		int n = 1;
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[i].length; j++) {
				m[i][j] = n;
				n++;
			}
		}
	}
	public static void addtion(int[][] m1, int[][] m2 ) {
		System.out.println("\nMatrix addition is . .");
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				int n = m1[i][j] + m2[i][j];
				System.out.printf(n + " ");
			}
			System.out.println("");
		}
	}
	public static void subtraction(int[][] m1, int[][] m2 ) {
		System.out.println("\nMatrix subtraction is . .");
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				int n = m1[i][j] - m2[i][j];
				System.out.printf(n + " ");
			}
			System.out.println("");
		}
	}
	public static void multiplication(int[][] m1, int[][] m2 ) {
		int [][] m = new int[3][3];
		System.out.println("\nMatrix multiplication is . .");
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				for(int k = 0; k<3; k++) { 
				    m[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		
		for(int i = 0; i<m1.length; i++) {
			for(int j = 0; j<m1[i].length; j++) {
				System.out.printf(m[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
