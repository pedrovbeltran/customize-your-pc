package computer;

public abstract class Computer {
	private String specs;
    
	public Computer(String specs) {
        super();
		this.specs = specs;
	}
    
	public String getSpecs() {
		return specs;
	}
    
	public abstract double cost();
}