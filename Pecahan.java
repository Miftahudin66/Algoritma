import java.util.Scanner;

public class pecahan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Nominal Uang Yang ada di Indonesia
            int nominalUang, sisaUang;
            int[] uang = { 100000, 75000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100 };

            // Berapa uang yang Anda punya
            System.out.print("Masukkan nominal uang : Rp.");
            nominalUang = input.nextInt();
            sisaUang = nominalUang;

            // Operasi untuk menghitung berapa lembar uang atau perak
            for (int i = 0; i < uang.length; i++) {
                if (uang[i] >= 1000) {
                    int lembar = sisaUang / uang[i];
                    if (lembar > 0) {
                        System.out.println(lembar + " lembar " + uang[i] + " ribuan");
                        sisaUang = sisaUang % uang[i];
                    }
                } else {
                    int perak = sisaUang / uang[i];
                    if (perak > 0) {
                        System.out.println(perak + " perak " + uang[i] + " perak");
                        sisaUang = sisaUang % uang[i];
                    }
                }
            }
        }
    }
}