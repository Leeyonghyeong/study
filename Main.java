package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int temp;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
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
