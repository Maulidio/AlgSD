package Pertemuan7;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
                int jumMhs = 5;

        System.out.println("---------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari Nim terkecil");
        for (int i = 0; i < jumMhs; i++){
            System.out.println("----------------");
            System.out.println("Nim : ");
            int nim = s.nextInt();
            System.out.println("Nama : ");
            String nama = s1.nextLine();
            System.out.println("Umur : ");
            int umur = s.nextInt();
            System.out.println("IPK : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-----------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);

        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("===================================");
        System.out.println("Menggunakan binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs-1);
        data.Tampilposisi(cari,posisi);
        data.TampilData(cari, posisi);
    }
}
