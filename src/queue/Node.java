package src.queue;

class Node {
    public int value;
    public Node next;

    public Node() {}

    public Node (int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
