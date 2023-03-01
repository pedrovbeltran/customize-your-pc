package computer.components;
import computer.*;

public class IOPorts extends ComponentDecorator {
    private int quantity;
	private String type;
    private int cost;
    
    public IOPorts(Computer comp, int quantity, int cost) {
        super("IOPorts", comp);
        this.quantity = quantity;
        this.cost = cost;
	}

	@Override
	public String getSpecs() {
		return computer.getSpecs() + quantity + " ports " + type;
	}

	@Override
	public double cost() {
		return computer.cost() + cost;
	}
}
