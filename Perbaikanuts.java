import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
  String namaMahasiswa;
  String mataKuliah;
  int SKS;
  int nilai;

  public Mahasiswa(String namaMahasiswa, String mataKuliah, int SKS, int nilai) {
    this.namaMahasiswa = namaMahasiswa;
    this.mataKuliah = mataKuliah;
    this.SKS = SKS;
    this.nilai = nilai;
  }
}

public class Perbaikanuts {
  public static void main(String[] args) {
    Scanner inputan = new Scanner(System.in);
    ArrayList<Mahasiswa> input = new ArrayList<>();
    input.add(new Mahasiswa("Alexander Isak", "Algoritma", 4, 85));
    input.add(new Mahasiswa("Darwin Nunez", "Bahasa Inggris", 2, 75));
    input.add(new Mahasiswa("Erling Halland", "Kalkulus", 3, 80));
    input.add(new Mahasiswa("Lebron James", "Logika    ", 2, 90));
    input.add(new Mahasiswa("Derrick Rose", "Statistika", 3, 95));

    System.out.println("1. Menambah Mahasiswa");
    System.out.println("2. Lihat Daftar Mahasiswa");
    System.out.println("3. Keluar");
    System.out.println();

    int pilihan;
    do {
      System.out.print("Menu : ");
      pilihan = inputan.nextInt();
      inputan.nextLine();

      switch (pilihan) {
        case 1:
          System.out.println("Masukkan Nama, Mata Kuliah, SKS, Nilai : ");
          String namaMahasiswa = inputan.nextLine();
          String mataKuliah = inputan.nextLine();
          int SKS = inputan.nextInt();
          int nilai = inputan.nextInt();
          input.add(new Mahasiswa(namaMahasiswa, mataKuliah, SKS, nilai));
          System.out.println("Mahasiswa berhasil ditambahkan");
          break;

        case 2:
          System.out.println("Daftar Mahasiswa");
          System.out.println("===============================================");
          System.out.println("No\tNama\tMata Kuliah\tSKS\tNilai");
          System.out.println("===============================================");
          int jumlahSKS = 0;
          int jumlahNilai = 0;

          for (int i = 0; i < input.size(); i++) {
            Mahasiswa mhs = input.get(i);
            System.out.println(
                (i + 1) + "\t" + mhs.namaMahasiswa + "\t" + mhs.mataKuliah + "\t" + mhs.SKS + "\t" + mhs.nilai);
            jumlahSKS += mhs.SKS;
            jumlahNilai += mhs.nilai;
          }

          System.out.println("-----------------------------------------------");
          System.out.println("Jumlah SKS" + "\t" + "\t" + "\t" + jumlahSKS);
          System.out.println("Jumlah Nilai" + "\t" + "\t" + "\t" + "\t" + jumlahNilai);
          break;

        case 3:
          System.out.println("Terima Kasih");
          break;

        default:
          System.out.println("Pilihan tidak valid");
          break;

      }
    } while (pilihan != 3);

    inputan.close();
  }
}