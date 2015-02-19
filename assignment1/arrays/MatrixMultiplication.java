package chandana.assignment1.arrays;

public class MatrixMultiplication {
	int[][] A,B,c;
	
	public MatrixMultiplication(int[][]A, int[][]B){
		
		this.A = A;
		this.B = B;
	}
	
	int[][] multiply( byte c2){
		c = new int[A.length][c2];
		for(byte i = 0;i<A.length;i++){
			for(byte j=0;j<c2;j++){
				for(byte k=0;k<B.length;k++){
					c[i][j] =c[i][j] + A[i][k] * B[k][j];
				}
			}
		}
		return c;
	}

}
