public class MyLinkedList<T> {
    Node<T> head = null;

    public void AddFront(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    @Override
    public String toString() {
        Node<T> currentNode = head;
        String returnString = "";

        while (currentNode != null) {
            returnString += currentNode.data.toString();
            currentNode = currentNode.next;
        }
        
        return returnString;
    }
}