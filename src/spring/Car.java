package spring;

public class Car {
	private String type;
	private String factory;
	private double price;
	public String getType() {
		return type;
	}
	public String getFactory() {
		return factory;
	}
	public double getPrice() {
		return price;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [type=" + type + ", factory=" + factory + ", price=" + price + "]";
	}
	public Car(String type, String factory, double price) {
		super();
		this.type = type;
		this.factory = factory;
		this.price = price;
	}
	public Car() {
		
	}
}
	