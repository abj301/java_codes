//Singleton is  design pattern which allows only one instance of class.
//PURPOSE OF SINGLETON IS TO CONTROL OBJECT CREATION,LIMITING THE NUMBER TO ONE BUT ALLOWING FLEXIBILITY TO CREATE 
//MORE OBJECTS IF THE SITUATION CHANGES
//SINGLETONS OFTEN CONTROL ACCESS TO RESORUCES SUCH AS DATABASE CONNECTIONS OR SOCKETS
//THERE ARE FEW WAYS TO CREATE A SINGLETON CLASS
//ONE IS THROUGH GET SINGLETON LIKE BEHAVIOUR THROUGH USING STATIC FIELD AND METHODS 
//MOST COMMON WAY IS BY HAVING A SINGLE INSTANCE OF THE CLASS AS A STATIC FIELD.
//SINGLEOBJECT CLASS HAVE ITS CONSTRUCTOR AS PRIVATE AND HAVE A STATIC INSTANCE OF ITSELF

class Single_object{
	
	//creating a  object of Single_object
	private static Single_object obj=new Single_object();
	
	//make the constructor private so that it cannot be accessed
	private Single_object() {
	}
	
	//return/make available the created object through a static method 
	public static Single_object getSingle_object() {
			return obj;
			
	}
	public void Singlemthd() {
		System.out.println("singleton class successfully created");
	}
	
}
public class Singleton {

	public static void main(String[] args) {
			
		//Single_object object=new Single_object();// this wont work as we have made the constrcutor private.
		
		//getting the already created object
		Single_object object = Single_object.getSingle_object();
		object.Singlemthd();

	}

}
