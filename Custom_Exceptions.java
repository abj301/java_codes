 //EXCEPIONS
/*
--- When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally,
 	which is not recommended, therefore, these exceptions are to be handled.

 //CHECKED EXCEPTIONS
--- a checked exception occurs at compile time these are also called as compile time exceptions.
   	these exceptions cannot be ignored at the time of compilation,the programmer should take care of these exceptions
 
 //UNCHECKED EXCEPTIONS
--- an unchecked exception is an exception that occurs at the time of execution.these are also called as RUNTIME EXCEPTIONS.

***EXCEPTION HIERARCHY***
	java.lang.object ---> java.lang.Throwable --->java.lang.Exception
	Runtime Exception and Checked Exception extend exception.

//KEYWORDS
---TRY
---CATCH
---FINALLY
---THROWS
1)If a method does not handle a checked exception, the method must declare it using the "THROWS" keyword. 
The throws keyword appears at the end of a method's signature.

2)You can throw an exception, either a newly instantiated one or an exception that you just caught, by using the "THROW" keyword.

*/
public class Custom_Exceptions  {
	
	public int dividebyzero(int no) throws UncheckedExceptions
	{
		return no/0;
		
	}

	public static void main(String[] args) {
		
		try {
			Custom_Exceptions c=new Custom_Exceptions();
			c.dividebyzero(12);
		}
		catch(RuntimeException e)
		{
			System.out.println("exception :" + e);
		}

}
}
