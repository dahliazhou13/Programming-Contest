import java.util.Scanner;

public class Skener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

			int row = input.nextInt();
			int column = input.nextInt();
			int zR = input.nextInt();
			int zC = input.nextInt();
			
			String[] characters = new String[row];
			for(int i = 0; i < row; i ++) {
				characters[i] = input.next();
			}
			char[] outputLine = new char[column*zC];
			for(int i=0; i < row; i++) {
				for(int j=0; j<column; j++) {
					for(int k=0; k<zC; k++) {
						outputLine[zC*j+k]=characters[i].charAt(j);
					}
				}
				for(int k=0; k<zR ; k++) {
					System.out.println(new String(outputLine));
				}
			}
		input.close();
	}

}
