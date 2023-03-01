package computer.components;
import computer.*;

public class Camera extends ComponentDecorator {
    private int maxResolution;
    private int cost;
    
    public Camera(Computer comp, int maxResolution, int cost) {
        super("Camera", comp);
        this.maxResolution = maxResolution;
        this.cost = cost;
	}

	@Override
	public String getSpecs() {
        return computer.getSpecs() + maxResolution + "p of Maximum Resolution\n";	}

	@Override
	public double cost() {
		return computer.cost() + cost;
	}
}
