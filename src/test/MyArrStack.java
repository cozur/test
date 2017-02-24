package test;

public class MyArrStack {
	int[] array=null;
	int length=0;
	//初始化
	public void Init(int num)
	{	
		array = new int[1];
		length=1;
		array[length-1] = num;	
	}
	//显示数组
	public void printarr()
	{
			for(int i=0;i<length;i++)
			{
				System.out.print(array[i]+"  ");
			}
	}
	//添加数据
	public void push(int num)
	{
		if(array==null)
			{
			  array = new int[1];
			  length++;
			  array[length-1] = num;	
			}
		else
			{
			  if(array.length>=length)
			  {
				  array[length-1]=num;
			  }
			  else
			  {
				  int[] tmp = new int[array.length*2];
				  for(int i=0;i<length-1;i++)
				  {
					  tmp[i]=array[i];
				  }
				  tmp[length-1]=num;
				  array=tmp;
				  for(int i=0;i<array.length;i++)
				  {
					  System.out.println(array[i]+" ");
				  }
			  }	
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrStack st= new MyArrStack();
		for(int i=0;i<100;i++)
		{
			st.push(i);
		}
		
		st.printarr();

	}

}
