package LinkedList.Singly;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SLL {
    Node head;

    SLL(){
        head = null;
    }

    void insertAtHead(int val){
        Node n = new Node(val); // step1 create node
        n.next = head;
        head = n;
    }

    void insertAtTail(int val){
        Node n = new Node(val);
        if(head==null){
            head = n;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }

    int getSize(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    void insertAtPos(int val, int pos){
        Node n = new Node(val);
        int size = getSize();
        if(pos < 0 || pos > size){
            System.out.println("Invalid Position Entered!");
        }else if (pos == 0){
            n.next = head;
            head = n;
        }else{
            Node temp = head;
            while(--pos > 0){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("Nothing to Delete!");
            return;
        }
        Node toDelete = head;
        head = head.next;
        toDelete = null; // This Calls the Garbage Collection on toDelete
    }

    void displayLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class DriverCode{
    public static void main(String[] args) {
        SLL ll = new SLL();
        ll.insertAtHead(10);
        ll.insertAtHead(20);
        ll.insertAtHead(30);
        ll.displayLL();
        ll.insertAtTail(50);
        ll.displayLL();
        ll.insertAtPos(100, -1000);
        ll.displayLL();
    }
}
