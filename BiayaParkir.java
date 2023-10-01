import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jam Masuk (0-24): ");
        int jamMasuk = input.nextInt();

        System.out.print("Jam Keluar (0-24): ");
        int jamKeluar = input.nextInt();

        System.out.print("Biaya Parkir per Jam: ");
        int biayaParkir = input.nextInt();

        int lamaParkir = jamKeluar - jamMasuk;
        int totalBiaya = lamaParkir * biayaParkir;

        System.out.println("Lama Parkir: " + lamaParkir + " jam");
        System.out.println("Total Biaya: Rp" + totalBiaya);
    }
}