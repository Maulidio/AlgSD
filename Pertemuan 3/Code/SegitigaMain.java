/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3ASD;

/**
 *
 * @author mauli
 */
public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];

        sgArray[0] = new Segitiga(10,4);
        sgArray[1] = new Segitiga(20,10);
        sgArray[2] = new Segitiga(15,6);
        sgArray[3] = new Segitiga(25,10);

        for (int i = 0; i < 4 ; i++){
            System.out.println("Segitiga ke- " + i + "Luas : " + sgArray[i].hitungLuas() + " Keliling : " + sgArray[i].hitungKeliling());
        }
    }
}
