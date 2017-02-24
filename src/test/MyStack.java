package test;


public class MyStack {
	private StackNode head = null;
	int topOfStack = -1;
	//≈–∂œ∑«ø’
	public boolean isEmpty(MyStack mystack)
	{
		if(mystack!=null)
			return true;
		else
			return false;
	}
	//≥ı ºªØ
	public void Init(StackNode headNode)
	{
			head = headNode;
	}
	//œ‘ æ’ª
	public void printStack(MyStack mystack)
	{
		if(mystack!=null)
		{
			for(StackNode tmp = mystack.head;tmp!=null;tmp=tmp.getNext())
				System.out.println(tmp.getData());
		}
		else
		return;
	}
	//—π»Î’ª
	public void push(StackNode node)
	{
		if(head==null)
			Init(node);
		else
		{
			node.setNext(head);
			head =node;
		}
	}
	
	//µØ≥ˆ’ª
	public void pop(MyStack mystack)
	{
		if(mystack==null)
			return;
		else
		{
			if(mystack.head.getNext()==null)
				mystack.head = null;
			else
				head =mystack.head.getNext();
		}
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack st = new MyStack();
		StackNode node1 = new StackNode(1);
		StackNode node2 = new StackNode(2);
		StackNode node3 = new StackNode(3);
		StackNode node4 = new StackNode(4);
		
		st.push(node1);
		st.push(node2);
		st.push(node3);
		st.push(node4);
		st.pop(st);
		st.pop(st);
		st.pop(st);
		st.printStack(st);
		
		

	}

}
