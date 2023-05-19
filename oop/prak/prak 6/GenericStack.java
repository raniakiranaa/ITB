import java.util.Arrays;

public class GenericStack<T> {

    private T[] elements;

    private int top = 0;

    // zero indexing
    public GenericStack() {
        // inisiasi stack dengan default size 5
        elements = (T[]) new Object[5];
    }

    public GenericStack(int s) {
        int sz = s > 0 ? s : 5;
        elements = (T[]) new Object[sz]; // create elements
    }

    public void push(T value) {
        // cek jika top index lebih dari atau sama dengan elements length - 1, maka panggil fungsi grow
        // assign elements dengan index top dengan nilai pada parameter
        if (top >= elements.length - 1) {
            grow();
        }
        elements[top++] = value;
    }

    public T pop() {
        // apabila top <= 0 maka kembalikan null, jika tidak assign element teratas dengan null
        // cek apabila indeks top lebih kecil dari ukuran shrink (50% dari ukuran maksimal elements) jika ya, maka panggil fungsi shrink
        // kembalikan nilai elemen yang sebelumnya akan diassign dengan null
        // misal terdapat stack
        // | 3 |
        // | 2 |
        // | 1 |
        // maka setelah di pop akan menjadi
        // | 2 |
        // | 1 |
        // lalu kembalikan nilai 3
        if (top <= 0) {
            return null;
        }
    
        T value = elements[--top];
        elements[top] = null;
    
        if (top < elements.length / 2) {
            shrink();
        }
    
        return value;
    }

    public T peek() {
        // cek apabila top <= 0, jika iya maka kembalikan null
        // kembalikan elements dengan index top - 1
        if (top <= 0) {
            return null;
        }
        return elements[top - 1];
    }

    private void grow() {
        // perbesar ukuran sekarang menjadi 2 kali lipat dari ukuran sebelumnya, anda dapat menggunakan
        // fungsi copyOf dari java.util.Arrays
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    private void shrink() {
        // perkecil ukuran sekarang menjadi 1/2 kali lipat dari ukuran sebelumnya, anda dapat menggunakan
        // fungsi copyOf dari java.util.Arrays
        elements = Arrays.copyOf(elements, elements.length / 2);
    }

    public boolean contains(T value) {
        // cek apabila terdapat nilai pada parameter yang sama dengan element" pada stack
        // jika ada, maka return true, jika tidak maka return false
        for (int i = 0; i < top; i++) {
            if (elements[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public int getTop() {
        // kembalikan nilai top
        return top;
    }

    public void remove(int index) {
        if (index != --top) {
            // Shift the elements down one spot
            System.arraycopy(elements, index + 1, elements, index, top - index);
        }
        elements[top] = null;

        int shrinkSize = elements.length >> 1;
        if (top < shrinkSize) shrink();
    }

    public void clear() {
        // assign semua elemen pada stack menjadi null dimulai dari top, anda dapat menggunakan fungsi remove
        // lalu pindahkan top ke 0
        for (int i = top - 1; i >= 0; i--) {
            remove(i);
        }
    }

    public String toString() {
        // kembalikan sebuah string yang terdiri atas keseluruhan isi elements, dimulai dari yang teratas,
        // jika element tersebut belum diassign, maka tulis dengan null
        // format kembalian adalah "null, null, 1, 1, 1" tanpa kutip
        // misal:
        // inisiasi stack size 5
        // stack.push(1)
        // stack.push(2)
        // stack.push(3)
        // maka string yang dihasilkan adalah "null, null, 3, 2, 1"
        String ret = "";
        for (int i = 0; i < elements.length; i++) {
            if (i == elements.length - 1) {
                ret += elements[i];
            } else {
                ret += elements[i] + ", ";
            }
        }
        return ret;
    }

    public static void main(String[] args){
        GenericStack<Integer> stack = new GenericStack<>();
        // push values to stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // print stack
        System.out.println("Stack: " + stack);

        // pop values from stack
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());

        // print stack
        System.out.println("Stack: " + stack);

        // check if stack contains value
        System.out.println("Stack contains 3: " + stack.contains(3));

        // clear stack
        stack.clear();

        // print stack
        System.out.println("Stack: " + stack);
    }
}