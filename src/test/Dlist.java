package test;

public class Dlist {
	private int data;
	Dlist pre;
	Dlist next;
	
	Dlist(int data)
	{
		this.data = data;
		this.pre = null;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Dlist getPre() {
		return pre;
	}

	public void setPre(Dlist pre) {
		this.pre = pre;
	}

	public Dlist getNext() {
		return next;
	}

	public void setNext(Dlist next) {
		this.next = next;
	}
	
	

}
