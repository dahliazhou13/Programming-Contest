package threeSidedDice;

public class DeterminantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matrix = new double[3][3];
		matrix[0][0]=1;
		matrix[0][1] = 0;
		matrix[0][2] = 0;
		matrix[1][0] = 0;
		matrix[1][1] = 1;
		matrix[1][2] = 0;
		matrix[2][0] = 0;
		matrix[2][1] = 0;
		matrix[2][2] = 1;
		Determinant matrixD = new Determinant(matrix);
		System.out.println(matrixD.calculate());
	}

}
