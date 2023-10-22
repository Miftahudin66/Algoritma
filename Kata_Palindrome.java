import java.util.Scanner;

public class Kata_Palindrome {
    public static void main(String[] args) throws Exception {
        Scanner userinput = new Scanner(System.in);

        String kata;
        String kataPalindrome = "";
        int panjangKata;

        System.out.println("\t MENETUKAN KATA PALINDROME \n");

        System.out.print("Masukan kata : ");
        kata = userinput.nextLine();

        panjangKata = kata.length();

        for (int i = panjangKata - 1; i >= 0; i--) {
            kataPalindrome = kataPalindrome + kata.charAt(i);
        }
        if (kata.equals(kataPalindrome)) {
            System.out.println(kata + " Adalah Kata Palindrome ");

        } else {
            System.out.println(kata + " Bukan Kata Palindrome ");
            userinput.close();

        }

    }
}