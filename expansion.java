import java.io.*;
import java.util.*;

public class expansion {
	static ArrayList<Integer> newT;
	public static void main(String[] args) throws IOException{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		int nn = Integer.parseInt(kb.readLine());
		for(int kk =1 ; kk<=nn; kk++) {
			String[] m = kb.readLine().split(" ");
			newT = new ArrayList<>();
			ArrayList<Integer> oldT = new ArrayList<>();
			String[] t1 = kb.readLine().split(" ");
			String[] t2 = kb.readLine().split(" ");
			for(int i = 0 ; i<t1.length; i++)
				newT.add(Integer.parseInt(t1[i]));
			for(int i = 0 ; i<t2.length; i++)
				oldT.add(Integer.parseInt(t2[i]));
			Collections.sort(oldT);
			Collections.sort(newT);
			int c = 0;
			for(int i =0 ; i<oldT.size(); i++)
				c += ll(oldT.get(i));
			System.out.println("Expansion #" + kk + ": " + c);
		}
	}
	public static int ll(int x) {
		newT.add(x);
		Collections.sort(newT);
		int lower = newT.lastIndexOf(x);
		int higher = newT.size()-lower-1;
		int c = 1;
		if(higher >= lower) {
			c = 0;
			newT.remove(lower);
		}
		return c;
	}
}
