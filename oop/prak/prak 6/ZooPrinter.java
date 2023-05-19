import java.lang.System;
import java.util.ArrayList;
import java.util.List;


public class ZooPrinter {
    // Hint 1:
    // List adalah interface Java yang merupakan subinterface dari interface Collection
    // Deklarasi tipe generic List di Java yang sudah tersedia adalah:
    // public interface List<E> extends Collection<E>
    // 
    // Seperti dapat dilihat, List bisa menggunakan variabel tipe (T) generic saat digunakan. Contoh penggunaannya:
    // List<Integer> integerList = ...;   

    // Hint 2:
    // Iterasi melalui seluruh elemen list dapat digunakan dengan loop for-each, yang di Java bisa dilakukan dengan sintaks:
    // for (E element : elementList){
        //operasi pada elementList
    // }
    
    // Method bernama printListOfAnimal yang menerima list berisi animal dan mencetak atribut name
    // Method bernama printListOfElang yang menerima list Elang dan mencetak atribut telur
    // Method bernama printClassNameOfList yang menerima list berisi objek dan mencetak nama kelas dari setiap elemen
    // Method bernama printObjectClassName yang menerima objek generic dan mencetak ke layar nama kelas dari objek tersebut

    public static void printListOfAnimal(List<Animal> animals){
        for (Animal animal : animals){
            System.out.println(animal.getName());
        }
    }

    public static void printListOfElang(List<Elang> elangList) {
        for (Elang elang : elangList) {
            System.out.println(elang.getTelur());
        }
    }

    public static void printClassNameOfList(List<?> objectList) {
        for (Object object : objectList) {
            System.out.println(object.getClass().getSimpleName());
        }
    }

    public static void printObjectClassName(Object object) {
        System.out.println(object.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Gajah("Jumbo"));
        animalList.add(new ElangJawa("Garuda", 3));

        List<Elang> elangList = new ArrayList<>();
        elangList.add(new Elang("Elang Laut", 2));
        elangList.add(new ElangJawa("Elang Jawa", 4));

        List<Object> mixedList = new ArrayList<>();
        mixedList.add(new Gajah("Bulky"));
        mixedList.add(new Elang("Eagle", 1));
        mixedList.add(new ElangJawa("Java Eagle", 2));
        mixedList.add("This is a string");

        ZooPrinter.printListOfAnimal(animalList);
        System.out.println();

        ZooPrinter.printListOfElang(elangList);
        System.out.println();

        ZooPrinter.printClassNameOfList(mixedList);
        System.out.println();

        ZooPrinter.printObjectClassName(new Gajah("Mammoth"));
    }

}

class Animal {
    private String name;
  
    public Animal(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

class Elang extends Animal{
    private int telur;
    public Elang(String name, int jumlahTelur){
        super(name);
        this.telur = jumlahTelur;
    }

    public int getTelur(){
        return this.telur;
    }
}

class ElangJawa extends Elang{
    public ElangJawa(String name, int jumlahTelur){
        super(name,jumlahTelur);
    }
}

class Gajah extends Animal{
    public Gajah(String name){
        super(name);
    }
}