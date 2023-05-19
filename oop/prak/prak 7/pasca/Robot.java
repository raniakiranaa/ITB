/**
 * Jangan lupa tambahkan kata kunci untuk menghandle exception
 */ 
import java.lang.Exception;

public class Robot extends Exception {
    private int x;
    private int y;

    public Robot() {
        // konstruktor
        x = 0;
        y = 0;
    }

    public void walk(int x, int y) throws IllegalArgumentException {
        /**
         * Implementasi
         * Apabila hasil penambahan x atau y melebihi 10, dilempar sebuah exception
         * dengan pesan "Tidak bisa jalan". Atribut tidak ditambahkan pada kasus ini.
         * 
         * Apabila input valid, tambahkan nilai atribut dan print pesan
         * "Sedang berjalan menuju (x, y)"
         */ 
        if (this.x + x <= 10 && this.y + y <= 10){
            this.x += x;
            this.y += y;
            System.out.println("Sedang berjalan menuju (" + this.x + ", " + this.y + ")");
        } else {
            throw new IllegalArgumentException("Tidak bisa jalan");
        }
    }

    public void talk(String language) throws IllegalArgumentException {
        /**
         * Implementasi
         * Apabila input bukan "Indonesia" atau "Inggris", lempar exception dengan pesan
         * "Tidak bisa berbicara dalam bahasa {language}"
         * 
         * Apabila input valid, print pesan "Sedang berbicara dalam bahasa {language}"
         */ 
        if (language.equals("Indonesia") || language.equals(("Inggris"))){
            System.out.println("Sedang berbicara dalam bahasa " + language);
        } else {
            throw new IllegalArgumentException("Tidak bisa berbicara dalam bahasa " + language);
        }
    }

    public void receiveCommand(String command) throws IllegalArgumentException {
        /**
         * Implementasi
         * Apabila input bukan "walk" atau "talk", lempar exception "Perintah {command} tidak dikenal"
         */ 
        if (!command.equals("walk") && !command.equals("talk")){
            throw new IllegalArgumentException("Perintah " + command + " tidak dikenal");
        }
    }

    // getter
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    // public static void main(String[] args){
    //     Robot robot = new Robot();
    //     System.out.println(robot.getX());
    //     System.out.println(robot.getY());
    //     try {
    //         robot.walk(10,10);
    //         // robot.talk("Belanda");
    //         robot.receiveCommand("walkie");
    //     } catch (IllegalArgumentException e){
    //         System.out.println(e.getMessage());
    //     }
    //     System.out.println(robot.getX());
    //     System.out.println(robot.getY());
    //     // robot.talk("Indonesia");
    // }
}