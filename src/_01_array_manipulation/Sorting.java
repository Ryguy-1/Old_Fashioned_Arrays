package _01_array_manipulation;

public class Sorting {

	public static String[] sort(String[] testArray) {
		for (int i = 0; i < testArray.length; i++) {
			for (int j = i+1; j < testArray.length; j++) {
				if(testArray[j].compareTo(testArray[i])<0) {
					String x = testArray[i];
					testArray[i]=testArray[j];
					testArray[j]=x;
					
				}
			}
		}
		return testArray;
	}

}
