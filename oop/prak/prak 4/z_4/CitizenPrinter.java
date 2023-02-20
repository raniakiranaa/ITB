/**
 * CitizenPrinter.java
 * Mencetak informasi Citizenship dan kelas turunannya 
 * (American, Japanese, Indonesian) dari beberapa warga
 * @author 
 */
import java.util.ArrayList;
import java.util.List;

public class CitizenPrinter {
    private List<Citizenship> citizenshipList = new ArrayList<Citizenship>();

    /**
     * Add Citizen. Menambahkan citizenship ke array
     * 
     * @param citizenship objek Citizenship
     */
    public void addCitizen(Citizenship citizenship) {
        // Tambahkan citizenship ke list, gunakan metode add dari java.util.List
        citizenshipList.add(citizenship);
    }
    
    /**
     * Get Citizenship. Getter dari citizenshipList
     */
    public List<Citizenship> getCitizenshipList() {
        return citizenshipList;
    }

    /**
     * Print Citizenship List. Cetak informasi dan lakukan aksi dari citizenship yang ada.  
     */
    public void printCitizenshipList() {
        for (Citizenship citizenship : this.citizenshipList){
            // Lengkapi Print Citizenship List, hint: 
            // - gunakan instanceof untuk mengetahui tipe dari objek
            // - gunakan type casting untuk memanggil metode kelas turunan
            if (citizenship instanceof American){
                American american = (American) citizenship;

                System.out.println("American");
                System.out.println(american.getSurname() + " " + american.getGivenName());
                american.speak();
                System.out.println(american.getState());
            } else if (citizenship instanceof Indonesian){
                Indonesian indonesian = (Indonesian) citizenship;

                System.out.println("Indonesian");
                System.out.println(indonesian.getSurname() + " " + indonesian.getGivenName());
                indonesian.speak();
                indonesian.speakLocalLanguage();
            } else if (citizenship instanceof Japanese){
                Japanese japanese = (Japanese) citizenship;

                System.out.println("Japanese");
                System.out.println(japanese.getSurname() + " " + japanese.getGivenName());
                japanese.speak();
                System.out.println(japanese.getFavouriteAnime());
            }
        }
    }
}