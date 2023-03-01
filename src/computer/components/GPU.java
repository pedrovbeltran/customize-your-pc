package computer.components;
import computer.*;

public class GPU extends ComponentDecorator {
    private int memoryInGb;
    private String name;
    private int cost;
    
    public GPU(Computer comp, int memoryInGb, String name, int cost) {
        super("GPU", comp);
        this.memoryInGb = memoryInGb;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String getSpecs() {
        return computer.getSpecs() + "A " + name + " graphics card with " + memoryInGb + " GB of memory\n";
    }

    @Override
    public double cost() {
        return computer.cost() + cost;
    }
}
