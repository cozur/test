package test;

public class MyDlist {
	private Dlist head=null;

	//��ʼ����ͷ
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
			System.out.println("�Ѿ���ʼ������");
		}
	}
	//��ʾ����
	public void showMyDlist(MyDlist mydlist)
	{
		Dlist tmp;
		if(mydlist == null)
		{
			System.out.println("���Ǹ�������");
			return;
		}
		for(tmp=mydlist.head;tmp!=null;tmp=tmp.next)
		{
			System.out.print(tmp.getData()+"  ");
		}
		System.out.println();
	}
	//���Ԫ��
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
	//ɾ��Ԫ��
	public void remove(MyDlist mydlist,Dlist dlist)
	{
		Dlist tmp;
		boolean flag =false;
		if(mydlist==null||mydlist.head==null)
		{
			System.out.println("ɾ��ʧ�ܣ�����һ��������");
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
			System.out.println("ɾ���ɹ���");
		else
			System.out.println("ɾ��ʧ�ܣ�û���ҵ���Ԫ�أ�");
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
