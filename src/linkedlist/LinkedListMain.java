package src.linkedlist;

class LinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        // System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 0);
        sLL.traverseSinglyLinkedList();
        sLL.deleteSLL();
        sLL.traverseSinglyLinkedList();

        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(6, 1);
        csll.insertCSLL(7, 8);
        csll.traverseCSLL();
        csll.deleteCSLL();
        csll.traverseCSLL();

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(1);
        cdll.insertNode(2, 0);
        cdll.insertNode(3, 2);
        cdll.insertNode(4, 5);
        cdll.traverseCDLL();
        cdll.deleteCDLL();
        cdll.traverseCDLL();

    }
}

