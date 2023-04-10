import java.util.TreeSet;
import java.util.Scanner;

public class MainSet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        TreeSet<Integer> TreeSet = new TreeSet<Integer>();
        for(int i = 0; i < q; i++){
            String opt = input.next();
            if(opt.equals("add")){
                int x = input.nextInt();
                TreeSet.add(x);
            } else if (opt.equals("remove")){
                int x = input.nextInt();
                if(TreeSet.contains(x)){
                    TreeSet.remove(x);
                } else {
                    System.out.println("Element " + x + " is not in The TreeSet");
                }
            } else if (opt.equals("first")){
                if (TreeSet.size() == 0){
                    System.out.println("EMPTY");
                } else {
                    System.out.println(TreeSet.first());
                }
            } else if (opt.equals("last")){
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
