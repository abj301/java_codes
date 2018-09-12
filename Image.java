package question9;

public class Image {
	
	public void display(Printable p) {
		
		System.out.println(p.print());
	}

public static void main(String[] args) {
	Image i =new Image();
	
	i.display(new Printable() {
		@Override
	public int print() {
		int i= 10+20;
		return i;
		}
		
	});
}
}

	


