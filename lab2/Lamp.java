package lab2;
public class Lamp {
	// obj attributes
	boolean isOn=false;
	String color;
	int watts;
	
	//obj methods
	public void turnOn() {
		isOn=true;
	}
	public void turnOff() {
		isOn=false;
	}
	public void setColor(String c) {
		color=c;
	}
	public String getColor() {
	return color;
	}
	public void setWatts(int w) {
		watts=w;
	}
	public int getWatts() {
	return watts;
	}
}