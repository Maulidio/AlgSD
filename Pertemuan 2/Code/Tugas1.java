/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2ASD;

/**
 *
 * @author mauli
 */
class Tugas1 {
    String nama;
    int hargaSatuan;
    int jumlah;
    
    Tugas1 (){
        
    }
    
    Tugas1 (String nm, int hs, int jml) { 
        nama = nm;
        hargaSatuan = hs;
        jumlah = jml;
    }
    
    int hitungHargaTotal(){
        return jumlah*hargaSatuan;
    }
    
    double hitungDiskon(){
        int hargaTotal = hitungHargaTotal();
        double diskon = 0;
        if (hargaTotal > 100000){
            diskon = 0.1;
        } else if (hargaTotal >= 50000 && hargaTotal <= 100000){
            diskon = 0.05;
        } else {
            diskon = 0;
        }
        return diskon;
    }

    double hitungHargaBayar(){
        int haTot = hitungHargaTotal();
        double dis = hitungDiskon();
        double discount =  haTot*dis;
        return haTot - discount;
        
    }
    
    void tampilkanBarang (){
        double diskonBarang = hitungDiskon();
        int hargaTotalBarang = hitungHargaTotal();
        double bayar = hitungHargaBayar();
        
        System.out.println("nama = " + nama);
        System.out.println("Harga = " + hargaSatuan);
        System.out.println("jumlah = " + jumlah);
        System.out.println("Diskon = " + diskonBarang);
        System.out.println("Harga Total Barang = " + hargaTotalBarang);
        System.out.println("Total Bayar = " + bayar);
    }
}
