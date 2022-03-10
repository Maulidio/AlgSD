/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3ASD;

/**
 *
 * @author mauli
 */
public class T1Kubus {
    public int sisi;
    
    public T1Kubus(){
        
    }

    public T1Kubus(int s){
    sisi = s;
    }

    public int hitungLPKubus(){
        return 6*sisi*sisi;
    }

    public int hitungVolKubus(){
        return sisi*sisi*sisi;
    }
}
