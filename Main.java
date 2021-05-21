package test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		
		System.out.println(year);
		
	}
	
	public static void intVar(int... i) {
		System.out.println(Arrays.toString(i));
	}
	
	public static long test(long n) {
		long answer = 0;
		
		StringBuilder sb = new StringBuilder();
		
		while(n > 0) {
			sb.append(n % 10);
			n = n / 10;
		}
		
		String num = sb.toString();
		int[] arr = new int[num.length()];
		
		for(int i = 0; i < num.length(); i++) {
			arr[i] = Integer.parseInt(Character.toString(num.charAt(i)));
		}
		
		int temp = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - (i + 1); j++) {
				if(arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		StringBuilder sb2 = new StringBuilder();
		
		for(int i : arr) {
			sb2.append(i);
		}
		
		answer = Long.parseLong(sb2.toString());
		
		return answer;
	}
}
