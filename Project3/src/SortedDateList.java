
public class SortedDateList extends DateList {
DateNode cursor;
	public SortedDateList(){
		super();
	}
	
	public void add(Date212 x){
		int size = 0;
		while(head.next != null) {
			
			if(x.getYear() < head.next.data.getYear() ) {
				append(x,size);
			}
			if(x.getYear() == head.next.data.getYear()) {
				cursor = head;
			}
			if(x.getMonth() < head.next.data.getMonth() ) {
				append(x,size);
			}
			if(x.getMonth() == head.next.data.getMonth()) {
				cursor = head;
			}
			if(x.getDay() < head.next.data.getDay() ) {
				append(x,size);
			}
			if(x.getDay() == head.next.data.getDay()) {
				cursor = head;
			}
			head = head.next;
			size++;
		}
	}//add methods
}
