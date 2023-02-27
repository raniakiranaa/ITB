import java.util.ArrayList;
import java.util.List;

public class MotorPrinter {
    private List<Motor1> motorList = new ArrayList<Motor1>();
    // Buat atribut testMotor di sini
    private Motor1 testMotor;


    public void addMotor(Motor1 newMotor) {
        // Menambahkan newMotor ke dalam motorList
        // Hint: Penambahan elemen ke dalam sebuah objek ArrayList dapat menggunakan method
        // add(E element) yang dimiliki objek tersebut
        motorList.add(newMotor);
    }

    public List<Motor1> getMotorList() {
        // Mengembalikan motorList
        return this.motorList;
    }

    public Motor1 getTestMotor(){
        // Mengembalikan testMotor
        return this.testMotor;
    }

    public void setTestMotor(String motorType){
        // Menetapkan atribut testMotor berdasarkan parameter motorType
        // Apabila motorType bernilai "Motor", maka testMotor menjadi sebuah objek baru dengan kelas Motor
        // yang memiliki parameter: numberOfWheels = 2 dan engineCapacity = 3
        // Apabila motorType bernilai "FCX", maka testMotor menjadi sebuah objek baru dengan kelas FCX
        // yang memiliki parameter: numberOfWheels = 2, engineCapacity = 6, luggageCapacity = 10, dan isIdleStoping = True
        // Apabila motorType bernilai "Fespa", maka testMotor menjadi sebuah objek baru dengan kelas Fespa
        // yang memiliki parameter: numberOfWheels = 2, engineCapacity = 2, color = "Red", dan isRoundedFrontLamp = False
        
        // Hint: Pengecekan kesamaan antara dua string sebaiknya menggunakan method equals()
        // yang dimiliki kedua Object tersebut. Contoh: "test".equals("test") bernilai 
        if (motorType.equals("Motor")){
            this.testMotor = new Motor1(2, 3);
        } else if (motorType.equals("FCX")){
            this.testMotor = new FCX(2, 6, 10, true);
        } else if (motorType.equals("Fespa")){
            this.testMotor = new Fespa(2, 2, "Red", false);
        }
    }
    
    public void printMotorList() {
        // Melakukan iterasi terhadap isi `motorList`, kemudian untuk setiap `motor` ia secara berturut-turut akan:
        // 1. Tergantung instance dari motor:
		// * Untuk kelas `Motor` saja dan bukan _instance_ dari childnya, 
        // maka cetak `"Motor: "` lalu cetak output fungsi `sound()` dengan semua kata dipisah oleh spasi dan diakhiri _new line_
		// * Untuk kelas `FCX`, cetak `FCX: "`, 
        //  lalu cetak output fungsi `sound()` dengan semua kata dipisah oleh spasi dan diakhiri _new line_
		// * Untuk kelas `Fespa`, cetak `"Fespa: "`, 
        //  lalu cetak output fungsi `sound()` dengan semua kata dipisah oleh spasi diakhiri _new line_
		// * Contoh untuk kelas FCX, maka output yang benar adalah : `FCX Brmmm`
        // 2. Memanggil metode printDescription dari elemen `motorList` tersebut

        // Contoh Output yang Tepat:
        // Untuk elemen dengan kelas `Motor`, dengan 10 numberOfWheels dan 20 engine capacity, maka output dari fungsi ini adalah:
        // Motor: Ngenggg
        // Motor ini memiliki 10 roda dengan kapasitas mesin 20 cc
        
		// * *Hint: Pengecekan* _instance_ *sebuah kelas* *dilakukan dengan menggunakan operator `instanceof` (Contoh: "string" instanceof String)*
        for (Motor1 motor : this.motorList){
            if (motor instanceof FCX){
                FCX fcx = (FCX) motor;
                System.out.println("FCX: " + fcx.sound());
                System.out.println(fcx.printDescription());
            } else if (motor instanceof Fespa){
                Fespa fespa = (Fespa) motor;
                System.out.println("Fespa: " + fespa.sound());
                System.out.println(fespa.printDescription());
            } else {
                System.out.println("Motor: " + motor.sound());
                System.out.println(motor.printDescription());
            }
        }
    }    
}