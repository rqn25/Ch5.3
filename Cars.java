
public class Carsx {
	private String color;
	private int horsePower;
	private double engineSize;
	private String make;

	public Cars() {
	color = "White";
	horsePower = 250;
	engineSize = 4;
	make = "Toyota";

	}

	public Cars(String color, int horsePower, double engineSize, String make) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = make;

	}

	public void setColor(String color) {
		this.color = color;

	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;

	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;

	}

	public void setMake(String make) {
		this.make = make;

	}

	public String getColor() {
		return color;

	}

	public int getHorsePower() {
		return horsePower;

	}

	public double getEngineSize() {
		return engineSize;

	}

	public String getMake() {
		return make;

	}

	public String toString() {
		return "Color = " + color + ", Horse power = " + horsePower + ", Engine size = " + engineSize + ", Make = " + make;

	}

}
