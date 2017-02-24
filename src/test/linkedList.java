package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		ArrayList Alist = new ArrayList();
//		int count = 0;
//		int j=0;
		for(int i=0;i<800000;i++)
			{
			list.add(i);
			Alist.add(i);
			}
		Iterator<Integer> ls = list.iterator();
		Iterator<Integer> lr = Alist.iterator();
		long startTime = System.currentTimeMillis();
		while(ls.hasNext())
			if(ls.next() % 2 == 0)
				ls.remove();
		long endTime = System.currentTimeMillis();
		System.out.println("花费时间为："+(endTime-startTime));
		
		long astartTime = System.currentTimeMillis();
		while(lr.hasNext())
			if(lr.next() % 2 == 0)
				lr.remove();
		long aendTime = System.currentTimeMillis();
		System.out.println("花费时间为："+(aendTime-astartTime));
		
		
		
//		for(int i=0;i<5;i++)
//			count+=(int)list.get(i);
//		
//		while(ls.hasNext())
//		{
//			System.out.print(list.get(j++)+"  ");
//			ls.next();
//		}
//		list.addFirst(9);
//		list.addLast(10);
//		list.removeLast();
//		list.removeFirst();


	}

}
