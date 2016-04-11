
public class CharOccur {
	private char key;
	private int occur;
	
	public CharOccur(char key, int countInit) {
		this.setKey(key);
		this.setOccur(countInit);
	}
	
	public char getKey() {
		return key;
	}
	public int getOccur() {
		return occur;
	}
	public void setKey(char key) {
		this.key = key;
	}
	public void setOccur(int occur) {
		this.occur = occur;
	}
	
	public void occurIncr() {
		occur += 1;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + key;
		return result;
	}
	@Override
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CharOccur other = (CharOccur) obj;
		if (key != other.key)
			return false;
		return true;
	}
	
	public String toString() {
		return "Key: "+key+"; Nombre occurences: "+occur;
	}
	
}
