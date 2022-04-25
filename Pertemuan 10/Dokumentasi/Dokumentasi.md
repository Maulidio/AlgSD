# **Dokumentasi Pertemuan 10**

### Maulidio Farhan Rizkullah
### 1G-TI
### 18
### 2141720041

### **Pertanyaan 8.2.3**
1. Karena atribut front dan rear tidak menunjuk ke data manapun, sedangkan size
merupakan banyaknya nilai yang diinputkan ke dalam array
2. Apabila rear berada pada indeks paling belakang maka rear akan dipindahkan ke
indeks paling depan
3. Apabila front berada pada indeks paling belakang maka front akan dipindahkan ke
indeks paling depan
4. Karena looping tidak selalu mulai dari indeks ke-0 dan front tidak selalu berada di
indeks ke-0
5. Potongan kode diatas digunakan agar i tidak melebihi max
6. <img src = SS1.png>
7. ```java
    public class QueueMain {
        public static void menu(){
            System.out.println("Masukkan operasi yang diinginkan: ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Peek Position");
            System.out.println("6. Peek At");
            System.out.println("7. Clear");
            //modif
            System.out.println("8. Keluar program");
            System.out.println("-------------------------");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan kapasitas queue: ");
            int n = sc.nextInt();
            Queue Q = new Queue(n);
            //int pilih;
            String ulang;

            do{
                menu();
                //pilih = sc.nextInt();
                int pilih = sc.nextInt();
                switch (pilih){
                    case 1:
                        System.out.print("Masukkan data baru: ");
                        int dataMasuk = sc.nextInt();
                        Q.Enqueue(dataMasuk);
                        break;
                    case 2:
                        int dataKeluar = Q.Dequeue();
                        if (dataKeluar != 0){
                            System.out.println("Data yang dikeluarkan: " + dataKeluar);
                            break;
                        }
                    case 3:
                        Q.print();
                        break;
                    case 4:
                        Q.peek();
                        break;
                    case 5:
                        System.out.print("Masukkan data yang ingin dicari: ");
                        int data = sc.nextInt();
                        Q.peekPosition(data);
                        break;
                    case 6:
                        System.out.println("Masukkan posisi index yang ingin dicari: ");
                        int position = sc.nextInt();
                        Q.peekAt(position);
                        break;
                    case 7:
                        Q.clear();
                        break;
                    //modif
                    case 8:
                        System.exit(0);
                    default:
                        System.out.println("Maaf, anda salah memasukkan menu pilihan");
                }

                System.out.println("Apakah ingin kembali ke menu utama? [y/t]");
                ulang = sc.next();
            } while(ulang.equalsIgnoreCase("y"));
            //while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
        }
    }
    ```

### **Pertanyaan 8.3.3**
1. Kode program diatas digunakan untuk mengecek apakah norek, nama, alamat, umur, saldo kosong atau tidak, apabila salah satu dari kelima atribut tersebut ada yang kosong maka tidak akan menampilkan antrian yang keluar
2.  <img src = SS2.png>
    <img src = SS3.png>
    <img src = SS4.png>
    <img src = SS5.png>

### **Tugas 8.4**
1. <img src = SS6.png>
    <img src = SS7.png>
    <img src = SS8.png>
    Hasil Run:                                                            
    <img src = SS9.png>

2. <img src = SS10.png>
    <img src = SS11.png>
    <img src = SS12.png>
    <img src = SS13.png>
    <img src = SS14.png>
    <img src = SS15.png>


