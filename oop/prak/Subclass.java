public class Subclass extends Superclass {
    public void cobaa(){
        System.out.println("nyee");
    }

    // overrides printMethod in Superclass
    public void printMethod() {
    super.printMethod();
    System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) {
    Superclass s = new Subclass();
    //gabisa
    // s.cobaa();
    s.printMethod();
    }
}