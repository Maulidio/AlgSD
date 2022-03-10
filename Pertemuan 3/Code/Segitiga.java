/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3ASD;

/**
 *
 * @author mauli
 */
public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }

    double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    int hitungKeliling(){
        return 3*alas;
    }
}
