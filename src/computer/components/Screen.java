package computer.components;
import computer.*;

public class Screen extends ComponentDecorator {
    private int frequencyInHz;
    private int maxResolution;
    private String type;
    private int cost;
    
    public Screen(Computer comp, int frequencyInHz, int maxResolution, String type, int cost) {
        super("Screen", comp);
        this.frequencyInHz = frequencyInHz;
        this.maxResolution = maxResolution;
        this.type = type;
        this.cost = cost;
	}

	@Override
	public String getSpecs() {
        return computer.getSpecs() + "A " + type + " screen with " + maxResolution + " of maximum resolution at " + frequencyInHz + " Hz\n";
    }

	@Override
	public double cost() {
		return computer.cost() + cost;
	}
}
