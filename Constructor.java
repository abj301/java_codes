//DEFAULT CONSTRUCTOR

//PARAMETERIZED CONSTRUCTOR

//CONSTRUCTOR CHAINING
/*
	constructor chaining is the process of calling one constructor from another constructor with respect to current object
	constructor chaining can be done in two ways 
	--within same class : it can be done using "this()" keyword for constructors in same class
	--from base class : by using "super()" keyword to call constructor from the base class.
*/

//ORDER IN WHICH CONSTRUCTORS ARE GOING TO GET CALLED
/*
 1)ANIMAL PARAMETERIZED CONSTRUCTOR WITH 2 AGRS
 2)ANIMAL PARAMETERIZED CONSTRUCTOR WITH ONE ARG
 3)ANIMAL DEFAULT CONSTRUCTOR
 */

class animal
{
	int legs;
	String sound;
	int weight;
	animal(int legs,String sound)//constructor 1
	{
		this.legs=legs;
		this.sound=sound;
		System.out.println(sound);
		System.out.println(legs);
		
	}
	//constructor overloading
	animal(int weight) //constructor 2
	{
		this(4,"meow");
		this.weight=weight;
		System.out.println(weight);
	}
	animal(){
		this(23);
		System.out.println("this is the default constructor");
	}
}
class cat extends animal{
	cat(){
		super();//constructor chaining super calls default const of parent class,which calls parameterized const with 1 are of animal
				//which inturn calls parameterized const with 2 args
	}
}


public class Constructor {

	public static void main(String[] args) {
		cat c=new cat();
		
	}

}
