package threeSidedDice;


public class Determinant {
	private double[][] matrix;
	public Determinant(double[][] matrix) {
		this.matrix = matrix;
	}
	public double calculate() {
		double p1 = matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[2][1]*matrix[1][2]);
		double p2 = matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[2][0]*matrix[1][2]);
		double p3 = matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[2][0]*matrix[1][1]);
		return p1 - p2 + p3;
	}
}
