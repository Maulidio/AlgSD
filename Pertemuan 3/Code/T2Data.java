/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3ASD;

/**
 *
 * @author mauli
 */
public class T2Data {
    public int panjang = 0;
    public int lebar = 0;
    public T2Data(){

    }
    
    public T2Data(int p, int l){
        panjang = p;
        lebar = l;
    }

    public int hitungLuas(){
        return panjang*lebar;
    }
}
