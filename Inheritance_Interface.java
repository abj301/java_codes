

//INTERFACE IS A BLUEPRINT OF A CLASS
//A CLASS IMPLEMENTING A INTERFACE HAS TO DEFINE ALL THE METHODS INSIDE THE INTERFACE
//ALL THE FIELDS ARE PUBLIC,STATIC AND FINAL BY DEFAULT
//YOU CANNOT INSTANTIATE A INTERFACE
//DEFAULT METHODS WERE INTRODUCED SO THAT IMPLEMENTING CLASSSES DO NO BREAK

 interface veh1{
	void fun();
	void fun2();
	default void fun3() {//DEFAULT METHOD CAN BE DIRECTLY ACCESSEED THROUGH OBJECT.METHOD NAME
		System.out.println("default methods are allowed in java 8 so that the implementing classes do not break");
	}
}
class A implements veh1{

	@Override
	public void fun() {
		System.out.println("this is fun method");
	}

	@Override
	public void fun2() {
		System.out.println("this is fun2 method");
				
	}
	public void fun3() {
		veh1.super.fun3();
		
	}
	
}
class B implements veh1{

	@Override
	public void fun() {
		
		System.out.println("this is fun method of class B");
	}

	@Override
	public void fun2() {
		System.out.println("this is fun2 method of class B");
		
	}
	
}





public class Inheritance_Interface {

	public static void main(String[] args) {
	
		A a=new A();
		a.fun();
		a.fun2();
		a.fun3();
		B b=new B();
		b.fun();
		b.fun2();
		b.fun3();
		
	}

}
