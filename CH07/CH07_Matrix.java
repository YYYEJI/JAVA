
public class CH07_Matrix {
	public static void main(String[] args) {
		int [][] A = new int[3][5];
		int [][] B = new int[5][3];
		int [][] C = new int[3][3];
		
		CH07_Matrix.makeMatrix(A);
		CH07_Matrix.makeMatrix(B);
		CH07_Matrix.makeMatrix(C);
		
		System.out.println("\nMatrix A is . .");
		CH07_Matrix.printMatrix(A);
		System.out.println("\nMatrix B is . .");
		CH07_Matrix.printMatrix(B);
		System.out.println("\nMatrix C is . .");
		CH07_Matrix.printMatrix(C);
	}
	public static void makeMatrix(int m[][]) {   // 객체의 값을 조정
		for(int i = 0; i < m.length ; i++) {
			for(int j = 0; j < m[i].length ; j++) {
				m[i][j] = i+j;
			}
			
		}
	}
	public static void printMatrix(int [][] m) {   // 객체의 값을 조정하는 것이 아님  
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.printf(m[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
}
