
public class Occurences {
	private MyArray arrayOccur = new MyArray();
	private String phrase;
	
	public void count() {
		if (phrase == null || phrase == "") { System.out.println("rien à checker");}
		else{
			for (int i =0; i<phrase.length();i++) {
				CharOccur temp = new CharOccur(phrase.charAt(i),1);
				if (arrayOccur.contains(temp)) {temp.occurIncr(); }
				else {arrayOccur.addObject(temp); }
				}
				
			}
		}
	
	public void displayCount() {
		System.out.println(arrayOccur.toString());
		}
	}
