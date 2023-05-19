/**
 * LinkedList.java
 * [Jelaskan kegunaan class ini]
 * @author 18221168 Rania Sasi Kirana
 */

public class DoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Konstruktor
     * buat Double linked list dengan size = 0 dan head = tail = null
     */
    public DoubleLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }

    /**
     * Cari elemen yang terletak pada posisi position
     * @param position
     * @return elemen pada posisi position jika ada, null jika tidak ada
     */
    public Node<T> getNode(int position) {
        Node<T> pos = this.head;
        for (int i = 0; i < position; i++){
            pos = pos.getNext();
        }
        return pos;
    }

    /**
     * Tambah elemen dengan nilai item dengan menambahkan
     * node sebagai elemen paling belakang
     * @param item
     */
    public void add(T item) {
        Node<T> baru;
        if (size == 0){
            baru = new Node<T>(item);
            this.head = baru;
            this.tail = baru;
        } else if (size == 1){
            baru = new Node<T>(item, this.head, null);
            this.tail = baru;
        } else {
            baru = new Node<T>(item);
            baru.setPrev(this.tail);
            this.tail = baru;
        }
        size++;
    }

    /**
     * Cari nilai elemen pada posisi position
     * @param position
     * @return nilai elemen pada posisi position jika ada, null jika tidak ada
     */
    public T get(int position) {
        Node<T> pos = this.head;
        for (int i = 0; i < position; i++){
            pos = pos.getNext();
        }
        if (pos != null){
            return pos.getValue();
        } else {
            return null;
        }
    }

    /**
     * Ubah nilai elemen pada posisi position menjadi nilai item jika ada
     * @param position
     * @param item
     */
    public void set(int position, T item) {
        Node<T> pos = this.head;
        for (int i = 0; i < position; i++){
            pos = pos.getNext();
        }
        if (pos != null){
            pos.setValue(item);
        } 
    }

    /**
     * Hapus elemen pada posisi position jika ada
     * @param position
     */
    public void remove(int position) {
        if (position == 0){
            if (size == 1){
                this.head = null;
                this.tail = null;
                size--;
            } else {
                this.head = this.head.getPrev();
                this.head.setPrev(null);
            }
        } else if (position == size-1) {
            this.tail = this.tail.getPrev();
            this.tail.setPrev(null);
        } else {
            Node<T> before = new Node();
            Node<T> pos = this.head;
            for (int i = 0; i < position; i++){
                before = pos;
                pos = pos.getNext();
            }
            if (pos != null){
                before.setNext(pos.getNext());
                pos.getNext().setPrev(before);
                size--;
            }
        }
    }

    /**
     * Hapus semua elemen dari Double Linked List
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

    /**
     * Menampilkan keseluruhan isi Double Linked List
     * Format yang dikeluarkan adalah sebagai berikut, misal isi list adalah [1,2,3,4]
     * Maka output yang dihasilkan adalah (dengan enter) :
     * 1 2 3 4
     */
    public void display() {
        Node<T> pos = this.head;
        for (int i = 0; i < size; i++){
            System.out.println(pos.getValue());
            pos = pos.getNext();
        }
    }

    /**
     * Find element position
     * jika terdapat lebih dari 1 elemen dengan nilai yang sama, maka ambil posisi
     * yang ditemukan pertama kali dari head
     * @return posisi dari sebuah item mulai dari head dengan zero indexing
     */
    public Integer find(T item) {
        Node<T> pos = this.head;
        boolean found = false;
        Integer i = new Integer("0");
        while (!found && i < size){
            pos = pos.getNext();
            i++;
        }
        if (found){
            return i;
        } else {
            return -1;
        }
    }
}
