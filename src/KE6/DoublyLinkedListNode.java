package KE6;

public class DoublyLinkedListNode {
    private String entry;
    private DoublyLinkedListNode next;
    private DoublyLinkedListNode prev;

    public DoublyLinkedListNode(String entry, DoublyLinkedListNode prev) {
        this.entry = entry;
        this.next = null;
        this.prev = prev;
    }

    public String getEntry() {
        return entry;
    }

    public DoublyLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode next) {
        this.next = next;
    }
}

 class DoublyLinkedList {
    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;

     public DoublyLinkedList() {
         this.head = null;
         this.tail = null;
     }

     public void enqueue(String value) { // add element
         DoublyLinkedListNode node = new DoublyLinkedListNode(value, this.tail);
         if (this.tail != null) {
             this.tail.setNext(node);
         }
         this.tail = node;
         if (this.head == null) {
             this.head = node;
         }
     }

     public String dequeue() { // remove element
         if(this.head == null) {
             return null;
         }
         String value = this.head.getEntry();
         return value;
     }
 }
