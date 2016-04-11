
public class MyArray {

	private Object[] myArray = new Object[1];
	
	public void addObject(Object obj) {
		myArray[myArray.length] = obj;
		Object[] newArray = new Object[myArray.length+1];
		for (int i=0; i<myArray.length; i++) {
			newArray[i] = myArray[i];
		}
		myArray = newArray;
	}

	public boolean contains(Object obj) {
		for (int i= 0; i<myArray.length; i++) {
			if (myArray[i].equals(obj)) {
				return true; }
			}
		return false;
		}

	public int getSize() {
		return myArray.length-1;
	}
	
	public String toString() {
		String result = "";
		for (int i = 0; i < this.getSize(); i++) {
			result+=myArray[i].toString();
		}
		return result;
	}
}
	

