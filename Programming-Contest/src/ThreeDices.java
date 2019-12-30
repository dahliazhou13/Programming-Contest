import java.util.Scanner;

public class ThreeDices {
	public static double determinant(double[][] matrix) {
		double p1 = matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[2][1]*matrix[1][2]);
		double p2 = matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[2][0]*matrix[1][2]);
		double p3 = matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[2][0]*matrix[1][1]);
		return p1 - p2 + p3;
	}
	public static double SolveForX(double[][] matrix, double[] constants) {
		double D = determinant(matrix);
		double[][] xMatrix = matrix;
		xMatrix[0][0]=constants[0];
		xMatrix[1][0]=constants[1];
		xMatrix[2][0]=constants[2];
		double D1 = determinant(xMatrix);
		return  D1/D;
	}
	public static double SolveForY(double[][] matrix, double[] constants) {
		double D = determinant(matrix);
		double[][] yMatrix = matrix;
		yMatrix[0][0]=constants[0];
		yMatrix[1][0]=constants[1];
		yMatrix[2][0]=constants[2];
		double D2 = determinant(yMatrix);
		return  D2/D;
	}
	public static double SolveForZ(double[][] matrix, double[] constants) {
		double D = determinant(matrix);
		double[][] zMatrix = matrix;
		zMatrix[0][0]=constants[0];
		zMatrix[1][0]=constants[1];
		zMatrix[2][0]=constants[2];
		double D3 = determinant(zMatrix);
		return  D3/D;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			double[][] threeDices = new double[3][3];
			double[] constants = new double[3];
			while(true) {
				threeDices[0][0] = input.nextDouble()/10000;
				threeDices[1][0] = input.nextDouble()/10000;
				threeDices[2][0] = input.nextDouble()/10000;
				if(threeDices[0][0]==0 &&threeDices[1][0]==0 && threeDices[2][0]==0) {
					break;
				}
				threeDices[0][1] = input.nextDouble()/10000;
				threeDices[1][1] = input.nextDouble()/10000;
				threeDices[2][1] = input.nextDouble()/10000;
				threeDices[0][2] = input.nextDouble()/10000;
				threeDices[1][2] = input.nextDouble()/10000;
				threeDices[2][2] = input.nextDouble()/10000;
				constants[0] = input.nextDouble()/10000;
				constants[1] = input.nextDouble()/10000;
				constants[2] = input.nextDouble()/10000;
				double p1 = SolveForX(threeDices,constants);
				double p2 = SolveForY(threeDices,constants);
				double p3 = SolveForZ(threeDices,constants);
				if((p1>=0 && p2>=0 && p3>=0)&&(p1<=1&&p2<=1&&p3<=1)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
				
			}
		input.close();
	}
}
