import java.util.Scanner;

public class fireworks {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			int nn = sc.nextInt();
			int min = Integer.MAX_VALUE;
			int indexmin = -1; 
			int max = Integer.MIN_VALUE;
			int indexmax = -1;
			for(int j = 0; j<nn; j++) {
				int a = sc.nextInt();
				if(a<min) {
					min = a;
					indexmin = j+1;
				}
				if(a>max) {
					max = a;
					indexmax = j+1;
				}
			}
			System.out.println("Scenario #"+i+":");
			System.out.println("Highest Firework: "+indexmax);
			System.out.println("Earliest Firework: "+indexmin);
			System.out.println();
		}
	}

}
