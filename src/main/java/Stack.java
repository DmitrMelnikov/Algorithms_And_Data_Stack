public class Stack {
    private Node head;

    public void push(int value) {
        System.out.println("Добавим "+value);
        if (head == null) {
            Node newNode = new Node();
            newNode.value = value;
            newNode.prev = null;
            head = newNode;
        } else {
            Node newNode = new Node();
            newNode.value = value;
            newNode.prev = head;
            head = newNode;
        }

    }

    public void pop() {
        if (head == null) {

        } else {
            System.out.println("Снимем со стека ");
            int value = head.value;
            head = head.prev;
            System.out.println(value);
        }
    }

    public void printme() {
        if (head == null) {
            System.out.print("EMPTY");
        } else {
            Node node = head;
            while (node != null) {
                node.displayNodeData();
                node = node.prev;
            }
        }
        System.out.println();
    }

}
