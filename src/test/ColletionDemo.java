package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class ColletionDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(0, 11);
//		list.set(0, 3);
		int i=0;
		while(i<list.size())
		System.out.print(list.get(i++)+"  ");
		long startTime = System.nanoTime();
//		list.remove(1);
		long endTime = System.nanoTime();
		long time = endTime-startTime;
//		System.out.println(time);
	}
}
