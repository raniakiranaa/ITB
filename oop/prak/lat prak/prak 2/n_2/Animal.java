import java.lang.Math;

public class Animal {
    protected int numberOfLegs;
    protected Point position; 
    
    // Membuat Animal dengan jumlah kaki yang berdiri di titik (x, y)
    public Animal(int numberOfLegs, int x, int y){
        this.numberOfLegs = numberOfLegs;
        this.position = new Point(x,y);
    }

    // Mengeluarkan standpoint dari Animal
    public Point getPosition(){
        return this.position;
    }

    // Posisi Animal diassign dengan p
    public void setPosition(Point p){
        this.position = p;
    }

    // Posisi Animal diassign dengan (x, y);
    public void setPosition(int x, int y){
        this.position = new Point(x,y);
    }

    // Posisi Animal berubah sebesar p
    public void movePosition(Point p){
        int xp = p.getX();
        int yp = p.getY();
        int xx = this.position.getX();
        int yy = this.position.getY();
        this.position = new Point(xx + xp, yy + yp);
    }

    // Posisi Animal berubah sebesar (x,y)
    public void movePosition(int x, int y){
        int xx = this.position.getX();
        int yy = this.position.getY();
        this.position = new Point(xx + x, yy + y);
    }

    // Menghitung jarak antara Animal dengan titik (0,0)
    public double distanceFromZero(){
        // (x^2+y^2)**1/2
        return (Math.sqrt(Math.pow(this.position.getX(),2) + Math.pow(this.position.getY(), 2)));
    }

    // Melakukan pencetakan dengan format "Hewan ini berkaki X"
    public void print(){
        System.out.println("Hewan ini berkaki " + this.numberOfLegs);
    }
}