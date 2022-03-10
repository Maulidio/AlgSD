/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3ASD;

/**
 *
 * @author mauli
 */
public class T1Kerucut {
    public T1Kerucut(){
        
    }
    public double jariJariK, tinggiK;

    public T1Kerucut(double rk, double tk){
    jariJariK = rk;
    tinggiK = tk;
    }

    public double hitungLPKerucut() {
        double slmt = Math.sqrt(Math.pow(jariJariK,2) + Math.pow(tinggiK,2));
        return 3.14*jariJariK*jariJariK+3.14*jariJariK*slmt;
    }

    public double hitungVolKerucut() {
        return 0.33*3.14*jariJariK*jariJariK*tinggiK;
    }
}
