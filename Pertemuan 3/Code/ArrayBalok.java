/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3ASD;

/**
 *
 * @author mauli
 */
public class ArrayBalok {
    public static void main(String[] args) {
        Balok[] blArray = new Balok[3];

        blArray[0] = new Balok (100, 30, 12);
        blArray[1] = new Balok (120,40,15);
        blArray[2] = new Balok (210,50,25);

        for(int i = 0; i<3;i++){
            System.out.println("volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
     }
}
