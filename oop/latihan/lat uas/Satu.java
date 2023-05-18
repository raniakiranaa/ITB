// buat custom Exception Class berikut. StackOverflowException atau StackEmptyException
// lakukan langkah seperlunya sehingga pesan kesalahan pada kelas relevan
import java.lang.Exception;

class Satu {

}

class StackOverflowException extends Exception{
    public StackOverflowException(){
        super("Stack overflow!");
    }
}

class StackEmptyException extends Exception {
    public StackEmptyException(){
        super("Stack Empty!");
    }
}