
public class Main {

	public static void main(String[] args) {
			StringOutils sOutils = new StringOutils();
			
			String customString = "Lorsque l’on veut connaitre son ip on fait souvent appel à des sites du genre: whatismyip.com, mon-ip.com ou on utilise un ifconfig en ssh";
			//System.out.println(sOutils.palindrome("ABBA"));
			System.out.println(sOutils.replaceEO("jkohg"));
			
			for (int i=0; i<customString.length();i++){
				System.out.println(sOutils.explode(customString)[i]);}
	}

}
