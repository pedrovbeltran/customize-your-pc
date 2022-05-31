package computer;

public class MyPC extends Computer {
	public MyPC() {
		super("");
        System.out.println("You are initializing a new computer! Hope you like it!");
        System.out.println("Your computer specs are:\n");
	}

	@Override
	public double cost() {
		return 0;
	}
}