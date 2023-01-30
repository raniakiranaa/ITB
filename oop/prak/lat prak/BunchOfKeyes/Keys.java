public class Keys {
    private static int n_keyes; // jumlah kunci yg ada
    public Keys(){
        this.n_keyes++;
    }
    // public void add(){
    //     this.n_keyes += 1;
    // }
    public void shake(){
        if (this.n_keyes > 1){
            for (int i = 0; i < this.n_keyes; i++){
                System.out.println("Krincing");
            }
        } else {
            System.out.println("Tidak terjadi apa-apa");
        }
    }

    public void printInfo(){
        System.out.println("kunci sebanyak " + this.n_keyes);
    }

}