import java.util.*;

public class Main  {
// 백준 10988 팰린드롬인지 확인하기 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		
		int isP = 1;
		
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				isP--;
				break;
			}
		}
		
		System.out.println(isP);
		
		scanner.close();
	}
	
}


