package test;

public class MainTest {

	public static void main(String[] args) {
		
		/**
		 *      *   
		 *     **   
		 *    ***   
		 *   ****   
		 *  *****   
		 */
		for(int i = 1; i < 6; i++) {
			for(int j = 5; j > 0; j--) {
				if(j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("========================");
		System.out.println();
		
		/**
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
}
