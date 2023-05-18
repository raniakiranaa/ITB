

public class MyNumber implements Displayable {
    private int n;

    public MyNumber(int n){
        this.n = n;
    }

    public void display(){
        System.out.println("Inside MyNumber::display() method.");
        System.out.println(n);
    }
}
