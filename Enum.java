package Question6;

import java.io.ObjectInputStream.GetField;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import Question6.Enum.stateinfo;

public class Enum {
	
	enum stateinfo{
		Maharashtra("mumbai",785487),
		MadhyaPradesh("bhopal",562688);
		
		public String capital;
		public int Population;
		
		private stateinfo(String capital, int population) {
			this.capital = capital;
			Population = population;
		}
		public String getCapital() {
			return capital;
		}
		public int getPopulation() {
			return Population;
		}
		private static final Map<String, stateinfo> revlook=new HashMap<String, stateinfo>();
		static{
			for(stateinfo s:stateinfo.values())
				revlook.put(s.getCapital(),s);
		}
		public static stateinfo getstate(String capital){
			return revlook.get(capital);		
		}
					
		}
	public static void main(String[] args) {
		System.out.println(stateinfo.getstate("bhopal"));
	}

}
