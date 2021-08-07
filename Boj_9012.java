import java.util.*;

public class Main  {
// 백준 9012 괄호
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tc = scanner.nextInt();
		
		String str = "";
		int cnt;
		String result;
		
		for (int i = 0; i < tc; i++) {
			cnt = 0;
			result = "NO";
			str = scanner.next();
			
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(') {
					cnt++;
				}
				else if (str.charAt(j) == ')') {
					cnt--;
				}
				
				if (cnt < 0) {
					break;
				}
			}
			
			if (cnt == 0) {
				result = "YES";
			}
			
			System.out.println(result);
		}
		
		scanner.close();
	}
	
}


