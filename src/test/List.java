package test;

public class List {
	int data;
	List next;

	List(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public List getNext() {
		return next;
	}

	public void setNext(List next) {
		this.next = next;
	}
	

}
