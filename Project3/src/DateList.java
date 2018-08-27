
public abstract class DateList {
	protected DateNode head;
	protected int length;
	
	public DateList() {
		head = null;
		length = 0;
		
	}
	public DateList(DateNode newNode) {
		this.head = newNode;
		this.length = 1;
	}//DateList- Linked List
	public void append(Date212 d, int length) {
        DateNode temp = new DateNode(d);
        DateNode cursor = head;
//        temp.next = this.head.next;
//        this.head.next = temp;
//        length++;
        
        for(int i=0; i < length - 1; i++) {
        	cursor = cursor.next;
        }
        temp.next = cursor.next;
        cursor.next = temp;
        length++;
        
    } // method append(String)
}
