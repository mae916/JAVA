package chapter12_3.arraylist;

import java.util.ArrayList;

/*
 *추가
 *꺼내기 - pop -> 가장 최근에 추가된 요소
 */

public class Stack<T> { //int도 받을수있고 string도 받을수 있게 하려고(유동적으로) T 자료형으로 지정함.
	private ArrayList<T> dataList;
	public Stack() {
				dataList = new ArrayList<T>();
		}
	public void push(T data) {
		dataList.add(data);
	}
	
	public T pop() {
		int len = dataList.size() - 1;
		
		return dataList.remove(len);
	}
}
