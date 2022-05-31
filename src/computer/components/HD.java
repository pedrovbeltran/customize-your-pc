package computer.components;
import computer.*;

public class HD extends Component {
    private int capacityInGbs;
	private String type;
    private int cost;
    
    public HD(Computer comp, int capacityInGbs, String type, int cost) {
        super("HD", comp);
        this.capacityInGbs = capacityInGbs;
		this.type = type;
        this.cost = cost;
	}

	@Override
	public String getSpecs() {
		return computer.getSpecs() + capacityInGbs + " GB of " + type + "\n";
	}

	@Override
	public double cost() {
		return computer.cost() + cost;
	}
}
