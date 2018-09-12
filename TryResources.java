import java.io.File;
import java.io.FileOutputStream;

//TRY WITH RESOURCES
/*
 1)Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable, can be used as a resource.
 2)The declaration statement appears within parentheses immediately after the try keyword.
 3)Because the BufferedReader instance is declared in a try-with-resource statement, 
   it will be closed regardless of whether the try statement completes normally or abruptly (EXAMPLE:
   as a result of the method BufferedReader.readLine throwing an IOException).
 */

public class TryResources {

	public static void main(String[] args) throws Exception {
		
		String content="writing in file successfull";
		
		byte[] getcontent=content.getBytes();
		
		File file=new File("D:/test.txt");
		
		try(FileOutputStream fos=new FileOutputStream(file)) //automatically closes the connections 
															 //similar to Using in .net
		{
			fos.write(getcontent);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}
