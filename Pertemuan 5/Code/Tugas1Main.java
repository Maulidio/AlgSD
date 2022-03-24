package Pertemuan5;
import java.util.Scanner;

public class Tugas1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Pemilihan Ketua BEM tahun 2022");
        System.out.println("===============================");
        System.out.println("Masukkan Jumlah Suara : ");
        int elemen = input.nextInt();
        Tugas1 test = new Tugas1(elemen);
        input.nextLine();
        for(int i = 0; i < elemen; i++){
            System.out.println("Masukkan Suara ke - "+ (i+1) + " = ");
            test.kandidat[i] = input.nextLine();
        }
        int hasil = test.modArr(test.kandidat, 0, elemen, 0);
        System.out.println(" Mayoritaas Jumlah Suara adalah : " + test.kandidat[hasil]);
    }
}
