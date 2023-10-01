import java.util.Scanner;

public class parkir {
   public static void Main( String[] args)throws Exception {
       
       int JamMasuk,JamKeluar,BiayaPerjam =2000,cal;
        Scanner input = new Scanner (System.in);

        //Input
        System.out.print("Jam Masuk b: ");
        JamMasuk = input.nextInt();
        System.out.print("Jam Keluar :");
        JamKeluar = input.nextInt();

        //eksekusi program
        cal = (JamKeluar - JamMasuk) * BiayaPerjam;
        System.out.println("Total biaya parkir : " + cal);
        input.close();
  
    }

}
        

