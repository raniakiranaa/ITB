public class Tiger extends Animal1{
    // konstruktor
    public Tiger(){
        super(100, "LAND");
    }    

    public Tiger(int rawPower){
        super(rawPower, "LAND");
    }

    public void speak(){
        System.out.println("RAWRRRR!!! I'm a Tiger!");
    }
}
