import java.util.Scanner;

public class even {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			int x = sc.nextInt();
			int y = (int) (Math.log(x)/Math.log(2))+1;
			int z = (int)(Math.pow(2, y)-x);
			System.out.println("Pokemon " + i + ": "+z);
		
		}
	}

}
