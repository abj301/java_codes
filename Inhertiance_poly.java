class Vehicle{
	public void tyre()
	{
		System.out.println("this is tyre method of parent class");
	}
}

class sub extends Vehicle{
	public void chasi()
	{
		System.out.println("this is sub classes own method");
	}
	@Override
	public void tyre() {
		super.tyre(); //INVOCATION OF PARENT CLASSES METHOD FROM SUB CLASS
		System.out.println("this is to show that sub class can use the methods inside base vehicle class");
		System.out.println("sub class can also define its specific method behavior inherited from parent class");//OVERRIDING
	}
	
}
class Sub2 extends Vehicle{
	public void tyre(int no_tyres)
	{
		System.out.println("this is method overloading ");//METHOD OVERLOADING IS USED WHEN YOU KNOW WHAT KIND OF OPERATION YOU WANT TO PERFORM 
		//BUT YOU DONT KNOW HOW TO DO IT
		//EXAMPLE :SEARCH A DATABASE BY ID AND SEARCH A DATABASE BY NAME
		//OVERLOADING IS ALSO A EXAMPLE OF STATIC POLYMORPHISM
	}
}


public class Inhertiance_poly {

	public static void main(String[] args) {
		
		Vehicle base=new Vehicle();//OBJECT OF PARENT CLASS
		base.tyre();
		sub sub=new sub();//OBJECT OF SUB CLASS
		sub.chasi();
		sub.tyre();
		Sub2 sub2=new Sub2();
		sub2.tyre();//OBJECT OF SUB2 CLASS
	//	sub subs=new Vehicle(); THIS WILL THORW AN CLASSCAST EXCEPTION BECUASE IN JAVA UPCASTING IS ALWAYS ALLOWED BUT DOWNCASTING MAY THROW AN
	//CLASS CAST EXCEPTION AS IT INVOLVES A TYPE CHECK
		

	}

}
