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

class T1N2 {
    public static void main(String[] args) {
        int NIM, hari;
        long hasil;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM anda : ");
        hasil = sc.nextInt();
        NIM = (int) (hasil % 100);
        if (NIM < 10) {
            System.out.println(NIM += 10);
        } else {
            System.out.println("n= " + NIM);
        }

        hari = 0;
        for (int i = 0; i < NIM; i++) {
            hari++;
            if (hari >= 7) {
                hari = 0;
            }
            if (hari % 7 == 0) {
                System.out.print("Minggu ");
            } else if (hari % 6 == 0) {
                System.out.print("Sabtu ");
            } else if (hari % 5 == 0) {
                System.out.print("Jumat ");
            } else if (hari % 4 == 0) {
                System.out.print("Kamis ");
            } else if (hari % 3 == 0) {
                System.out.print("Rabu ");
            } else if (hari % 2 == 0) {
                System.out.print("Selasa ");
            } else {
                System.out.print("Senin ");
            }
        }
    }
}