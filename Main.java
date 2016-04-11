
public class Main {

	public static void main(String[] args) {
			StringOutils sOutils = new StringOutils();
			
			String customString = "Lorsque l’on veut connaitre son ip on";
			//System.out.println(sOutils.palindrome("ABBA"));
			System.out.println(sOutils.replaceEO("jkohg"));
			
			String[] exploded = sOutils.explode(customString);
			for (int i=0; i<exploded.length;i++){
				System.out.println(exploded[i]);}
	}

}
