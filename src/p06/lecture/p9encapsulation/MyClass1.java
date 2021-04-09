package p06.lecture.p9encapsulation;

public class MyClass1 {
	private String str;
	private int memory;
	private boolean on; //불리언은 is로 만들어지는데 get으로 바꿔도 ok
	private String model;
	private int ssd;
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public boolean isOn() {
		//불리언은 is로 만들어지는데 get으로 바꿔도 ok
		return on;
	}
	public void setOn(boolean on) {  
		this.on = on;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
}
