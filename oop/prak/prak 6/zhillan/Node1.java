public class Node1<T> {
    private T info;
    private Node1<T> next;
    private Node1<T> prev;

    public Node1() {
        info = null;
        next = null;
        prev = null;
    }

    public Node1(T info) {
        this.info = info;
        next = null;
        prev = null;
    }

    public Node1(T info, Node1<T> prev, Node1<T> next) {
        this.info = info;
        this.prev = prev;
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    } 

    public Node1<T> getNext() {
        return next;
    }

    public void setNext(Node1<T> next) {
        this.next = next;
    }

    public Node1<T> getPrev() {
        return prev;
    }

    public void setPrev(Node1<T> prev) {
        this.prev = prev;
    }

    public Node1<T> getFirst() {
        Node1<T> first = this;
        while (first.prev != null){
            first = first.prev;
        }
        return first;
    }

    public Node1<T> getLast() {
        Node1<T> last = this;
        while (last.next != null){
            last = last.next;
        }
        return last;
    }
}