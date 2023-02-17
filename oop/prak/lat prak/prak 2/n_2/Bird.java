public class Bird extends Animal {
    // Melakukan assign numberOfLegs = 2 dan posisi pada x = 0, y = 0
    public Bird(){
        super(2,0,0);
    }

    // Melakukan assign numberOfLegs = 2 dan posisi pada x, y
    // Jika posisi tidak valid (y<0), nilai y posisi dipindahkan ke nilai y terdekat yang valid.
    public Bird(int x, int y){
        super(2, x, y);
        if (y<0){
            super.setPosition(x, 0);
        }
    }

    // Mencetak suara burung, "tweet..tweet.."
    public void makeSound(){
        System.out.println("tweet..tweet..");
    }

    // Terbang sejauh nilai x dan y
    // Jika y tidak valid (y<0), nilai y dirubah ke nilai y terdekat yang valid.
    public void move(int x, int y){
        super.movePosition(x, y);
        if (super.getPosition().getY() < 0){
            super.setPosition(super.getPosition().getX(), 0);
        }
    }

    // Melakukan pencetakan dengan format 
    // "Hewan ini berkaki 2 dan Hewan ini adalah burung"
    // "Posisi: x, y"
    public void print(){
        System.out.println("Hewan ini berkaki 2 dan Hewan ini adalah burung");
        System.out.println("Posisi: " + position.getX() + ", " + super.getPosition().getY());
    }
}