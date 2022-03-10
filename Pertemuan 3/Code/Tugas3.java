/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3ASD;

/**
 *
 * @author mauli
 */
import java.util.Scanner; 

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T3DataMHS[] array = new T3DataMHS[3];

        for(int i = 0; i < array.length; i++){
            array[i] = new T3DataMHS();
            System.out.println("Masukkan data mahasiswa ke- " + (i+1));
            System.out.print("Masukkan nama: ");
            array[i].nama = sc.nextLine();
            System.out.print("Masukkan nim: ");
            array[i].nim = sc.nextLong();
            System.out.print("Masukkan jenis kelamin: ");
            array[i].kelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            array[i].ipk = sc.nextFloat();
            sc.nextLine();
            System.out.println();
        }

        for(int i = 0; i<array.length; i++){
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("nama : " + array[i].nama);
            System.out.println("nim : " + array[i].nim);
            System.out.println("Jenis kelamin : " + array[i].kelamin);
            System.out.println("Nilai IPK : " + array[i].ipk);
        }
    }
}
