import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        if(str1.isEmpty() || str2.isEmpty()){
            System.out.println(result);
        } else {
            String[] arr1 = str1.split(" ");
            String[] arr2 = str2.split(" ");

            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr2.length; j++){
                    if (arr1[i].equals(arr2[j])){
                        result.add(arr1[i]);
                    }
                }
            }
            
            Set<String> set = new HashSet<>(result);
            System.out.println(set);
        }
    }
}