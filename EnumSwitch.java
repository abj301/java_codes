package Question10;
//SWITCH WITH ENUM ,SWITCH WITH STRING AND INT 
public class EnumSwitch {
	/*//SWITCH WITH ENUM

	enum toothpaste{
		colgate,pepsodent,meswak,vico;
	}
*/
	
	public static void main(String[] args) {
	/*//SWITCH WITH ENUM

		toothpaste t;
		t=toothpaste.colgate;
		switch (t) {
		case colgate:
			System.out.println("Packed to the max with freshness.");
			break;
		case pepsodent:
			System.out.println("Stronger teeth for the future.");
			break;
		case meswak:
			System.out.println("Complete oral care");
			break;
		case vico:
			System.out.println("Ayurvedic medecine for gums and teeth");
			break;
			default:
				System.out.println("please choose a valid option");
				break;
		}
		*/
		/*
		//SWITCH WITH STRING
		 
		String s="one";
		switch (s) {
		case "one" :
			System.out.println("you have choosen option one");
			break;
		case "two":
			System.out.println("you have choosen option two");
			break;
		case "three":
			System.out.println("you have choosen option three");
			break;
			default:
				System.out.println("you have not choosen any option");
		}
		*/
		//SWITCH WITH INT
		int tyresno = 4;
		String vehicle;
		switch (tyresno) {
		case 1:
			System.out.println("you have choosen unicycle");
			break;
		case 2:
			System.out.println("you have choosen Bicycle");
			break;
		case 3:
			System.out.println("you have choosen rickshaw");
			break;
		case 4:
			System.out.println("you have choosen car");
			break;
			default:
				System.out.println("choose a valid option");
				break;		
		}
				
	}

}
