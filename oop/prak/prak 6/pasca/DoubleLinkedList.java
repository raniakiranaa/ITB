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
    public DoubleLinkedList() {
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
        Node<T> pos = head;
        int i = 0;
        while (pos != tail){
            if (i == position){
                return pos;
            }
            pos = pos.getNext();
            i++;
        }
        // check tail
        if (i == position){
            return pos;
        }
        return null;
    }

    /**
     * Tambah elemen dengan nilai item dengan menambahkan
     * node sebagai elemen paling belakang
     * @param item
     */
    public void add(T item) {
        Node<T> baru = new Node<T>(item);
        tail.setNext(baru);
        baru.setPrev(tail);
        tail = baru;
    }

    /**
     * Cari nilai elemen pada posisi position
     * @param position
     * @return nilai elemen pada posisi position jika ada, null jika tidak ada
     */
    public T get(int position) {
        Node<T> pos = head;
        int i = 0;
        while (pos != tail){
            if (i == position){
                return pos.getValue();
            }
            pos = pos.getNext();
            i++;
        }
        // check tail
        if (i == position){
            return pos.getValue();
        }
        return null;
    }

    /**
     * Ubah nilai elemen pada posisi position menjadi nilai item jika ada
     * @param position
     * @param item
     */
    public void set(int position, T item) {
        Node<T> pos = head;
        int i = 0;
        while (pos != tail){
            if (i == position){
                pos.setValue(item);
            }
            pos = pos.getNext();
            i++;
        }
        // check tail
        if (i == position){
            pos.setValue(item);
        }
    }

    /**
     * Hapus elemen pada posisi position jika ada
     * @param position
     */
    public void remove(int position) {
        if (position == 0){
            // head
            head = head.getNext();
            head.setPrev(null);
        } else if (position == size-1){
            // tail
            tail = tail.getPrev();
            tail.setNext(null);
        } else {
            Node<T> pos = head.getNext();
            Node<T> prev = head; 
            int i = 1;
            while (prev != tail){
                if (i == position){
                    prev.setNext(pos.getNext());
                    pos.getNext().setPrev(prev);
                } else {
                    i++;
                    pos = pos.getNext();
                    prev = prev.getNext();
                }
            }
        }
    }

    /**
     * Hapus semua elemen dari Double Linked List
     */
    public void clear() {
        head = null;
        tail = null;
        size = 0;
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
        Node<T> pos = head;
        for(int i = 0; i < size; i++){
            System.out.println(pos.getValue());
            pos = pos.getNext();
        }
    }

    /**
     * Find element position
     * jika terdapat lebih dari 1 elemen dengan nilai yang sama, maka ambil posisi
     * yang ditemukan pertama kali dari head
     * Jika posisi elemen tidak ditemukan maka return -1
     * @return posisi dari sebuah item mulai dari head dengan zero indexing
     */
    public Integer find(T item) {
        Node<T> pos = head;
        for(int i = 0; i < size; i++){
            if (pos.getValue().equals(item)){
                return i;
            }
        }
        return -1;
    }
}