import java.util.Scanner;

public class flooding {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++ ) {
			int count = 0;
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			int nn = sc.nextInt();
			for(int j = 0; j<nn; j++) {
				int xa = sc.nextInt();
				int ya = sc.nextInt();
				int xb = sc.nextInt();
				int yb = sc.nextInt();
				if (!isInside(x1, y1, x2, y2, x3, y3, xa, ya) == isInside(x1, y1, x2, y2, x3, y3, xb, yb)) {
					count++;
				}
			}
			System.out.println("Scenario "+i+": "+count);
		}
	}
	public static double area(int x1, int y1, int x2, int y2,int x3, int y3) { 
		return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0); 
	} 

	public static boolean isInside(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y) {    
		double A = area (x1, y1, x2, y2, x3, y3); 
		double A1 = area (x, y, x2, y2, x3, y3); 
		double A2 = area (x1, y1, x, y, x3, y3); 
		double A3 = area (x1, y1, x2, y2, x, y); 
		return (A == A1 + A2 + A3); 
	} 

}

