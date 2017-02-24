package test;

public class ArrayDemo {
	//新建表
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
	
	//显示表内容
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
			System.out.println("这是一个空表！");
			return;
		}
	}
	//清空表
	public static void makeEmpty(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =0;
		}
	}
	//删除元素
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
	
	//增加一个元素
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
	//修改一个元素
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
			System.out.println("这是一个空表！无法修改！");
			return;
		}
	}
	//查询一个元素
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
			System.out.println("没有这个元素");
			return false;
		}
		else
		{
			System.out.println(num+"在第"+(tmp+1)+"个元素！");
			return true;
		}
	}
	//排序
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
