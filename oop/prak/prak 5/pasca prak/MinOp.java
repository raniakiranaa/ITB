//import java.util.ArrayList;

public class MinOp {
    // dikasi arrNum (array of int)
    // cari min number of operations dari array yang isinya 0 semua biar bisa dapet arrNum
    // operasi yang bisa dilakukan:
    // tambah salah satu elemen dengan 1
    // kali semua elemen dengan 2

    private boolean divide(Number[] arrNum){
        for (int i = 0; i < arrNum.length; i++){
            if (arrNum[i].intValue() % 2 == 1){
                return false;
            }
        }
        return true;
    } 

    private boolean checkzero(Number[] arrNum){
        for (int i = 0; i < arrNum.length; i++){
            if (arrNum[i].intValue() != 0){
                return false;
            }
        }
        return true;
    }


    public int minimumOperationsNeeded(Number[] arrNum) {
        // mengembalikan operasi minimum untuk mencapai array yang diinginkan
        int op = 0;
        while (!checkzero(arrNum)){
            if (divide(arrNum)){
                for (int i = 0; i < arrNum.length; i++){
                    arrNum[i] = arrNum[i].intValue()/2;
                }
                op++;
            } else {
                for (int i = 0; i < arrNum.length; i++){
                    if (arrNum[i].intValue() % 2 == 1){
                        arrNum[i] = arrNum[i].intValue()-1;
                        op++;
                    }
                }
            }
        }
        return op;
    }
}
