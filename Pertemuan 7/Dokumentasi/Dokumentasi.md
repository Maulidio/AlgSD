# **Dokumentasi Pertemuan 7**

### Maulidio Farhan Rizkullah
### 1G-TI
### 18
### 2141720041

#### **Pertanyaan 6.2**
1. - Method TampilData berfungsi menampilkan semua data mahasiswa seperti umur,nama,umur,ipk apabila nilai dari variabel pos tersebut tidak sama dengan -1 atau variabel dari posisi
   - Sedangkan Method dari TampilPosisi tersebut sama seperti Method TampilData namun di didalam Method tersebut menampilkan posisi data di dalam array apabila nilai dari variabel pos tersebut tidak sama dengan -1 atau variabel dari posisi

2. Fungsi dari break tersebut yaitu untuk menghentikan atau keluar dari perulangan bilamana data yang dicari itu sama
   
3. Program masih dapat berjalan serta hasil yang dikeluarkan benar,karena metode sequential search ialah membandingkan data yang dicari secara berurutan sampai data tersebut ditemukan yang dimana tidak perlu melakukan pengurutan seperti binary search

#### **Pertanyaan 6.3**
1. ```java
    if (right >= left){
            mid = (left + right) / 2;
    ```

2. ```java
   if(cari == listMhs[mid].nim){
                return(mid);
            } else if(listMhs[mid].nim > cari){
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
    ```

3. program akan error, karena pada metode binary search data akan diambil dari posisi awal dan akhir yang kemudian akan dibagi menjadi 2
4. Tidak sesuai,
   ```java
   int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if(cari == listMhs[mid].nim){
                return(mid);
            } else if(listMhs[mid].nim < cari){
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    ```

5. pada class PencarianMhs ditambah kode : 
    ```java
    Mahasiswa listMhs[];
    int idx;
    PencarianMhs(int length){
        listMhs = new Mahasiswa[length];
    }
    ```
    dan pada class main ditambahkan kode : 
    ```java
    System.out.print("Masukkan Jumlah Data Mahasiswa : ");
        int jumMhs = s.nextInt();
        PencarianMhs data = new PencarianMhs(jumMhs);
    ```
    sehingga akan menghasilkan output seperti berikut: 
    <img src = "SS1.png">

#### **Pertanyaan 6.4**
<img src = "SS2.png">

#### **Latihan Praktikum**
<img src = "SS3.png">
