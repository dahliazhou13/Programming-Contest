import java.util.Scanner;

public class EightQueens {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] board = new int[8][2];
		int count=0;
		for(int i=0; i<8;i++) {
			String line = input.next();
			for(int j=0; j<8; j++) {
				if(line.charAt(j)=='*') {
					board[count][0]=i;
					board[count][1]=j;
					count++;
				}
			}
		}
		boolean validity = true;
		for(int i=0; i<7; i++) {
			for(int j=i+1; j<8; j++) {
				if(board[i][0]==board[j][0]||board[i][1]==board[j][1]) {
					validity=false;
				}
			}
			if(Math.abs(board[i+1][1]-board[i][1])==1) {
				validity=false;
			}
			
		}
		if(validity) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		input.close();
	}
}
