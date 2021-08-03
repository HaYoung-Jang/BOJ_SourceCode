import java.util.*;

public class Main  {
// 백준 2754 학점계산 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int mainPoint = 0;
		double subPoint = 0.0;
		double totPoint;
		
		String grade = scanner.next();
		
		switch (grade.charAt(0)) {
		case 'A':
			mainPoint = 4;
			break;
		case 'B':
			mainPoint = 3;
			break;
		case 'C':
			mainPoint = 2;
			break;
		case 'D':
			mainPoint = 1;
			break;
		}
		
		if (grade.length() > 1) {
			switch (grade.charAt(1)) {
			case '+':
				subPoint = 0.3;
				break;
			case '-':
				subPoint = -0.3;
				break;
			}
		}
		
		totPoint = (double) mainPoint + subPoint;
		
		System.out.println(totPoint);
		
		scanner.close();
	}
	
}


