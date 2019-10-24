package Drones;
import java.util.Random;


public class Direction {
	static Random randomDir = new Random();
	public enum NESW {
		North,
		East,
		South,
		West;
		
		
		  
		public static NESW getRandomDirection() {
			
			return values()[randomDir.nextInt(values().length)];
			
		
		}
		public NESW getNextDirection() {
			return this.ordinal() < NESW.values().length - 1
			       ? NESW.values()[this.ordinal() + 1]
			         : null;
		}
		
	    
	 	
	
	}
}
