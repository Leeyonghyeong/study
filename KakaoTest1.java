package test;

class NewId {
	
	public String lowerCase(String id) {
		
		return id.toLowerCase();
	}
	
	public String regex(String str) {
		
		String result = str.replaceAll("[^a-z0-9-_.]", "");
		
		result = result.replaceAll("[.]{2,}", ".");
		
		result = result.replaceAll("^[.]", "");
		
		result = result.replaceAll("[.]$", "");
		
		if(result.equals("") || result == null) {
			result = "a";
		}
		
		if(result.length() < 3) {
			for(int i = 0; i < 3; i++) {
				if(result.length() >= 3) {
					break;
				}
				
				String endPoint = result.substring(result.length() - 1, result.length());
				result += endPoint;
			}
		}
		
		if(result.length() > 15) {
			result = result.substring(0, 15);
			result = result.replaceAll("[.]$", "");
		}
		
		return result;
	}
}

public class KakaoTest1 {

	public static void main(String[] args) throws Exception {
		
		NewId newId = new NewId();
		
		String id1 = "...!@BaT#*..y.abcdefghijklm*.";
		String id2 = "z-+.^.";
		String id3 = "=.=";
		String id4 = "123_.def";
		String id5 = "abcdefghijklmn.p";
		
		System.out.println(newId.regex(newId.lowerCase(id1)));
		System.out.println(newId.regex(newId.lowerCase(id2)));
		System.out.println(newId.regex(newId.lowerCase(id3)));
		System.out.println(newId.regex(newId.lowerCase(id4)));
		System.out.println(newId.regex(newId.lowerCase(id5)));
		
		System.out.println(Fibonacci(10000));

	}
	
	public static String zeroFill(String str, int len, String fill) {
		
		StringBuilder result = new StringBuilder();
		
		if(str.length() < len) {
			for(int i = 0; i < len - str.length(); i++) {
				result.append(fill);
			}
			result.append(str);
		}
		
		if(str.length() == len || str.length() > len) {
			result.append(str);
		}
		
		return result.toString();
	}
	
	public static int factorial(int num) {
		
		if(num < 1) {
			return 1;
		}
		
		return num * factorial(num - 1);
	}
	
	public static int Fibonacci(int num) {
		
		 if(num <= 1) {
			 return num;
		 } else {
			 return Fibonacci(num -2) + Fibonacci(num - 1);
		 }			 		
	}										

}
