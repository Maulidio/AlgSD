/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritma_sd;

/**
 *
 * @author mauli
 */
import java.util.Scanner;
public class T1N1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tugas, uts, uas;
       
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===========================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Uts: ");
        uts = sc.nextInt();
        System.out.print("Masukkan Nilai Uas: ");
        uas = sc.nextInt();

        int nTugas, nUts, nUas;
        String niAngka;
       
        nTugas = tugas*20/100;
        nUts = uts*35/100;
        nUas = uas*45/100;
       
        int totNilai = nTugas + nUts + nUas;
       
        if(totNilai > 80 && totNilai <= 100){
           niAngka = ("A");
        } else if(totNilai > 73 && totNilai <=80){
           niAngka = ("B+");
        } else if(totNilai > 65 && totNilai <= 73){
           niAngka = ("B");
        } else if(totNilai > 60 && totNilai <= 65){
           niAngka = ("C+");
        } else if(totNilai > 50 && totNilai <= 60){
           niAngka = ("C");
        } else if (totNilai > 39 && totNilai <= 50) {
           niAngka = ("D");
        } else {
           niAngka = ("E");
        }
       
        System.out.println("Nilai Akhir: " + totNilai);
        System.out.println("Nilai Huruf: " + niAngka);

        if (niAngka.equals("D") || niAngka.equals("E")){
           System.out.println("TIDAK LULUS");
        } else {
           System.out.println("LULUS");
        }
    }
}
