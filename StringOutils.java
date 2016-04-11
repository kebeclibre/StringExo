import java.util.ArrayList;

public class StringOutils {
	
	private String chars = "abcdefghijklmnopqrstuvwxyz";
	
	
	public boolean palindrome(String word) {
		 
		int size = word.length();
		int halfSize = word.length() / 2;
		int i = 0;
		int j = size-1;
		while (i<halfSize && j>halfSize ) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}else{
				i++;
				j--;
			}
		}
		return true;
	}


	public String replaceEO(String word) {
		String werd = "";
		for (int i = 0; i<word.length();i++) {
			if (word.charAt(i) != 'o') {
				werd+=word.charAt(i);
			}else{
				werd+='e';
			}
		}
		return werd;
	}

	public String concat(String a, String b) {
		StringBuilder build = new StringBuilder(a);
		build.append(b);
		return build.toString();
	}

	public String[] explode(String a) {
		return a.split(" ");
	}

	public String encrypt(String a, int key){
		String result = "";
		for (int i= 0; i<a.length();i++) {
			char working=a.charAt(i);
			int unicodeWork=Character.getNumericValue(working);
			unicodeWork = unicodeWork + key;
			char[] resultChar = Character.toChars(unicodeWork);
			result += resultChar.toString();		
		}
		return result;
	}

//	public String decrypt(){}
	
//	public boolean isEqual(){}
	

}



