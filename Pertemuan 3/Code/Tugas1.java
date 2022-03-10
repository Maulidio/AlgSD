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

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.print("Masukkan jumlah bangun ruang Kerucut, Kubus dan Tabung yang ingin di hitung: ");
        input = sc.nextInt();

        T1Kerucut[] ppArrayKerucut = new T1Kerucut[input];
        T1Kubus[] ppArrayKubus = new T1Kubus[input];
        T1Tabung[] ppArrayTabung = new T1Tabung[input];

        for(int i = 0; i<ppArrayKerucut.length; i++){
            System.out.println("========================================");
            ppArrayKerucut[i] = new T1Kerucut();
            System.out.println("kerucut ke-" + i);
            System.out.print("Masukkan Jari-Jari Kerucut: ");
            ppArrayKerucut[i].jariJariK = sc.nextDouble();
            System.out.print("Masukkan tinggi Kerucut: ");
            ppArrayKerucut[i].tinggiK = sc.nextDouble();
            System.out.println();

            ppArrayKubus[i] = new T1Kubus();
            System.out.println("Kubus ke-" + i);
            System.out.print("Masukkan Sisi Kubus: ");
            ppArrayKubus[i].sisi = sc.nextInt();
            System.out.println();

            ppArrayTabung[i] = new T1Tabung();
            System.out.println("Tabung ke-" + i);
            System.out.print("Masukkan Jari-Jari Tabung: ");
            ppArrayTabung[i].jariJari = sc.nextDouble();
            System.out.print("Masukkan tinggi Tabung: ");
            ppArrayTabung[i].tinggi = sc.nextDouble();
            System.out.println("========================================");
            System.out.println();
        }

        for(int i = 0; i<ppArrayKerucut.length; i++){
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("volume Kerucut ke " + i + ": " + ppArrayKerucut[i].hitungVolKerucut());
            System.out.println("Luas Permukaan Kerucut ke " + i + ": " + ppArrayKerucut[i].hitungLPKerucut());
            System.out.println();

            System.out.println("volume kubus ke " + i + ": " + ppArrayKubus[i].hitungVolKubus());
            System.out.println("Luas Permukaan Kubus ke " + i + ": " + ppArrayKubus[i].hitungLPKubus());
            System.out.println();

            System.out.println("volume Tabung ke " + i + ": " + ppArrayTabung[i].hitungVolTabung());
            System.out.println("Luas Permukaan Tabung ke " + i + ": " + ppArrayTabung[i].hitungLPTabung());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println();
        }
    }
}
