package Question11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
	static int count=0;
	
	public static void count(File f) {
		HashMap<String,Integer> hm =new HashMap<String,Integer> ();
		
		try {			
			Scanner scan =new Scanner(f);
			
			while(scan.hasNext()) {
			
				String next=scan.next();
				
				if(!hm.containsKey(next)) {
					hm.put(next,1);
				}
				else {
					hm.put(next,hm.get(next)+1);	
				}
			}				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("total words" + hm.size());
		for (String  words : hm.keySet()) {
			
			int count=hm.get(words);
			System.out.println(count +"\t"+ words);
		}
		
	}	
	public static void main(String[] args) {
		File targetfile= new File("C:/Users/ajambur/Desktop/sample.txt");
		count(targetfile);

	}

}
