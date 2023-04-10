import java.util.*;

public class MainList {
    public static void main(String[] args){
        List<Integer> arrList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();
        if (str.isEmpty()){
            System.out.println(str);
            return;
        } else {
            // dibagi per angka
            String[] arr = str.split(" ");
            for (String numString : arr){
                // ubah jd int
                arrList.add(Integer.parseInt(numString));
            }
            // pake set biar gada yg sama
            Set<Integer> inputSet = new HashSet<>(arrList);
            List<Integer> sorted = new ArrayList<>(inputSet);
            Collections.sort(sorted);
            System.out.println(sorted);
        }
    }
}