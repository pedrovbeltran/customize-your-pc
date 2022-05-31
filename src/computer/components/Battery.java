package computer.components;
import computer.*;

public class Battery extends Component {
    private int capacityInMah;
    private int cost;
    
    public Battery(Computer comp, int capacityInMah, int cost) {
        super("Battery", comp);
        this.capacityInMah = capacityInMah;
        this.cost = cost;
	}

	@Override
	public String getSpecs() {
        return computer.getSpecs() + capacityInMah + " mAh of battery\n";	}

	@Override
	public double cost() {
		return computer.cost() + cost;
	}
}
