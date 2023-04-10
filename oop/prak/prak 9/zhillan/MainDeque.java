import java.util.*;

public class MainDeque {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        Deque<Integer> deque = new ArrayDeque<Integer>();
        String opt;
        boolean reverse = false;
        for(int i = 0; i < q; i++){
            opt = input.next();
            int x;
            switch(opt){
                case "addFirst":
                    x = input.nextInt();
                    if(!reverse){
                        deque.addFirst(x);
                    } else {
                        deque.addLast(x);
                    }
                    break;
                case "addLast":
                    x = input.nextInt();
                    if(!reverse){
                        deque.addLast(x);
                    } else {
                        deque.addFirst(x);
                    }
                    break;
                case "pollFirst":
                    if(!reverse){
                        if(deque.size() == 0){
                            System.out.println("EMPTY");
                        } else {
                            System.out.println(deque.pollFirst());
                        }
                    } else {
                        if(deque.size() == 0){
                            System.out.println("EMPTY");
                        } else {
                            System.out.println(deque.pollLast());
                        }
                    }
                    break;
                case "pollLast":
                    if(!reverse){
                        if(deque.size() == 0){
                            System.out.println("EMPTY");
                        } else {
                            System.out.println(deque.pollLast());
                        }
                    } else {
                        if(deque.size() == 0){
                            System.out.println("EMPTY");
                        } else {
                            System.out.println(deque.pollFirst());
                        }
                    }
                    break;
                default:
                    reverse = !reverse;
            }
        }
        input.close();
    }
}
