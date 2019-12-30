package threeSidedDice;


import java.util.Scanner;

public class ThreeSidedDice {
		
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
				SystemOfEquations dices = new SystemOfEquations(threeDices,constants);
				double p1 = dices.solveForX();
				double p2 = dices.solveForY();
				double p3 = dices.solveForZ();
				if(p1>0 && p2>0 && p3>0) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
				
			}
		input.close();
	}
}
