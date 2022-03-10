/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3ASD;

/**
 *
 * @author mauli
 */
public class T1Tabung {
    public T1Tabung(){
        
    }
    public double jariJari, tinggi;

    public T1Tabung(double r, double t){
    jariJari = r;
    tinggi = t;
    }

    public double hitungLPTabung() {
        return 2*3.14*jariJari*(jariJari+tinggi);
    }

    public double hitungVolTabung() {
        return 3.14*jariJari*jariJari*tinggi;
    }
}
