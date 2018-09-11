//Generics


class Box<T>
{
	T item;

	public T getItem() {
		return (T) item.getClass().getName();
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
public class Generics {

	public static void main(String[] args) {
		Box b=new Box();
		b.setItem("abhishek");
		System.out.println(b.getItem());
		b.setItem(14124);
		System.out.println(b.getItem());
		b.setItem(1212.32113);
		System.out.println(b.getItem());
		
		

	}

}
