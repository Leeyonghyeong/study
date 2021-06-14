package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTest {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Remocon r = new Remocon(new AirConditioner());
		
		System.out.println("에어컨 전원을 키려면 on을 입력해 주세요.");
		
		String checkPower = br.readLine();
		
		if(checkPower.equals("on")) {
			r.powerOn();
		} else if(checkPower.equals("off")){
			r.powerOff();
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		while(r.getAirConditioner().isPower()) {
			System.out.println("==================================");
			System.out.println("원하시는 메뉴를 선택해 주세요.");
			System.out.println("1.전원 2.온도조절 3.바람세기");
			
			int menu = Integer.parseInt(br.readLine());
			int mode = 0;
			
			switch(menu) {
				case 1 : 
					r.powerOff();
					break;
				case 2 : 
					System.out.println("온도를 올리시려면 1을 내리시려면 2를 입력해 주세요.");
					mode = Integer.parseInt(br.readLine());
					r.controllTemp(mode);
					break;
				case 3 :
					System.out.println("바람세기를 올리시려면 3을 내리시려면 4를 입력해 주세요.");
					mode = Integer.parseInt(br.readLine());
					r.controllWind(mode);
					break;
			}
			
			System.out.println();
		}
		
	}
	
}
