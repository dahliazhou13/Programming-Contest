package threeSidedDice;

public class SystemOfEquations {
	private double[][] matrix;
	private double[] constants;
	private double D;
	public SystemOfEquations(double[][] m, double[] constants) {
		this.matrix = m;
		this.constants = constants;
		D = new Determinant(m).calculate();
	}
	public double solveForX() {
		double[][] xMatrix = new double[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				xMatrix[i][j]=matrix[i][j];
			}
		}
		xMatrix[0][0]=constants[0];
		xMatrix[1][0]=constants[1];
		xMatrix[2][0]=constants[2];
		double D1 = new Determinant(xMatrix).calculate();
		return  D1/D;
	}
	public double solveForY() {
		double[][] yMatrix = new double[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				yMatrix[i][j]=matrix[i][j];
			}
		}
		yMatrix[0][1]=constants[0];
		yMatrix[1][1]=constants[1];
		yMatrix[2][1]=constants[2];
		double D2 = new Determinant(yMatrix).calculate();
		return  D2/D;
	}
	public double solveForZ() {
		double[][] zMatrix = new double[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				zMatrix[i][j]=matrix[i][j];
			}
		}
		zMatrix[0][2]=constants[0];
		zMatrix[1][2]=constants[1];
		zMatrix[2][2]=constants[2];
		double D3 = new Determinant(zMatrix).calculate();
		return D3/D;
	}
}
