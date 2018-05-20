package _02_diy_array_list;


public class ArrayList<T>{
	T[] array;
	


	ArrayList(){
		array = (T[]) new Object[0];
	}
	
	void add(T x) {
		T[] test = (T[]) new Object[array.length+1];
		for (int i = 0; i < array.length; i++) {
			test[i]=array[i];
		}
		test[array.length]=x;
		array=test;
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
	}

	public T get(int i) {
		return array[i];
	}
	
	public void set(int y, T x) {
		array[y]=x;
	}
	
	public void addAt(int y, T x) {
		T[] test = (T[]) new Object[array.length+1];
	for (int i = 0; i < test.length; i++) {
		if(i==y) {
			test[i]=x;
			
		}else if(i<y){
			test[i]=array[i];
		}else {
			test[i]=array[i-1];
		}
	}
	array = test;
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	}

	public void remove(int x) {
		T[] test = (T[]) new Object[array.length+1];
		for (int i = 0; i < test.length; i++) {
			if(i>=x) {
				test[i]=array[i+1];
			}else{
				test[i]=array[i];
			}
			}
		}
	}
