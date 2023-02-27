/**
 * Perari.java
 * Subclass dari Car java
 * @author 18221168 Rania Sasi Kirana
 */
public class Perari extends Car1 {//Jangan lupa tambahkan kata kunci untuk melakukan polymorphism antar kelas
    private int averageSpeed;
    private Boolean isInsuranced;

    public Perari(int numberOfWheels,int engineCapacity, int averageSpeed, Boolean isInsuranced) {
        //Konstruktor
        //averageSpeed merupakan nilai kecepatan rata-rata dari perari dalam satuan km/h
        //isInsuranced merupakan status apakah perari didaftarkan asuransi atau tidak
        super(numberOfWheels, engineCapacity);
        this.averageSpeed = averageSpeed;
        this.isInsuranced = isInsuranced;
    }

    public int getAverageSpeed(){
        //Mengembalikan nilai dari kecepatan rata-rata perari
        return this.averageSpeed;
    }

    public Boolean getInsuranceStatus(){
        //Mengembalikan status asuransi dari perari
        return this.isInsuranced;
    }    
    public String sound(){
        //Mengembalikan string berisi "Brmmm"
        return "Brmmm";
    }

    public String honk(){
        //Mengemabilakn string berisi "Siuuu"
        return "Siuuu";
    }

    public String printDescription(){
        //Mengembalikan string yang berformat dan berkondisi
        //Apabila isInsurance true, maka mengembalikan: "Mobil ini memiliki a roda dengan kapasitas mesin b cc, memiliki kecepatan rata-rata c km/h, dan sedang dalam perlindungan asuransi", dimana a adalah numberOfWheels, b adalah engineCapacity dan c adalah averageSpeed
        //Apabila isInsurance false, maka mengembalikan: "Mobil ini memiliki a roda dengan kapasitas mesin b cc, memiliki kecepatan rata-rata c km/h, dan sedang tidak dalam perlindungan asuransi", dimana a adalah numberOfWheels, b adalah engineCapacity dan c adalah averageSpeed
        if (this.isInsuranced){
            return ("Mobil ini memiliki " + this.getNumberOfWheels() + " roda dengan kapasitas mesin " + this.getEngineCapacity() + " cc, memiliki kecepatan rata-rata " + this.averageSpeed + " km/h, dan sedang dalam perlindungan asuransi");
        } else {
            return ("Mobil ini memiliki " + this.getNumberOfWheels() + " roda dengan kapasitas mesin " + this.getEngineCapacity() + " cc, memiliki kecepatan rata-rata " + this.averageSpeed + " km/h, dan sedang tidak dalam perlindungan asuransi");
        }
    }
}

