# **Dokumentasi Pertemuan 9**

### Maulidio Farhan Rizkullah
### 1G-TI
### 18
### 2141720041

### **Pertanyaan 7.2.3**
1. Data yang dapat ditampung adalah 5
<img src = SS1.png>

2. data yang tersimpan pada variabel p ialah data pada variabel jenis, warna, merk, ukuran, dan biaya (data dari objek pakaian)

3. fungsi dari do-while untuk perulangan pada statement menambahkan data pakaian diulang Kembali atau tidak.

4. ```java
    do{
                System.out.println("==========STACK===========");
                System.out.println("Pilihan");
                System.out.println("1. push");
                System.out.println("2. pop");
                System.out.println("3. peek");
                System.out.println("4. print");
                System.out.println("5. keluar");
                System.out.println("(ketik 1 / 2 / 3 / 4 / 5)");
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
                    Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                } else if (pilih == '2'){
                    stk.pop();
                } else if (pilih == '3'){
                    stk.peek();
                } else if (pilih == '4'){
                    stk.print();
                } else if (pilih == '5'){
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
    ```
hasil run
<img src = SS2.png>

### **Pertanyaan 7.3.3**
1. alur kerja pada method derajat, pada method ini nilai dari variabel c yang berisi
operator matematika di masukkan dan dilakukan pemilihan switch case untuk
mengetahui dimana letak opearator tersebut saat di postfix berdasarkan kondisi
lebih besar ataupun lebih kecil derajat operatornya, apabila nilai ditemukan kode
program akan dijalankan sesuai statement yang ada. Sedangkan apabila nilainya
tidak ditemukan maka akan di default.
2. fungsi kode tersebut digunakan untuk memanggil nilai c berdasarkan nilai yang
terakhir kali diinputkan pada varibel i.
3. <img src = SS3.png>
4. tanda kurung tidak ditampilkan karena bukan merupakan operator aritmatika
sehingga juga tidak memiliki derajat operator aritmatika, sehingga tidak perlu
ditampilkan pada hasil konverensi. tanda kurung digunakan untuk memudahkan
proses operasi perhitungan.

### **Latihan Praktikum**
1. 
    <img src = SS4.png>
    <img src = SS5.png>
2. 
    <img src = SS6.png>
    <img src = SS7.png>
    <img src = SS8.png>
    <img src = SS9.png>
    <img src = SS10.png>
    <img src = SS11.png>


    Hasil tanpa perulangan dan inputan:                  
    <img src = SS12TP.png>
    <img src = SS13TP.png>
    <img src = SS14TP.png>

    Hasil dengan perulangan dan inputan:                 
    <img src = SS15DP.png>
    <img src = SS16DP.png>
    <img src = SS17DP.png>
    <img src = SS18DP.png>
    <img src = SS19DP.png>
    <img src = SS20DP.png>
    <img src = SS21DP.png>
