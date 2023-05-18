
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        MyNumber[] data = new MyNumber[4]; // [1, 2, 3, null, null];
        // data[0] = new MyNumber(1);
        // data[1] = new MyNumber(2);
        // data[2] = new MyNumber(3);
        // data[3] = new MyNumber(4);

        Stack<MyNumber> stack = new Stack<>(data);
        // try {
        //     stack.push(new MyNumber(4));
        // } catch (StackOverflowException e){
        //     System.out.println(e.getMessage());
        // }

        try {
            stack.printAll();
        } catch (StackEmptyException e){
            System.out.println(e.getMessage());
        }

        try {
            MyNumber top = stack.pop();
            System.out.println("top ");
            top.display();
        } catch (StackEmptyException e){
            System.out.println(e.getMessage());
        }

        try {
            stack.printAll();
        } catch (StackEmptyException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("display top");
            stack.displayTop();
        } catch (StackEmptyException e){
            System.out.println(e.getMessage());
        }

    }
}
