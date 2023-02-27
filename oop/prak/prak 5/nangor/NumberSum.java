import java.lang.Number;

public class NumberSum {
    public Number[] numberSum(Number[] numArr) {
        int len = numArr.length;
        Number[] sumArr = new Number[len];
        int byte_idx = -1;
        int int_idx = -1;
        int double_idx = -1;
        int float_idx = -1;
        int short_idx = -1;
        int long_idx = -1;
        int i = 0;
        for (Number num : numArr) {
            if (num instanceof Byte){
                if (byte_idx == -1){
                    sumArr[i] = num;
                    byte_idx = i;
                } else {
                    sumArr[byte_idx] = (Byte) sumArr[byte_idx] + (Byte) num;
                }
            } else if (num instanceof Integer){
                if (int_idx == -1){
                    sumArr[i] = num;
                    int_idx = i;
                } else {
                    sumArr[int_idx] = (Integer) sumArr[int_idx] + (Integer) num;
                }
            } else if (num instanceof Double){
                if (double_idx == -1){
                    sumArr[i] = num;
                    double_idx = i;
                } else {
                    sumArr[double_idx] = (Double) sumArr[double_idx] + (Double) num;
                }
            } else if (num instanceof Float){
                if (float_idx == -1){
                    sumArr[i] = num;
                    float_idx = i;
                } else {
                    sumArr[float_idx] = (Float) sumArr[float_idx] + (Float) num;
                }
            } else if (num instanceof Short){
                if (short_idx == -1){
                    sumArr[i] = num;
                    short_idx = i;
                } else {
                    sumArr[short_idx] = (Short) sumArr[short_idx] + (Short) num;
                }
            } else if (num instanceof Long){
                if (long_idx == -1){
                    sumArr[i] = num;
                    long_idx = i;
                } else {
                    sumArr[long_idx] = (Long) sumArr[long_idx] + (Long) num;
                }
            }
            i++;
        }

        // cek null values
        for (int j = 0; j < sumArr.length; j++){
            if (sumArr[j] == null){
                for (int k = j; k < sumArr.length-1; k++){
                    sumArr[k] = sumArr[k+1]; 
                }
            }
        }

        return sumArr;
    }

    public static void main(String[] args) {
        Number[] numArr = {2L, 4.5f, 3.5, 45L, (short) 100, (byte) 5, (byte)2};
        NumberSum ns = new NumberSum();
        Number[] answer = ns.numberSum(numArr);
        for (Number num : answer) {
            System.out.println(num);
        }
    }
}

