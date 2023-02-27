import java.util.ArrayList;
import java.util.List;

public class CarPrinter {
    private List<Car1> carList = new ArrayList<Car1>();
    // Buat atribut testCar di sini
    private Car1 testCar;

    public void addCar(Car1 newCar) {
        // Menambahkan newCar ke dalam carList
        // Hint: Penambahan elemen ke dalam sebuah objek ArrayList dapat menggunakan method
        // add(E element) yang dimiliki objek tersebut
        carList.add(newCar);
    }

    public List<Car1> getCarList() {
        // Mengembalikan carList
        return this.carList;
    }

    public Car1 getTestCar(){
        // Mengembalikan testCar
        return this.testCar;
    }

    public void setTestCar(String carType){
        // Menetapkan atribut testCar berdasarkan parameter carType
        // Apabila carType bernilai "Car", maka testCar menjadi sebuah objek baru dengan kelas Car
        // yang memiliki parameter: numberOfWheels = 4 dan engineCapacity = 5
        // Apabila carType bernilai "Bus", maka testCar menjadi sebuah objek baru dengan kelas Bus
        // yang memiliki parameter: numberOfWheels = 6, engineCapacity = 10, passengerCapacity = 20, dan isUsedForLongTrip = True
        // Apabila carType bernilai "Perari", maka testCar menjadi sebuah objek baru dengan kelas Perari
        // yang memiliki parameter: numberOfWheels = 4 engineCapacity = 20, averageSpeed = 50, dan isInsuranced = False
        
        // Hint: Pengecekan kesamaan antara dua string sebaiknya menggunakan method equals()
        // yang dimiliki kedua Object tersebut. Contoh: "test".equals("test") bernilai True
        if (carType.equals("Car")){
            this.testCar = new Car1(4, 5);
        } else if (carType.equals("Bus")){
            this.testCar = new Bus(6, 10, 20, true);
        } else if (carType.equals("Perari")){
            this.testCar = new Perari(4, 20, 50, false);
        }
    }
    
    public void printCarList() {
        // Melakukan iterasi terhadap isi `carList`, kemudian untuk setiap `car` ia secara berturut-turut akan:
        // 1. Tergantung instance dari car:
		// * Untuk kelas `Car` saja dan bukan _instance_ dari childnya, 
        // maka cetak `"Car: "` lalu cetak output fungsi `sound()` dan `honk()` dengan semua kata dipisah oleh spasi dan diakhiri _new line_
		// * Untuk kelas `Bus`, cetak `"Bus: "`, 
        //  lalu cetak output fungsi  `sound()` dan `honk()`  dengan semua kata dipisah oleh spasi dan diakhiri _new line_
		// * Untuk kelas `Perari`, cetak `"Perari: "`, 
        //  lalu cetak output fungsi  `sound()` dan `honk()`  dengan semua kata dipisah oleh spasi diakhiri _new line_
		// * Contoh untuk kelas Bus, maka output yang benar adalah : `Bus: Cesss Notnot`

		// * *Hint: Pengecekan* _instance_ *sebuah kelas* *dilakukan dengan menggunakan operator `instanceof` (Contoh: "string" instanceof String)*

        // 2. Memanggil metode `printDescription` diakhiri _new line_
        
        // Contoh Output yang Tepat:
        // Untuk elemen dengan kelas `Car`, dengan 10 numberOfWheels dan 20 engine capacity, maka output dari fungsi ini adalah:
        // Car: Ngenggg Din
        // Mobil ini memiliki 10 roda dengan kapasitas mesin 20 cc
        //
        for (Car1 car : this.carList){
            if (car instanceof Bus){
                Bus bus = (Bus) car;
                System.out.println("Bus: " + bus.sound() + " " + bus.honk());
                System.out.println(bus.printDescription());
            } else if (car instanceof Perari){
                Perari perari = (Perari) car;
                System.out.println("Perari: " + perari.sound() + " " + perari.honk());
                System.out.println(perari.printDescription());
            } else {
                System.out.println("Car: " + car.sound() + " " + car.honk());
                System.out.println(car.printDescription());
            }
        }

    }    
}