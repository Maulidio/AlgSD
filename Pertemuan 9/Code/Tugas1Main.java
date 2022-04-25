package Pertemuan9;
import java.util.Scanner;

public class Tugas1Main {
    public static void main(String[] args) {
        Tugas1Isi stk = new Tugas1Isi(5);
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("==========STACK===========");
            System.out.println("Pilihan");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. print");
            System.out.println("5. getMin");
            System.out.println("6. clear");
            System.out.println("7. keluar");
            System.out.println("(ketik 1 / 2 / 3 / 4 / 5 / 6 / 7)");
            char pilih = sc.next().charAt(0);
            if (pilih == '1'){
                sc.nextLine();
                System.out.print("Jenis: ");
                String jenis = sc.nextLine();
                System.out.print("Warna: ");
                String warna = sc.nextLine();
                System.out.print("Merk: ");
                String merk = sc.nextLine();
                System.out.print("Ukuran: ");
                String ukuran = sc.nextLine();
                System.out.print("Harga: ");
                double harga = sc.nextDouble();
                Tugas1 p = new Tugas1(jenis, warna, merk, ukuran, harga);
                stk.push(p);
            } else if (pilih == '2'){
                stk.pop();
            } else if (pilih == '3'){
                stk.peek();
            } else if (pilih == '4'){
                stk.print();
            } else if (pilih == '5'){
                stk.getMin();
            } else if (pilih == '6'){
                stk.clear();
            } else if (pilih == '7'){
                System.out.println("Terimakasih");
                break;
            } else {
                System.out.println("Input yang anda masukkan salah");
                System.out.println("==============================");
                System.out.println("Apakah anda ingin mengulang input? (y/n)");
                char pilihan = sc.next().charAt(0);
                if (pilihan == 'y'){
                    continue;
                } else {
                    System.out.println("Terimakasih");
                    break;
                }
            }
        } while (true);

        //char pilih;
        /*do{
            System.out.print("Jenis: ");
            String jenis = sc.nextLine();
            System.out.print("Warna: ");
            String warna = sc.nextLine();
            System.out.print("Merk: ");
            String merk = sc.nextLine();
            System.out.print("Ukuran: ");
            String ukuran = sc.nextLine();
            System.out.print("Harga: ");
            double harga = sc.nextDouble();
            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah anda akan menambahkan data baru ke stack?(y/n) ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        } while (pilih == 'y');
        stk.print();
        stk.pop();
        stk.peek();
        stk.print();*/
    }
}
