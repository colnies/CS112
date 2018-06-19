
public class LinkedList {
	Node head;
	int length;
		public LinkedList(){
			head=null;
			length=0;
		}
		public String toString(){
			String rv="";
			for(Node tmp=head;tmp!=null;tmp=tmp.next){
				return rv+=tmp.data +"-->";
			}
			return "";
		}
		public static void main(String[]args){
			
		}
}
