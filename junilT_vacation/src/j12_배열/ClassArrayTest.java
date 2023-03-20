package j12_배열;

public class ClassArrayTest {

	public String[] createArray(String[] strArray) {
		
		for(int i = 0; i < strArray.length; i++) {
			strArray[i] = "김준" + (i + 1);
		}
		
		return strArray;
	}
}
