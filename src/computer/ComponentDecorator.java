package computer;

public abstract class ComponentDecorator extends Computer {
    protected Computer computer;

	public ComponentDecorator(String specs, Computer comp) {
        super(specs);
		this.computer = comp;
	}

	public abstract String getSpecs();
}
