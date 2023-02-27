/**
 * FCX.java
 * Subclass dari Motor.java
 * @author 18221168 Rania Sasi Kirana
 */
public class FCX extends Motor1 {//Jangan lupa tambahkan kata kunci untuk melakukan polymorphism antar kelas
    private int luggageCapacity;
    private Boolean isIdleStoping;

    public FCX(int numberOfWheels,int engineCapacity, int luggageCapacity, Boolean isIdleStoping) {
        //Konstruktor
        //luggageCapacity merupakan kapasitas bagasi dalam satuan liter
        //isIdleStoping merupakan keadaan apakah mesin FCX sedang diseting untuk dapat mati secara otomatis setelah beberapa waktu
        super(numberOfWheels, engineCapacity);
        this.luggageCapacity = luggageCapacity;
        this.isIdleStoping = isIdleStoping;
    }

    public int getLuggageCapacity(){
        //Mengembalikan nilai dari kapasitas bagasi
        return this.luggageCapacity;
    }

    public Boolean getStopingStatus(){
        //Mengembalikan status dari setingan mesin FCX untuk berhenti secara otomatis
        return this.isIdleStoping;
    }    
    public String sound(){
        //Mengembalikan string berisi "Brmmm"
        return "Brmmm";
    }

    public String printDescription(){
        //Mengembalikan string yang berformat dan berkondisi
        //Apabila isIdleStoping true, maka mengembalikan: "Motor ini memiliki a roda dengan kapasitas mesin b cc, memiliki kapasitas bagasi c liter, dan sedang dapat berhenti otomatis apabila didiamkan" dengan a adalah numberOfWheels, b adalah engineCapacity dan c adalah luggageCapacity
        //Apabila isIdleStoping false, maka mengembalikan: "Motor ini memiliki a roda dengan kapasitas mesin b cc, memiliki kapasitas bagasi c liter, dan sedang tidak dapat berhenti otomatis apabila didiamkan" dengan a adalah numberOfWheels, b adalah engineCapacity dan c adalah luggageCapacity
        if (this.isIdleStoping){
            return ("Motor ini memiliki " + this.getNumberOfWheels() + " roda dengan kapasitas mesin " + this.getEngineCapacity() + " cc, memiliki kapasitas bagasi " + this.luggageCapacity + " liter, dan sedang dapat berhenti otomatis apabila didiamkan");
        } else {
            return ("Motor ini memiliki " + this.getNumberOfWheels() + " roda dengan kapasitas mesin " + this.getEngineCapacity() + " cc, memiliki kapasitas bagasi " + this.luggageCapacity + " liter, dan sedang tidak dapat berhenti otomatis apabila didiamkan");
        }
    }
}