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

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        System.out.print("Jumlah Tanah: ");
        input = sc.nextInt();

        T2Data[] ppArray = new T2Data[input];

        for (int i = 0; i < ppArray.length; i++){
            ppArray[i] = new T2Data();
            System.out.println("Tanah " + (i+1));
            System.out.print("Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++){
            System.out.println("Luas Tanah " + (i+1) + ": " + ppArray[i].hitungLuas());
        }

        int terluas = 0;
        for(int i = 0; i < ppArray.length; i++){
            if (ppArray[i].hitungLuas() > terluas){
                terluas = ppArray[i].hitungLuas();
            }
        }

        for(int i = 0; i < ppArray.length; i++){
            if (terluas == ppArray[i].hitungLuas()){
                System.out.println("Tanah Terluas: Tanah " + (i+1));
            }
        } 
    }
}
