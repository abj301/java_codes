package Question11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
	static int count=0;
	
	public static void count(File f) {
		HashMap<String,Integer> hm =new HashMap<String,Integer> ();//declaration of hashmap hm with String as key and Integer as value
		
		try {			
			Scanner scan =new Scanner(f);//opened a scanner on file f
			
			while(scan.hasNext()) {//while scanner returns true
			
				String next=scan.next();//token is returned as String
				
				if(!hm.containsKey(next)) {//checks if the hashmap already contains the String
					hm.put(next,1);//if hashmap dosent contain the key it stores it n the map and gives it "1" as value.
				}
				else {
					hm.put(next,hm.get(next)+1);	//get returns the value of the key 
													//and the word is replaced with the original word with is original value being incremented
				}
			}				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("total words" + hm.size());
		for (String  words : hm.keySet()) {//iterates over the keyset and stores all the keys in words
			
			int count=hm.get(words);//get returns the value of each word
			System.out.println(count +"\t"+ words);//prints count of each word
		}
		
	}	
	public static void main(String[] args) {
		File targetfile= new File("C:/Users/ajambur/Desktop/sample.txt");
		count(targetfile);

	}

}
