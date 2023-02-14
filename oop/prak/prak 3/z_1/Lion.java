public class Lion extends Animal1 {
    // konstruktor
    public Lion(){
        super(150, "LAND");
    }

    public Lion(int rawPower){
        super(rawPower, "LAND");
    }

    public void speak(){
        System.out.println("GRAWRRRR!!! I'm a Lion!");
    }
}
