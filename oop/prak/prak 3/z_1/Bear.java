public class Bear extends Animal1 implements Carnivore, Herbivore {
    // konstruktor
    public Bear(){
        super(125, "MOUNTAIN");
    }    

    public Bear(int rawPower){
        super(rawPower, "MOUNTAIN");
    }

    public void speak(){
        System.out.println("I'm a Good Bear");
    }

    public void eatMeat(){
        System.out.println("I'm eating a meat");
    }

    public void hunt(Animal1 animal){
        if (this.getRawPower() > animal.getRawPower()){
            this.eatMeat();
        }

        // alt 2 klo pake interface
        // if (this.isStrongerThan(animal)){
        //     this.eatMeat();
        // }
    }

    public void eatPlant(){
        System.out.println("I'm eating a plant");
    }
}
