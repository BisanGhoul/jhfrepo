package h;

import java.util.Arrays;

public class MyStack {

	public static void main(String[] args) {
		MyStack s = new MyStack(2);
		s.insert(1);
		s.insert(2);
		s.insert(3);
		System.out.println(s.pop());
		s.insert(4);
		System.out.println(s.pop());
		System.out.println(s.pop());



	}

	int size;
	int capacity;
	int[] arr;

	MyStack(int capacity){
		this.capacity = capacity;
		this.arr = new int[capacity];
		size=0;
	}

	boolean isEmpty() {
		if(size<=0) {
			return true;
		}

		return false;
	}

	void isFull() {
		if(size>=capacity) {
			arr = Arrays.copyOf(arr, capacity*2);
//			for(int i:arr) {
//				System.out.println(i);
//			}
		}	
	}

	void insert(int val) {
		isFull();
		arr[size]=val;
		size++;

	}
	
	int pop() {
		if(!isEmpty()) {
			return arr[--size];
		}
		return -1;
	}

}
