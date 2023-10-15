package oopExam;

public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'M';

	public Iphone2() {

		super.getPrice();
		super.getInfo();
		super.getUser();
		super.isMadeInUSA();
	}

	public Iphone2(int price, String info, char user, boolean madeInUSA, char userOfIphone2) {

		super(1500, "2023", 'M', false);
		this.userOfIphone2 = 'M';

		super.setPrice(1000);
		super.setInfo("2023");
		super.setUser(userOfIphone2);
		super.setMadeInUSA((true));
	}

	public void Iphone2Info() {
		System.out.println("\nIphone2 Info:");
		System.out.println("\nUser of Iphone2: " + this.userOfIphone2);
	}

	public void Iphone2Info(char userofIphone2) {
		super.setPrice(2000);
		super.setInfo("2023");
		super.setUser(userOfIphone2);
		super.setMadeInUSA((true));
		System.out.println("\nUse of Iphone2: " + this.userOfIphone2);
	}

	public void dropbox() {
		System.out.println("\n-----------super method is used to call the constructor of super class-----------");
		System.out.println("-----------Super keyword can call any types of method from super class-----------");
		

	}
}