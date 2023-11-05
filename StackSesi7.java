import java.util.Scanner;
import java.util.Stack;

class Book {
    String judul;
    String author;
    String penerbit;
    int kategori;
    int tahun;

    public Book(String judul, String author, String penerbit, int kategori, int tahun) {
        this.judul = judul;
        this.author = author;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.tahun = tahun;
    }
}

public class StackSesi7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Book> buku = new Stack<>();
        buku.push(new Book("Madilog     ", "Tan Malaka", "Widjaya     ", 1, 1943));
        buku.push(new Book("Dilan     ", "Pidi Baiq", "Pastel Books", 2, 2014));
        buku.push(new Book("Berhentidikamu", "Gia Putra   ", "Mizania    ", 3, 2018));
        buku.push(new Book("Filosofi Teras", "Henry   ", "Buku Kompas", 1, 2019));
        String kategoribuku[] = { "Non Fiksi", "Fiksi", "Romance" };

        int[] countKategori = new int[kategoribuku.length];
        int bukuLawas = 0;
        int bukuBaru = 0;

        System.out
                .println(
                        "=================================================================================================");
        System.out.println("DAFTAR BUKU YANG TERSEDIA");
        System.out
                .println(
                        "=================================================================================================");

        for (int i = 0; i < buku.size(); i++) {
            Book currentBook = buku.get(i);
            System.out.print(i + 1 + "\t");
            System.out.print(currentBook.judul + "\t\t");
            System.out.print(currentBook.author + "\t\t");
            System.out.print(currentBook.penerbit + "\t\t");
            System.out.print(currentBook.tahun + "\t");
            System.out.println(kategoribuku[currentBook.kategori - 1]);

            countKategori[currentBook.kategori - 1]++;

            if (currentBook.tahun <= 2000) {
                bukuLawas++;
            } else {
                bukuBaru++;
            }
        }
        System.out.println(
                "=================================================================================================");

        System.out.println("\nJumlah buku yang tersedia : " + buku.size());
        for (int j = 0; j < kategoribuku.length; j++) {
            System.out.println("Buku " + kategoribuku[j] + " : " + countKategori[j]);
        }
        System.out.println("Buku Lawas : " + bukuLawas);
        System.out.println("Buku Baru : " + bukuBaru);

        scanner.close();
    }
}