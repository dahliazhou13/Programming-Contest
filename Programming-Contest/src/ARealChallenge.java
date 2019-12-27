import java.util.Scanner;

public class ARealChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int area = input.nextInt();
		double length = 4*Math.sqrt(area);
		System.out.println(length);
		input.close();
	}

}
