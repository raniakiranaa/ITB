// Soal No. 5
// Buatlah sebuah kelas bernama MainVehicle yang memiliki method
// main yang melakukan instansiasi Drone dan memanggil accelerate/
// decelerate, climb/descend, moveTo, dan cetaklah ke layar
// berapa kali Vehicle diinstansiasi

import java.util.Scanner;

public class MainVehicle{
    public static void main (String[] args){
        // menerima input drone
        Scanner input = new Scanner(System.in);
        float lat = input.nextFloat();
        float lon = input.nextFloat();
        int alt = input.nextInt();
        input.close();

        // instansiasi drone
        GeoLoc geoLoc = new GeoLoc(lat, lon, alt);
        Drone drone = new Drone(geoLoc);
        drone.accelerate();
        drone.descend();
        System.out.println(Vehicle.getNumVehicle());
    }
}
