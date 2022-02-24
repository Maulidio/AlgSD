/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritma_sd;

/**
 *
 * @author mauli
 */
public class P1N1{
    public static void main(String[] args) {
        int ani = 4, budi = 15, bina = 6, cita = 11;
        double hasilAkhir;
        double totalAni = ani*4500, totalBudi = budi*4500*0.05, totalBina = bina*4500, totalCita = cita*4500*0.05;
        hasilAkhir = totalAni + totalBudi + totalBina + totalCita;
        System.out.println("Hasil Pendapatan Smile laundry Rp: "+ hasilAkhir);
        System.out.println("Customer:");
        System.out.println("Ani Rp: " + totalAni );
        System.out.println("Budi Rp: " + totalBudi);
        System.out.println("Bina Rp: " + totalBina);
        System.out.println("Cita Rp: " + totalCita);

    }
}

