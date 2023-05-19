import java.util.HashMap;
import java.util.Map;

public class PageReplacementLRU {
    private final Integer maxPages;
    // Pair<processID, page>
    private Map<Pair<Integer, Integer>, Node> pages;
    private Node head;
    private Node tail;

    private class Node {
        Pair<Integer, Integer> pageID;
        Integer physicalAddr;
        Node prev;
        Node next;

        public Node(Pair<Integer, Integer> pageID, int physicalAddr) {
            // Please provide your solution in the space below
            this.pageID = pageID;
            this.physicalAddr = physicalAddr;
            prev = null;
            next = null;
        }
    }

    private void addNode(Node node) {
        // Please provide your solution in the space below
        // Tambahkan node di depan head
        if(pages.size() == 0){
            head = node;
            tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
        pages.put(node.pageID, node.physicalAddr);
    }

    private void removeNode(Node node) {
        // Please provide your solution in the space below
        if(pages.size() != 0){
            tail = tail.prev;
            tail.next = null;
            pages.remove(node.pageID, node.physicalAddr);
        }
    }

    private void moveToHead(Node node) {
        // Please provide your solution in the space below
        if (head != node){
            Node pos = head;
            Node loc = pos.prev;
            while(pos != node){
                pos = pos.next;
                loc = loc.next;
            }
            pos.prev = loc;
            loc.next = pos;
            head = node;
        }
    }

    public PageReplacementLRU(Integer maxPages) {
        // Please provide your solution in the space below
        this.maxPages = maxPages;
        pages = new HashMap<>();
        head = null;
        tail = null;
    }

    public int accessPage(Pair<Integer, Integer> pageID) {
        // Please provide your solution in the space below
        // print "page fault!" ketika pageID tidak ditemukan dalam LRU
        // lalu kembalikan -1
        if(pages.contains(pageID)){
            for()
        } else {
            System.out.println("page fault!");
            return -1;
        }
    }

    public void addPage(Pair<Integer, Integer> pageID, int physicalAddr) {
        // Please provide your solution in the space below
    }
}
