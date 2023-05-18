

// buatlah sebuah kelas generik bernama Stack
// kelas ini mempunyai sebuah type parameter bernama T, T hanya boleh diisi oleh kelas yang mengimplementasikan interface Displayable
// elemen stack disimpan dalam sebuah array of T dengan nama data. array ini disuplai oleh pengguna melalui parameter pada konstruktor
// stack punya atribut top bertipe int yg menyatakan top Stack (top = 0 bila stack kosong)
// stack mempunyai metode push dengan sebuah parameter bertipe T
// dan method pop yang menghasilkan sebuah T
// kedua method tersebut bisa menghasilkan exception StackOverflowException bila stack overflow
// atau StackEmptyException bila Stack kosong
// Stack juga mempunyai method displayTop yang memanggil method display dari elemen pertama Stack (jg akan menghasilkan exception bila stack kosong)

// [1,2,3,null,null]
// asumsi: Stack gada null ditengah -> [1, null, 2, null, null] gabakal terjadi


public class Stack<T extends Displayable> {
    private T[] data;
    private int top = 0;

    public Stack(T[] data){
        this.data = data;
        for (int i = 0; i < data.length; i++){
            if (data[i] != null){
                top++;
            }
        }
    }

    public void push(T obj) throws StackOverflowException {
        if (data.length == top){
            throw new StackOverflowException();
        } 

        data[top] = obj;
        top++;
    }

    public T pop() throws StackEmptyException {
        if (top == 0){
            throw new StackEmptyException();
        }

        T val = data[top-1];
        data[top-1] = null;
        top--;
        return val;
    }

    public void displayTop() throws StackEmptyException {
        if(top == 0){
            throw new StackEmptyException();
        }

        T val = data[top-1];
        val.display();
    }

    public void printAll() throws StackEmptyException {
        if (top == 0){
            throw new StackEmptyException();
        }

        for (int i = 0; i < top; i++){
            data[i].display();
        }
    }
}
