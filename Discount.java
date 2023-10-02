import java.util.Scanner;

public class Discount {
    public static void Main( String[] args)throws Exception {
        Double totalBelanja, Discount;

        Scanner inputan = new Scanner (System.in);
        System.out.print("Masukan total belanja");
        totalBelanja = inputan.nextDouble();

        if (totalBelanja >=100000) {
            Discount = 5/100 * totalBelanja;
            totalBelanja = totalBelanja - Discount;
        }

        System.out.println("total yang harus dibayar: " + totalBelanja);
    }

}
