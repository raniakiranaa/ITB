import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        TreeSet<Integer> TreeSet = new TreeSet<Integer>();
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        for(int i = 0; i < q; i++){
            String str = input.next();
            if (str.equals("add")){
                int x = input.nextInt();
                TreeSet.add(x);
            } else if (str.equals("remove")){
                int x = input.nextInt();
                if (TreeSet.contains(x)){
                    TreeSet.remove(x);
                } else {
                    System.out.println("Element " + x + " is not in The TreeSet");
                }
            } else if (str.equals("first")){
                if (TreeSet.size() == 0){
                    System.out.println("EMPTY");
                } else {
                    System.out.println(TreeSet.first());
                }
            } else if (str.equals("last")){
                if (TreeSet.size() == 0){
                    System.out.println("EMPTY");
                } else {
                    System.out.println(TreeSet.last());
                }
            }
        }


        input.close();
    }
}