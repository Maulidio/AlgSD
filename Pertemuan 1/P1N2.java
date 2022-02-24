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

public class P1N2 {
    public static void main(String[] args) {
        int menu;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("=======================================");
            System.out.println("MENU RUMUS KECEPATAN, JARAK, DAN WAKTU");
            System.out.println("=======================================");
            System.out.println("Silahkan Pilih Menu :");
            System.out.println("1. Rumus Kecepatan");
            System.out.println("2. Rumus Jarak");
            System.out.println("3. Rumus Waktu");
            System.out.println("4. Keluar Dari Program");
            System.out.println("Pilihan Menu Anda(1 / 2 / 3 / 4)");
            menu = sc.nextInt();
            switch(menu){
                case 1 : {
                    System.out.println("Menu 1. Menampilkan Perhitungan Rumus Kecepatan");
                    kecepatan();
                }break;
                case 2 : {
                    System.out.println("Menu 2. Menampilkan Perhitungan Rumus Jarak");
                    jarak();
                }break;
                case 3 : {
                    System.out.println("Menu 3. Menampilkan Perhitungan Rumus Waktu");
                    waktu();
                }break;
                default : {
                    System.out.println("Terimakasih");
                }
            }
        }while(menu > 0 && menu < 4);
    }

    private static void waktu() {
        double v, s, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Silahkan Masukkan jarak(dalam satuan Km) ");
        s = sc.nextDouble();
        System.out.print("Silahkan Masukkan kecepatan (dalam satuan Km/jam)");
        v = sc.nextDouble();
        t = s/v;
        System.out.println("Waktu Yang Ditempuh adalah: " + t + "/jam");
        System.out.println("");
    }

    private static void jarak() {
        double v, s, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Silahkan Masukkan Kecepatan (dalam satuan Km/jam) ");
        v = sc.nextDouble();
        System.out.print("Silahkan Masukkan waktu (dalam satuan jam)");
        t = sc.nextDouble();
        s = v*t;
        System.out.println("Jarak Yang Ditempuh adalah: " + s );
        System.out.println("");
    }

    private static void kecepatan() {
        double v, s, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Silahkan Masukkan jarak (dalam satuan Km)");
        s = sc.nextDouble();
        System.out.print("Silahkan Masukkan waktu (dalam satuan Jam)");
        t = sc.nextDouble();
        v = s/t;
        System.out.println("Kecepatan Yang Ditempuh adalah: " + v + ("Km/Jam") );
        System.out.println("");
    }
}
