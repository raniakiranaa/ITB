public class Try {
    public static void main(String[] args){
        String[] req = {"computer science", "i love anime", "distributed system", "designing data intensive application"};
        Integer[] integers = new Integer[req.length];
        for (int j = 0; j < req.length; j++){
            int sum = 0;
            String request = req[j];
            for(int i = 0; i < request.length(); i++){
                if(request.charAt(i) == ' '){
                    sum++;
                }

                if(i == request.length()-1){
                    sum++;
                }
            }
            System.out.println(sum);
            integers.add(sum);
        }
        for (int i = 0 ; i < integers.length; i++){
            System.out.println(integers[i]);
        }
    }
}