package test;

public class ArrayDemo {
	//�½���
	public static void create(int[] arr)
	{
		if(arr!=null)
		{
		   for(int i=0;i<arr.length;i++)
		    {
			  arr[i]=i;
		    }
		}
		else
		{
			return;
		}
	}
	
	//��ʾ������
	public static void show(int [] arr)
	{
		if(arr!=null)
		{
		   for(int i=0;i<arr.length;i++)
		    {
			   System.out.print(arr[i]+"  ");
		    }
		   System.out.println();
		}
		else
		{
			System.out.println("����һ���ձ�");
			return;
		}
	}
	//��ձ�
	public static void makeEmpty(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =0;
		}
	}
	//ɾ��Ԫ��
	public static int[] deleteArr(int[] arr,int num)
	{
		int[] tmp;
		int count =0;
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				count++;
			}
		}
		if(count==arr.length)
		{
			arr=null;
			return null;
		}
		else
		{
		tmp = new int[arr.length-count];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=num)
			{
				tmp[j]=arr[i];
				j++;
			}
		}
		return tmp;
		}
	}
	
	//����һ��Ԫ��
	public static int[] addArr(int[] arr,int num)
	{
		int[] tmp;
		if(arr!=null)
		{
			tmp = new int[arr.length+1];
			for(int i=0;i<arr.length;i++)
			{
				tmp[i]=arr[i];
			}		   
		   tmp[arr.length]=num;
		   return tmp;
		}
		else
		{
			tmp =new int[1];
			tmp[0]=num;
			return tmp;
		}
	}
	//�޸�һ��Ԫ��
	public static void changeArr(int[] arr,int beChangeNum,int changeNum)
	{
		if(arr!=null)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==beChangeNum)
				{
					arr[i] = changeNum;
				}
			}
		}
		else
		{
			System.out.println("����һ���ձ��޷��޸ģ�");
			return;
		}
	}
	//��ѯһ��Ԫ��
	public static boolean findArr(int [] arr,int num)
	{
		int tmp=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				tmp = i;
			}
		}
		if(tmp==-1)
		{
			System.out.println("û�����Ԫ��");
			return false;
		}
		else
		{
			System.out.println(num+"�ڵ�"+(tmp+1)+"��Ԫ�أ�");
			return true;
		}
	}
	//����
	public static void rand(int[] arr)
	{
		int tmp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	public static void main(String [] args)
	{
		int[] arr = new int[10];
		create(arr);
//		show(arr);
//		makeEmpty(arr);
//		show(arr);
		arr=deleteArr(arr,0);
//		show(arr);
		arr=addArr(arr,0);
//		show(arr);
		rand(arr);
//		show(arr);
		changeArr(arr,8,5);
		show(arr);
		findArr(arr,6);
	}
}
