package java_assignments;

import java.io.File;
//Used recursion
public class FileCount {
	static int count =0;//static counter
	public static void getinsidedir(File dir){//this method called recursively with different folder
											  //as a inputs after each recursion
		try{
			File[] files=dir.listFiles();//array of files
			for (File file : files) {//iterates over all the "files" and stores them in "file"
				if(file.isDirectory()){//checks if the current data in file is directory
										//if directory then counter is incremented, directory path is printed
										// and getinidir is called by passing current dir path as input
					count++;
						System.out.println(file.getAbsolutePath());
						getinsidedir(file);					
				}
				else{					
						System.out.println(file.getAbsolutePath());	//if not a dir control comes here
																	//prints all the files and counter is
																	//incremented
						count++;
				}
			}
			System.out.println(count);
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}		
	public static void main(String[] args) {
		File startpoint = new File("C:/Users/abhishek/Desktop/clg stuff/ICS");
		getinsidedir(startpoint);		
		
		//int count=startpoint.listFiles().length;
		//System.out.println(count);		
		}
			
	}


