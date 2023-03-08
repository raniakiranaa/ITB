import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        input.close();
        System.out.println(num*2);
    }
}