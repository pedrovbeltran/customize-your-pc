package computer.components;
import computer.*;

public class RAM extends Component {
    private int capacityInGbs;
    private int cost;
    
    public RAM(Computer comp, int capacityInGbs, int cost) {
        super("RAM", comp);
        this.capacityInGbs = capacityInGbs;
        this.cost = cost;
	}

	@Override
	public String getSpecs() {
        return computer.getSpecs() + capacityInGbs + " GB of RAM\n";	}

	@Override
	public double cost() {
		return computer.cost() + cost;
	}
}
