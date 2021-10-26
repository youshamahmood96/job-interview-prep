class Node {
    public int val;
    public Node next;
}
public class LinkedList {
    public Node head;
    public Node tail;
    public int size;
    public Node create(int nodeVal){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.val = nodeVal;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public void push(int nodeVal){
        if(this.head==null){
            this.create(nodeVal);
        }
        else{
            Node newNode = new Node();
            newNode.val = nodeVal;
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }
    public void insert(int nodeVal,int location){
       Node newNode = new Node();
       newNode.val = nodeVal;
       if(this.head == null){
           this.create(nodeVal);
           return;
       }
       else if(location == 0){
           newNode.next = this.head;
           this.head = newNode;
       }
       else if(location == size){
           newNode.next = null;
           this.tail.next = newNode;
           this.tail = newNode;
       }
       else{
           int index = 0;
           Node current = this.head;
           while(index<=location){
               current = current.next;
              index++;
           }
           Node temp = current.next;
           temp.next = newNode;
           newNode.next = temp;
       }
       this.size++;
    }
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.create(5);
        ls.insert(6,1);
        System.out.println(ls.head.next.val);
    }
}
