import java.util.ArrayList;
import java.util.List;

//COMPOSITION IS A DESIGN TECHNIQUE TO IMPLEMENT HAS-A RELATIONSHIP IN CLASSES
//DIFFERENCE BETWEEN INHERITANCE AND COMPOSITION 
//INHREITANCE IS AN "is-a" REALTIONSHIP AND COMPOSITION IS AN "part-of" RELATIONSHIP
//COMPOSITION IMPLIES A REALTIONSHIP WHERE THE CHILD CANNOT EXIST INDEPENDENT OF THE PARENT 


//CREATE A EMPLOYEE AND ADDRESS CLASS CREATE CLASSES IN SUCH A WAY THAT INSTANCES IF THESE CLASSES ARE IMMUTABLE


/*
1)Don't provide "setter" methods — methods that modify fields or objects referred to by fields.

2)Make all fields final and private.

3)Don't allow subclasses to override methods. The simplest way to do this is to declare the class as final.
A more sophisticated approach is to make the constructor private and construct instances in factory methods.

4)If the instance fields include references to mutable objects, don't allow those objects to be changed:
	Don't provide methods that modify the mutable objects.
	Don't share references to the mutable objects.
 	Never store references to external, mutable objects passed to the constructor; 
 	if necessary, create copies, and store references to the copies. 
 	Similarly, create copies of your internal mutable objects when necessary to avoid returning the originals in your methods.
 */
public class Immutable_composition_main {

	public static void main(String[] args) {
		
		Address a1=new Address(1,"bhandup","mumbai",400078);
		Address a2=new Address(2,"vashi","mumbai",400078);
		Address a3=new Address(5,"marol","mumbai",400078);
		Address a4=new Address(4,"powai","mumbai",400078);
		List<Address> addr=new ArrayList<Address>();
		addr.add(a1);
		addr.add(a2);
		addr.add(a3);
		addr.add(a4);
		Employee emp=new Employee(addr);
		List<Address> adrs=emp.getAddr();
		for(Address ad : adrs) {
			System.out.println("flat no:" + ad.getFlatno() + "area :" + ad.getArea() + "Region:" + ad.getRegion() + "Pincode" + ad.getPincode());
		}
		
		
		
		
	}

}
