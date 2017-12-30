package practice.strings;

public class Acronym {

	public static void main(String[] args) {
		System.out.println(acronym(" - Ultimate BIG- -- -ENDGAME ramp -- "));
	}
	
	public static String acronym(String s) {
		String result = "";
		boolean isCharFound = false;
		s = s.toUpperCase();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ' || s.charAt(i) == '-') {
				isCharFound = false;
			} else  if(!isCharFound){
				result = result + s.charAt(i);
				isCharFound = true;
			}
			
		}
		return result;
	}

}
