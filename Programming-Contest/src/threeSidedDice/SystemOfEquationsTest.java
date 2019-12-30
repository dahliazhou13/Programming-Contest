package threeSidedDice;

public class SystemOfEquationsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matrix = new double[3][3];
		matrix[0][0]=0;
		matrix[0][1] = 1;
		matrix[0][2] = 0;
		matrix[1][0] = 0;
		matrix[1][1] = 0;
		matrix[1][2] = 1;
		matrix[2][0] = 1;
		matrix[2][1] = 0;
		matrix[2][2] = 0;
		double[] constants = {1, 2, 3};
		SystemOfEquations equations = new SystemOfEquations(matrix, constants);
		System.out.println(equations.solveForX());
		System.out.println(equations.solveForY());
		System.out.println(equations.solveForZ());
	}

}
