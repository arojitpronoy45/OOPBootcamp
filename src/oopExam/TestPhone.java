package oopExam;

public class TestPhone {

	public static void main(String[] args) {

		System.out.println("\n------------------------Iphone1 Getter and Setter methods-------------------------------");
		Iphone1 iphone = new Iphone1();
		iphone.setPrice(750);
		iphone.setInfo("iPhone 13 Pro");
		iphone.setUser('M');
		iphone.setMadeInUSA(false);

		System.out.println("Price: $" + iphone.getPrice());
		System.out.println("Info: " + iphone.getInfo());
		System.out.println("User: " + iphone.getUser());
		System.out.println("Made in USA: " + iphone.isMadeInUSA());

		System.out.println(iphone.getInfo() + "," + " the price was " + iphone.getPrice() + "$" + "," + " user's sex: "
				+ iphone.getUser() + " and boolean value for made in USA is: " + iphone.isMadeInUSA());

		System.out.println("\n------------------------Iphone2 inherit Iphone1 by extends keyword-------------------------------");
		Iphone2 iphone2 = new Iphone2();
		iphone2.setPrice(999);
		iphone2.setInfo("Iphone15Pro");
		iphone2.setUser('M');
		iphone2.setMadeInUSA(false);
		System.out.println("\nIphone2 Parameterized Info:");
		System.out.println("Price: $" + iphone2.getPrice());
		System.out.println("Info: " + iphone2.getInfo());
		System.out.println("User: " + iphone2.getUser());
		System.out.println("Made in USA: " + iphone2.isMadeInUSA());

		System.out.println("\n--------------------------Iphone6 inherit Iphone5 which inherits other child classes-----------------------------");
		Iphone6 iphone6 = new Iphone6();
		iphone6.compass();
		iphone6.materials(12, 112);
		iphone6.materials(3, 30);
		iphone6.materials(43, 430, 112);
		iphone6.materials(43, 11, 333);
		iphone6.materials(342, 0434, 112);
		iphone6.materials(232, 112, 112);
		iphone6.materials(2314, 21320, 23130);
		Iphone6.materials(232, 2323, "112", 2323);
		iphone6.materials();
		iphone6.materials(54, "4334", 4545, 5);
		iphone6.email();
		iphone6.photos();
		iphone6.Iphone2Info();
		iphone6.Iphone2Info('M');
		iphone6.dropbox();
		iphone6.interfaceInfo();
		iphone6.call();
		iphone6.message();
		iphone6.camera();
		iphone6.appleWatchInfo();
		iphone6.regularClassInfo();
		iphone6.youtube();
		iphone6.abstractClassInfo();

		System.out.println("\n------------------------ConfiguredIphone6 is inheriting Iphone6 and the Methods are: -------------------------------");
		ConfiguredIphone6 configuredIphone6 = new ConfiguredIphone6();
		configuredIphone6.compass();
		configuredIphone6.materials(23, 342);
		configuredIphone6.materials(1231, 1311);
		configuredIphone6.materials(4, 5, 3424);
		configuredIphone6.materials(32443, 34244, 23423);
		configuredIphone6.materials(342, 1, 342);
		configuredIphone6.materials(234234, 342, 3424);
		configuredIphone6.materials(232, "2345", 2342, 23223);
		configuredIphone6.materials();
		
		/*
		 *
		 * Iphone6 is multilevel Inheritance because Iphone6 is extending Iphone5 which then extends Iphone4, then Iphone4 extends 2 etc. 
		 * AppleWatch class is the base class and more than one derived class created from this single class - It is knwon as hierarchical inheritance
		 * ConfiguredIphone6 is a a derived class that inherited properties from Iphone6 a single parent class.
		 * 
		 */

	}

}
