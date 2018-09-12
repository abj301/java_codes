package question9;




public class Document  {

public void display(Printable P){
	
	System.out.println(P.print());
}

	
public static void main(String[] args) {
	Document d=new Document();
	
	d.display(new Printable() {
		
		@Override
		public int print() {
			int i=10*20;
			return i;	
		}
	});
}
	
}
