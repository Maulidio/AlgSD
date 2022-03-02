/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2ASD;

/**
 *
 * @author mauli
 */
class Tugas2 {
    int x, y, width, height;

    void moveLeft(int a) {
        x = x - a;
    }

    void moveRight(int b){
        x = x + b;
    }

    void moveUp(int c){
        y = y + c;
    }

    void moveDown(int d){
        y = y - d;
    }

    void printPotition(){
        System.out.println("Pacman ada di posisi");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
