package test;

public class Remocon {
	
	private AirConditioner airConditioner;
	
	public Remocon(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	public AirConditioner getAirConditioner() {
		return airConditioner;
	}

	public void setAirConditioner(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}
	
	public void powerOn() {
		airConditioner.setPower(true);
		airConditioner.setTemp(22);
		airConditioner.setWind(3);
		System.out.println("에어컨 전원을 켰습니다. 현재 온도는 " + airConditioner.getTemp() + "도 이며 바람세기는 " + airConditioner.getWind() + " 입니다.");
	}
	
	public void powerOff() {
		airConditioner.setPower(false);
		System.out.println("에어컨 전원을 종료 합니다.");
	}
	
	public void controllTemp(int mode) {
		
		if(mode == 1) {
			airConditioner.setTemp(airConditioner.getTemp() + 1);
			System.out.println("현재 설정 온도는 " + airConditioner.getTemp() + " 도 입니다.");
		} else {
			airConditioner.setTemp(airConditioner.getTemp() - 1);
			System.out.println("현재 설정 온도는 " + airConditioner.getTemp() + " 도 입니다.");
		}
	}
	
	public void controllWind(int mode) {
		
		if(mode == 3) {
			airConditioner.setWind(airConditioner.getWind() + 1);
			System.out.println("현재 바람세기는 " + airConditioner.getWind() + " 입니다.");
		} else {
			airConditioner.setWind(airConditioner.getWind() - 1);
			System.out.println("현재 바람세기는 " + airConditioner.getWind() + " 입니다.");
		}
	}
	
}
