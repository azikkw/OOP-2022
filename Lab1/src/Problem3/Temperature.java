package Problem3;

class Temperature
{
	double value;
	String scale;
	
	public Temperature() {
		value = 0;
		scale = "Celsius";
	}
	
	public Temperature(double value) {
		this();
		this.value = value;
	}
	public Temperature(String scale) {
		this.scale = scale;
	}
	
	public Temperature(double value, String scale) {
		this.value = value;
		this.scale = scale;
	}
	
	public double returnC(double degreesF) {
		return (5 * (degreesF - 32)) / 9;
	}
	public double returnF(double degreesC) {
		return (9 * (degreesC / 5)) + 32;
	}

	public void setValue(double value) {
		this.value = value;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public void setBoth(double value, String scale) {
		this.value = value;
		this.scale = scale;
	}
	
	public String getScale() {
		return scale;
	}
	
	public String toString() {
		return this.value + " " + this.scale;
	}
}