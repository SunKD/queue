/**
 * Created by Sun Davey on 4/16/2017.
 */

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
public class queue {

        Node head;
        Node tail;
        int size = 0;

        public queue(){
            head = null;
            tail = null;
        }

    public boolean empty(){
        if(tail == null)
            return true;
        return false;
    }

    public int size(){
        return size;
    }

    public int dequeue(){
        int temp = head.data;
        head = head.next;
        size--;
        return temp;

    }

    public void queue(int n){
        Node node = new Node(n, tail);
        size++;
        if(size() == 1)
            head = node;
        tail = node;
    }
}


