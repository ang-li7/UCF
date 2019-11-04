import java.util.HashMap;
import java.util.Scanner;

public class poker {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	    map.put("Straight flush", 9);
	    map.put("Four of a kind", 8);
	    map.put("Full house", 7);
	    map.put("Flush", 6);
	    map.put("Straight", 5);
	    map.put("Three of a kind", 4);
	    map.put("Two pair", 3);
	    map.put("Pair", 2);
	    map.put("High card", 1);
	    int n = Integer.parseInt(sc.nextLine());
	    for(int i = 1; i<=n; i++) {
	    	String r = sc.nextLine();
	    	String t = sc.nextLine();
	    	if(map.get(r)>map.get(t)){
		        System.out.println("Game #"+i+": Ryan");
	    	}
	    	else{
		        System.out.println("Game #"+i+": Tyler");
		      
	    	}
	    }
	}

}
