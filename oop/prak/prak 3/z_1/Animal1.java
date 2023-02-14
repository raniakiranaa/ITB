public abstract class Animal1 implements HavePower {
    private int rawPower;
    private String habitat; 

    // konstruktor
    public Animal1(int rawPower, String habitat){
        this.rawPower = rawPower;
        this.habitat = habitat;
    }

    public String getHabitat(){
        return this.habitat;
    }

    public int getRawPower(){
        return rawPower;
    }

    public boolean isStrongerThan(HavePower havePower){
        return (this.rawPower > havePower.getRawPower());
    }

    public void fight(Animal1 animal){
        if (this.getRawPower() > animal.getRawPower() && this.getHabitat() == animal.getHabitat()){
            this.rawPower += animal.getRawPower();
        }
    }

    public abstract void speak();
}