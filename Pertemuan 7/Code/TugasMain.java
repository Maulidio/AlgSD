package Pertemuan7;

import java.util.Scanner;
public class TugasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tugas jawab = new Tugas();
        int array[] = {12,17,2,1,70,50,90,17,2,90};

        for(int i=0;i< array.length;i++){
            int arr = array[i];
            TugasIsi t = new TugasIsi(arr);
            jawab.tambah(t);
        }

        System.out.println("Data sebelum di sorting");
        jawab.tampil();
        System.out.println();
        jawab.bubbleSort();
        System.out.println("data setelah di sorting");
        jawab.tampil();
        System.out.println();
        System.out.println("data Array Terbesar adalah");
        jawab.Max();
        System.out.print("Masukkan data yang ingin di cari : ");
        int cariData = sc.nextInt();
        int posisiData = jawab.BinarySearch(cariData, 0, array.length-1);
        jawab.posisi(cariData, posisiData);




    }
}
