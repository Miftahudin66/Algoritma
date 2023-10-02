import java.util.Scanner;

public class Ganjil {
    public static void Main( String[] args)throws Exception {
         /* mengitung bilangan Ganjil/Genap */
         Scanner inputan = new Scanner(System.in);
         System.out.print("Masukan angka: ");
         int angka = inputan.nextInt();

         if (angka % 2 == 0){
            System.out.println("Bilangan Genap: ");
         } else {
            System.out.println("Bilangan Ganjil: ");
         }
    }
}
