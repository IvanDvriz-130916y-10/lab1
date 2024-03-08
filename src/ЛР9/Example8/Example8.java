package ��9.Example8;

public class Example8 {
    public static void main(String[] args) {
        Node LinkedList = new Node();

        LinkedList.createHead(new int[]{0,1,2});
        System.out.println(LinkedList.toString());

        LinkedList.createTail(new int[]{3,2,1});
        System.out.println(LinkedList.toString());

        LinkedList.AddFirst(-1);
        System.out.println(LinkedList.toString());

        LinkedList.AddLast(17);
        System.out.println(LinkedList.toString());

        LinkedList.Insert(100,3);
        System.out.println(LinkedList.toString());

        LinkedList.RemoveFirst();
        System.out.println(LinkedList.toString());

        LinkedList.RemoveLast();
        System.out.println(LinkedList.toString());

        LinkedList.Remove(2);
        System.out.println(LinkedList.toString());

        LinkedList.createHeadRec(5);
        System.out.println(LinkedList.toStringRec(LinkedList.head));

        LinkedList.createTailRec(4);
        System.out.println(LinkedList.toStringRec(LinkedList.head));
    }
}
class Node {
    protected int value;
    protected Node next;
    protected Node head;

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    Node() {
    }

    protected void createHead(int[] values) { //� ���� � ������ createHead();
        Node head = new Node(values[0], null);
        Node tail = head;
        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i], null);
            tail = tail.next;
        }
        this.head = head;
        System.out.println("������������ ������������ ������ c ������:");
    }

    protected void createTail(int[] values) {//� ���� � ������ createTail();
        Node head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
        }
        this.head = head;
        System.out.println("������������ ������������ ������ c ������:");
    }

    /*protected void printNodeLinkedList(Node head) {
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println("\n");
    }*/

    public String toString() {// ����� (������������ ������, �������������� �� ��������� ������) toString();
        Node ref = head;
        System.out.println("������ ������������ ������:");
        String toString = "";
        while (ref != null) {
            toString += " " + ref.value;
            ref = ref.next;
        }
        return toString;
    }

    protected void AddFirst(int head) {//���������� �������� � ������ ������ AddFirst();
        this.head = new Node(head, this.head);
        System.out.println("���������� �������� � ������ ������:");
    }

    protected void AddLast(int tail) {//���������� �������� � ����� ������ AddLast();
        Node newTail = new Node(tail, null);
        Node ref = this.head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
        System.out.println("���������� �������� � ����� ������:");
    }

    protected void Insert(int middle, int queue) {//� ������� �������� � ������ � ��������� ������� Insert();
        Node newNode = new Node(middle, null);
        Node ref = this.head;
        int k = 1;
        while (ref.next != null && (k < queue)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
        System.out.println("���������� �������� �� � " + queue + " ������:");
    }

    protected void RemoveFirst() {//� �������� �������� � ������ ������ RemoveFirst();
        this.head = this.head.next;
        System.out.println("�������� �������� � ������ ������:");
    }

    protected void RemoveLast() {// � �������� ���������� �������� ������ RemoveLast();
        Node ref = this.head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
        System.out.println("�������� �������� � ������ ������:");
    }

    protected void Remove(int queue) {//� �������� �� ������ �������� � ��������� ������� Remove();
        Node ref = this.head;
        int k = 1;
        while (ref.next != null && (k < queue)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
        System.out.println("�������� �������� ��� � " + queue + " ������:");
    }

    //� �������������� ��������:
    Node createHeadRec(int value) { // � ���� � ������ createHeadRec();
        if (value == 0) {
            System.out.println("������������ ������������ ������ � ������ ��� ������ ��������:");
            return null;
        }
        return this.head = new Node(value, createHeadRec(value-1));
    }
    int createTailRec(int value){ // � ���� � ������ createTailRec();
        if (value ==0) {
            System.out.println("������������ ������������ ������ � ������ ��� ������ ��������:");
            Node head = null;
            this.head = null;
            return 0;
        }
        head = new Node(createTailRec(value - 1), head);
        return value;
    }

    public String toStringRec(Node head) {// ����� (������������ ������, �������������� �� ��������� ������) toString();
        if (head == null) {
            return " ������ ������������ ������ ��� ������ ��������:";
        }
        return head.getValue()+" "+toStringRec(head.getNext());
    }

}

