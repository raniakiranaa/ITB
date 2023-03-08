public class MainMinOp {
    public static void main(String[] args){
        Number[] arr = {1,2};
        MinOp minop = new MinOp();
        int op = minop.minimumOperationsNeeded(arr);
        System.out.println(op);
    }
}
