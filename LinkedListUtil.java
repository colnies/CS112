
public class LinkedListUtil {

	public static Node addToFront(Node head, int data){
		Node n= new Node(data);
		n.next=head;
		return n;
	}
	public static Node delFromFront(Node head){
		if(head==null)
			return null;
		return head.next;
	}
	public static boolean recSearch(Node head, int target){
		if(head==null)
			return false;
		
		if (head.data==target)
			return true;
		
		return recSearch(head.next, target);
	}
	public static boolean Search(Node head, int target){
		Node tmp =head;
		while(tmp!=null){
			if(tmp.data==target){
				return true;
		}
		tmp=head.next;
		}
		return false;
	}
	public static Node delete(Node head, int target){
		Node tmp=head;
		if(tmp.data==target)
			return head.next;
		
		while(tmp.next!=null){
			if(tmp.next.data==target){
				tmp.next=tmp.next.next;
				return head;
		}
			tmp=tmp.next;
		}
		return head;
	}
}

