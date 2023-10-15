package oopExam;

/*
 * Iphone1 can inherit Applewatch because Applewatch is an abstract class by an extends keyword
 * Then AppleWatch can inherit Phone by an implements keyword
 */

public class Iphone1 extends AppleWatch implements Phone {

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public Iphone1() {
		this.price = 0;
        this.info = "";
        this.user = ' ';
        this.madeInUSA = false;
	}

	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		super();
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
	}

	public void regularClassInfo() {
		System.out.println("\nFeatures of a regular class:");
		System.out.println("----------- Regular classes can have both abstract and non-abstract methods-----------");
		System.out.println("----------- Regular classes can have constructors-----------");
		System.out.println("----------- Regular classes can have instance variables with default values-----------");
	}

	public void youtube() {
		System.out.println("\n-----------A regular class cannot inherit a regular class or abstract class by implements keyword-----------");
		System.out.println("-----------An abstract class cannot inherit a regular class or abstract class by implements keyword-----------");

	}
}
