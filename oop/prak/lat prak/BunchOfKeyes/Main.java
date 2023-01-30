public class Main {
    public static void main (String[] args){
        Keys keys = new Keys();
        System.out.println("Kunci 0");
        keys.shake();
        keys.printInfo();

        Keys keys2 = new Keys();
        System.out.println("Nambah");
        keys2.shake();
        keys2.printInfo();

        // System.out.println("Kunci 1");
        // keys.add();
        // keys.shake();
        // keys.printInfo();

        // System.out.println("Kunci 2");
        // keys.add();
        // keys.shake();
        // keys.printInfo();
    }
}