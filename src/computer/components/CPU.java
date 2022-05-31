package computer.components;
import computer.*;

public class CPU extends Component {
    private double frequencyInGhz;
    private int cores;
    private String name;
    private int cost;
    
    public CPU(Computer comp, double frequencyInGhz, int cores, String name, int cost) {
        super("CPU", comp);
        this.frequencyInGhz = frequencyInGhz;
        this.cores = cores;
        this.name = name;
        this.cost = cost;
	}

	@Override
	public String getSpecs() {
        return computer.getSpecs() + "An " + name + " processor with " + cores + " cores at " + frequencyInGhz + " GHz\n";
    }

	@Override
	public double cost() {
		return computer.cost() + cost;
	}
}
