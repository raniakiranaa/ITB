/**
 * LinkedList.java
 * Menyimpan deretan elemen dalam sebuah list
 * @author
 */

 public class LinkedList<T> {
    private Node1<T> head;
    private Node1<T> tail;
    private int size;

    /**
     * Konstruktor
     * buat linked list dengan size = 0 dan head = tail = null
     */
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    /**
     * Cari elemen yang terletak pada posisi position
     * @param position
     * @return elemen pada posisi position jika ada, null jika tidak ada
     */
    public Node1<T> getNode1(int position) {
        int i = 0;
        Node1<T> loc = this.head;
        while (loc != null && i < position){
            loc = loc.getNext();
            i++;
        }
        return loc;
    }

    /**
     * Tambah elemen dengan nilai item dengan menambahkan
     * Node1 sebagai elemen paling belakang
     * @param item
     */
    public void add(T item) {
        Node1<T> Node1 = new Node1<T>(item, this.tail, null);
        if (this.size == 0){
            this.head = Node1;
        } else {
            tail.setNext(Node1);
        }
        this.tail = Node1;
        this.size++;
    }

    /**
     * Cari nilai elemen pada posisi position
     * @param position
     * @return nilai elemen pada posisi position jika ada, null jika tidak ada
     */
    public T get(int position) {
        Node1<T> loc = this.head;
        int i = 0;
        while (loc != null && i < position){
            loc = loc.getNext();
            i++;
        }
        if (loc == null){
            return null;
        } else {
            return loc.getInfo();
        }
    }

    /**
     * Ubah nilai elemen pada posisi position menjadi nilai item jika ada
     * @param position
     * @param item
     */
    public void set(int position, T item) {
        Node1<T> loc = this.head;
        int i = 0;
        while (loc != null && i < position){
            loc = loc.getNext();
            i++;
        }
        if (loc != null){
            loc.setInfo(item);
        }
    }

    /**
     * Hapus elemen pada posisi position jika ada
     * @param position
     */
    // benerin klo ketemu ditengah diawal diakhir
    public void remove(int position) {
        Node1<T> prev = new Node1<T>();
        Node1<T> loc = this.head;
        int i = 0;
        while(loc != null && i < position){
            prev = loc;
            loc = loc.getNext();
            i++;
        }
        if (loc != null){
            prev.setNext(loc.getNext());
            (loc.getNext()).setPrev(prev);
        }
        this.size--;
    }

    /**
     * Hapus semua elemen dari Linked List
     */
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Getter size
     * @return size
     */
    public int getSize() {
        return size;
    }
}