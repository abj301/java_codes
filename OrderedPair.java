interface Pair<K,V>{
	K getKey();
	V getValue();
}

public class OrderedPair<K,V>implements Pair<K,V>{
	private K key;
	private V value;
	
	public OrderedPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

	public static void main(String[] args) {
		OrderedPair<Integer,String> p1=new OrderedPair<Integer,String>(12,"abhishek");
		OrderedPair<Double,String>  p2=new OrderedPair<Double, String>(12.1, "ramesh");
		System.out.println(p1.getKey());
		System.out.println(p1.getValue());
		System.out.println(p2.getKey());
		System.out.println(p2.getValue());
		
		//AUTOBOXING AND UNBOXING
		
		
	}

	
}
