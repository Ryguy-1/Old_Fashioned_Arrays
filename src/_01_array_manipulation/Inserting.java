package _01_array_manipulation;



public class Inserting {

	public static int[] insertAt(int[] testArray, int x, int y) {
		int[] array = new int[testArray.length+1];
		for (int i = 0; i < array.length; i++) {
			if(i<x) {
				array[i]=testArray[i];
			}else if(i==x) {
				array[i]=y;
			}else {
				array[i]=testArray[i-1];
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return array;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		String[] array = new String[orderedArray.length+1];
		for (int i = 0; i < orderedArray.length; i++) {
			array[i]=orderedArray[i];
		}
		array[orderedArray.length]=string;
		Sorting.sort(array);
		return array;
	}
	
}
