package Repl;
public class TV {
	  int channel = 1, volumeLevel = 1;
	  boolean on = false;
	  String brand = "undefined";
	  
	  public TV() {
	    System.out.println("Creating TV object using no Args- constructor");
	  }
	  public TV(String brand) {
	    this.brand = brand;
	    System.out.println("Creating TV object using 1 arg - constructor");
	  }
	  public int getVolumeLevel(){
	    return volumeLevel;
	  }
	  public void setVolumeLevel(int volumeLevel){
	    if(isOn()==false || volumeLevel<1 || volumeLevel>7) {
	      System.out.println("ERROR: TV is either OFF or invalid Volume level");
	    } else {
	      this.volumeLevel = volumeLevel;
	    }
	  }
	  public int getChannel() {
	    return channel;
	  }
	  public void setChannel(int channel){
	    if (isOn()==false || channel <= 0 || channel >120)  {
	      System.out.println("ERROR: TV is either OFF or invalid Channel");
	    }else{
	    this.channel = channel;
	    }
	  }
	  public String getBrand(){
	    return brand;
	  }
	  public void setBrand (String brand){
	    this.brand = brand;
	  }
	  public void channelUp(){
	     if (isOn()==false || channel >120)  {
	      System.out.println("ERROR: TV is either OFF or invalid Channel");
	    }else{
	   channel++;
	    }
	  }
	  public void channelDown() {
	    if (isOn()==false || channel <= 0)  {
	      System.out.println("ERROR: TV is either OFF or invalid Channel");
	    }else{
	    channel--;
	    }
	  }
	  public void volumeUp(){
	    if(isOn()==false || volumeLevel>7) {
	      System.out.println("ERROR: TV is either OFF or invalid Volume level");
	    } else {
	    volumeLevel++;
	    }
	  }
	  public void volumeDown(){
	    if(isOn()==false || volumeLevel<1) {
	      System.out.println("ERROR: TV is either OFF or invalid Volume level");
	    } else {
	    volumeLevel--;
	    }
	  }
	  public boolean isOn(){
	    return on;
	  }
	  public void turnOn(){
	    if(!isOn()) {
	      System.out.println("TV is already ON");
	    }else{
	      this.on = true;
	    }
	  }
	  public void turnOff(){
	    if(isOn()) {
	      System.out.println("TV is already OFF");
	    }else{
	      this.on = false;
	    }
	    
	  }
	  
	}
