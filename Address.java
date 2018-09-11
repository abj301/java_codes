
public final class Address {
	final private int flatno;
	final private String Area ;
	final private String region;
	final private int pincode;
	
	public Address(int flatno,String Area,String region,int pincode) {
		this.Area= Area;
		this.region=region;
		this.flatno = flatno;
		this.pincode = pincode;
	}
	
	public int getFlatno() {
		return flatno;
	}
	public String getArea() {
		return Area;
	}
	public String getRegion() {
		return region;
	}
	public int getPincode() {
		return pincode;
	}

}
