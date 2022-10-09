
import java.util.*;


public class Random {

	public static void main(String[] args) {
		
	
		
		Random randonNum = new Random();
		int max = 100;
		int min = 1;
		
		for(int i =1; i<10 ; i++);
		System.out.println("Random value in int from"+min+" to "+max+ ":");
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		System.out.print(random_int);
		
		
	}
}

