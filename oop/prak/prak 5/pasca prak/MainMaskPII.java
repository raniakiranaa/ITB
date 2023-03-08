public class MainMaskPII {
    public static void main(String[] args){
        String email = "Rania15@gmail.com";
        String phonenumber = "0812-8195)+ 2863";
        // String[] parts = email.split("@",10);
        // for (String str : parts){
        //     System.out.println(str);
        // }
        // String phone_number = "0812-8195()2864";
        MaskPII maskpii = new MaskPII();
        String str = maskpii.maskPII(email);
        System.out.println(str);
        str = maskpii.maskPII(phonenumber);
        System.out.println(str);
    }
}
