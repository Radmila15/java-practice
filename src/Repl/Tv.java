package Repl;

public class Tv {

	int channel = 1, volumeLevel = 1;
	boolean on = false;
	String brand = "undefined";

	public Tv() {
		    System.out.println("Creating TV object using no Args- constructor");
		  }

	public Tv(String brand) {
		    this.brand = brand;
		    System.out.println("Creating TV object using 1 arg - constructor");
		  }

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (!isOn() || volumeLevel >= 1 || volumeLevel <= 7) {
			this.volumeLevel = volumeLevel;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {//0
		if (!isOn() || channel > 0 || channel <= 120) {
			this.channel = channel;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}

	public String getBrand() {//1
		return brand;
	}

	public void setBrand(String brand) {//2
		this.brand = brand;
	}

	public void channelUp() {//3
		if (!isOn() || channel >=1 || channel < 120) {
			channel++;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}

	public void channelDown() {//4
		if (!isOn() || channel > 1 || channel <= 120) {
			channel--;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}

	public void volumeUp() {//5
		if (!isOn() || volumeLevel >=1 || volumeLevel < 7) {
			volumeLevel++;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}

	public void volumeDown() {//6
		if (!isOn() || volumeLevel > 1 || volumeLevel <=7) {
			volumeLevel--;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");		}
	}

	public boolean isOn() {//7
		return on;
	}

	public void turnOn() { //8
		if (!isOn()) {
			System.out.println("TV is already ON");
		} else {
			this.on = true;
		}
	}

	public void turnOff() { //9
		if (isOn()) {
			System.out.println("TV is already OFF");
		} else {
			this.on = false;
		}

	}

}
