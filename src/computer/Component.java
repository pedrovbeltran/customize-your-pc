package computer;

public abstract class Component extends Computer {
    protected Computer computer;

	public Component(String specs, Computer comp) {
        super(specs);
		this.computer = comp;
	}

	public abstract String getSpecs();
}
