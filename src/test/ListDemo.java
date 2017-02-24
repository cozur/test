package test;

public class ListDemo {
	List headNode=null;//ͷ���
//	List tailNode=null;//β���
	//��ʼ�����
	public void Init(List list)
	{
		headNode = list;
		list.next = null;
	}
	//��ʾ���
	public void show(ListDemo mylist)
	{
		for(List tmp=mylist.headNode;tmp!=null;tmp=tmp.next)
		{
			System.out.print(tmp.data+"  ");
		}
		System.out.println();
	}
	//��ӽ��
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
	//ɾ�����
	public void delete(ListDemo mylist,List list)
	{
		List tmp;
		int count=0;
		if(mylist==null)
		{
			System.out.println("ɾ��ʧ�ܣ�����һ��������");
			return;
		}
		if(mylist.headNode.getData()==list.getData())
		{
			mylist.headNode=mylist.headNode.next;
			System.out.println("ɾ���ɹ���");
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
			System.out.println("ɾ��ʧ�ܣ��Ҳ�����Ԫ�أ�");
		else
			System.out.println("ɾ���ɹ���");

	}
	
	//��ѯ�Ƿ����ĳ�����
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
			System.out.println("�Ѿ����ҵ���");
		else
			System.out.println("û�в��ҵ���");
		return flag;
	}
	//�޸Ľ��
	public void change(ListDemo mylist, List list,int changeData)
	{
		List tmp;
		boolean flag =false;
		if(mylist==null)
		{
			System.out.println("�޸�ʧ�ܣ�����һ���ձ�");
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
			System.out.println("�޸ĳɹ���");
		else
			System.out.println("�޸�ʧ�ܣ��Ҳ����ý�㣡");
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
