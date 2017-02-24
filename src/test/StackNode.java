package test;

public class StackNode {
	
	private int data;
	private StackNode next;
	
	StackNode()
	{
		this.data=0;
		this.next=null;
	}
	StackNode(int data)
	{
		this.data =data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public StackNode getNext() {
		return next;
	}
	public void setNext(StackNode next) {
		this.next = next;
	}
	

}
