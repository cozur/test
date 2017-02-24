package test;

public class ListDemo {
	List headNode=null;//头结点
//	List tailNode=null;//尾结点
	//初始化结点
	public void Init(List list)
	{
		headNode = list;
		list.next = null;
	}
	//显示结点
	public void show(ListDemo mylist)
	{
		for(List tmp=mylist.headNode;tmp!=null;tmp=tmp.next)
		{
			System.out.print(tmp.data+"  ");
		}
		System.out.println();
	}
	//添加结点
	public void add(List list)
	{
		if(headNode ==null)
		{
			Init(list);
		}
		else
		{
			List tmp = headNode;
			headNode = list;
			list.next = tmp;
		}
	}
	//删除结点
	public void delete(ListDemo mylist,List list)
	{
		List tmp;
		int count=0;
		if(mylist==null)
		{
			System.out.println("删除失败，这是一个空链表！");
			return;
		}
		if(mylist.headNode.getData()==list.getData())
		{
			mylist.headNode=mylist.headNode.next;
			System.out.println("删除成功！");
			return;
		}
		for(tmp=mylist.headNode;tmp!=null;tmp=tmp.next)
		{
		  if(tmp.next!=null&&tmp.next.getData()==list.getData())
			{
			  count++;
			  if(tmp.next.next!=null)
					tmp.next = tmp.next.next;
			  else
				    tmp.next=null;
			}
		}
		if(count==0)
			System.out.println("删除失败！找不到该元素！");
		else
			System.out.println("删除成功！");

	}
	
	//查询是否存在某个结点
	public boolean find(ListDemo mylist ,List list)
	{
		List tmp;
		boolean flag=false;
		if(mylist==null)
		{
			flag=false;
		}
		else
		{
		     for(tmp=mylist.headNode;tmp!=null;tmp=tmp.next)
		        {
			      if(tmp.getData()==list.getData())
				     flag=true;
		        }
		 }
		if(flag)
			System.out.println("已经查找到！");
		else
			System.out.println("没有查找到！");
		return flag;
	}
	//修改结点
	public void change(ListDemo mylist, List list,int changeData)
	{
		List tmp;
		boolean flag =false;
		if(mylist==null)
		{
			System.out.println("修改失败，这是一个空表！");
			return;
		}
		else
		{
		     for(tmp=mylist.headNode;tmp!=null;tmp=tmp.next)
		        {
			      if(tmp.getData()==list.getData())
			      {
			    	  tmp.setData(changeData);
			    	  flag=true;
			      }
		        }
		 }
		if(flag)
			System.out.println("修改成功！");
		else
			System.out.println("修改失败！找不到该结点！");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListDemo mylist = new ListDemo();
		List list1 = new List(3);
		List list2 = new List(2);
		List list3 = new List(3);
		List list4 = new List(4);
		List list5 = new List(3);
		mylist.Init(list1);
//		mylist.show(mylist);
		mylist.add(list2);
		mylist.add(list3);
		mylist.add(list4);
		mylist.show(mylist);
		mylist.delete(mylist, list5);
		mylist.show(mylist);
		mylist.find(mylist,list5);
		mylist.change(mylist,list5, 6);
		mylist.show(mylist);
 
	}

}
