package _01_array_manipulation;

public class Sorting {

	public static String[] sort(String[] testArray) {
		int counter = 0;
		String temp = "";
		while (counter<=testArray.length*2) {
			System.out.println("hi");
		for (int i = 1; i < testArray.length; i++) {
			if(testArray[i].compareTo(testArray[i-1])<0){
				temp = testArray[i-1];
				testArray[i-1]=testArray[i];
				testArray[i]=temp;
				temp = "";
				counter+=1;
			}
		}
		}
		for (int i = 0; i < testArray.length; i++) {
			System.out.println(testArray[i]);
		}
		
		return testArray;
	}

}
