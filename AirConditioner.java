package test;

public class AirConditioner {
	
	private boolean power;
	private int temp;
	private int wind;
	
	public boolean isPower() {
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public int getTemp() {
		return temp;
	}
	
	public void setTemp(int temp) {
		
		if(temp > 28 || temp < 18) {
			System.out.println("설정 가능한 온도는 18 ~ 28도 입니다.");
			return;
		}
		
		this.temp = temp;
	}
	
	public int getWind() {
		return wind;
	}
	
	public void setWind(int wind) {
		
		if(wind > 5 || wind < 1) {
			System.out.println("설정 가능한 바람세기는 1 ~ 5 입니다.");
			return;
		}
		
		this.wind = wind;
	}
	
	
}
