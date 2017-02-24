package test;

public class MyDlist {
	private Dlist head=null;

	//初始化表头
	public void InitDlist(Dlist headNode)
	{
		if(head==null)
		{
			head=headNode;
			head.pre=null;
			head.next=null;
		}
		else
		{
			System.out.println("已经初始化过！");
		}
	}
	//显示链表
	public void showMyDlist(MyDlist mydlist)
	{
		Dlist tmp;
		if(mydlist == null)
		{
			System.out.println("这是个空链表！");
			return;
		}
		for(tmp=mydlist.head;tmp!=null;tmp=tmp.next)
		{
			System.out.print(tmp.getData()+"  ");
		}
		System.out.println();
	}
	//添加元素
	public void addMyDlist(MyDlist mydlist, Dlist dlist)
	{
		Dlist tmp;
		if(mydlist==null||mydlist.head==null)
		{
			InitDlist(dlist);
		}
		else
		{
			tmp = mydlist.head;
			mydlist.head =dlist;
			dlist.next =tmp;
			tmp.pre = dlist;
		}

	}
	//删除元素
	public void remove(MyDlist mydlist,Dlist dlist)
	{
		Dlist tmp;
		boolean flag =false;
		if(mydlist==null||mydlist.head==null)
		{
			System.out.println("删除失败！这是一个空链表！");
			flag =false;
			return;
		}
		if(mydlist.head.getData()==dlist.getData())
		{
			mydlist.head = mydlist.head.next;
			mydlist.head.pre =null;
			flag =true;
			return;
		}
		for(tmp = mydlist.head.next;tmp!=null;tmp=tmp.next)
		{
			if(tmp.getData()==dlist.getData())
			{
				if(tmp.next!=null)
				{
					tmp.pre.next = tmp.next;
					tmp.next.pre = tmp.pre;
				flag =true;
				}
				else
				{				
					tmp.pre.next = null;
					flag = true;
				}
			}
		 }
		
		if(flag)
			System.out.println("删除成功！");
		else
			System.out.println("删除失败！没有找到该元素！");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDlist mydlist = new MyDlist();
		Dlist dlist1 = new Dlist(1);
		Dlist dlist2 = new Dlist(2);
		Dlist dlist3 = new Dlist(3);
		Dlist dlist4 = new Dlist(4);
		Dlist dlist5 = new Dlist(5);
		Dlist dlist6 = new Dlist(3);
//		mydlist.InitDlist(dlist1);
//		mydlist.showMyDlist(mydlist);
		mydlist.addMyDlist(mydlist, dlist1);
		mydlist.addMyDlist(mydlist, dlist2);
		mydlist.addMyDlist(mydlist, dlist3);
		mydlist.addMyDlist(mydlist, dlist4);
		mydlist.addMyDlist(mydlist, dlist5);
		mydlist.showMyDlist(mydlist);
		mydlist.remove(mydlist, dlist6);
		mydlist.showMyDlist(mydlist);

	}

}
