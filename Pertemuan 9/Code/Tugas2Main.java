package Pertemuan9;
import java.util.Scanner;

public class Tugas2Main {
    public static void main(String[] args) {
        Tugas2Queue tgs = new Tugas2Queue(8);

        Scanner sc = new Scanner(System.in);

        //dengan perulangan dan inputan
        do{
            System.out.println("====STRUK PEMBELIAN====");
            System.out.println("Pilihan");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. print");
            System.out.println("4. keluar");
            System.out.println("(ketik 1 / 2 / 3 / 4)");
            char pilih = sc.next().charAt(0);
            if (pilih == '1'){
                sc.nextLine();
                System.out.print("Masukkan nomor transaksi: ");
                int noTrx = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan tanggal pembelian(format: dd/mm/yyyy): ");
                String tgl = sc.nextLine();
                System.out.print("Masukkan jumlah barang yang dibeli: ");
                int jum = sc.nextInt();
                System.out.print("Masukkan total harga bayar: ");
                int totHar = sc.nextInt();

                Tugas2 p = new Tugas2(noTrx, tgl, jum, totHar);
                tgs.push(p);
            } else if (pilih == '2'){
                tgs.pop();
            } else if (pilih == '3'){
                tgs.print();
            } else if (pilih == '4'){
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

        //tanpa perulangan dan inputan

        /*int noTrx[] = {678, 798, 865, 910, 1086, 1198, 1243, 1309};
        String tglBeli[] = {
                "03/04/2022",
                "10/04/2022",
                "17/04/2022",
                "24/04/2022",
                "01/05/2022",
                "08/05/2022",
                "15/05/2022",
                "22/05/2022",
        };
        int jmlBrg[] = {14, 12, 15, 7, 16, 4, 9, 11};
        int hrgByr[] = {840000, 720000, 900000, 420000, 960000, 240000, 540000, 660000};
        //menyimpan struk
        for (int i=0; i< tgs.size; i++){
            Tugas2 t = new Tugas2(noTrx[i],tglBeli[i], jmlBrg[i], hrgByr[i]);
            tgs.push(t);
            System.out.println("Struk pada tanggal " + tglBeli[i] + " ditambahkan");
        }
        //menampilkan struk
        System.out.println();
        tgs.print();

        //mengambil 5 struk dari stack untuk ditukar dengan voucher
        for (int i=0; i<5;i++){
            tgs.pop();
        }

        //menampilkan informasi struk belanja yang masih tersimpan
        System.out.println();
        System.out.println("=======STRUK TERSISA========");
        tgs.print();*/

    }
}
