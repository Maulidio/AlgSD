# **Laporan Praktikum**

><p>Nama : Maulidio Farhan Rizkullah<p>
>Kelas : 1G-TI | 18 | 2141720041<p>

<br>

### **16.2.3 Pertanyaan Percobaan**
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?<p>
    >**Jawab**<p>
    >arrayList tersebut tidak terdapat perintah tipe data yang menyimpan secara spesifik data yang akan disimpan didalamnya. sehingga arraylist pada baris kode 25-36 diatas bersifat sintak umum yang dapat menyimpan data segala jenis tipe data<P>

2. Modifikasi baris kode 25-36 sehingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!<p>
    >**Jawab**<p>
    ```java
     List <Integer> l = new ArrayList();
        
        l.add(1);
        l.add(2);
        l.add(3);
        //l.add("Cireng");
        System.out.printf("Elemen 0 : %d total elemen : %d elemen terakhir : %s\n", 
                l.get(0), l.size(), l.get(l.size() - 1));
        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0 : %d total elemen : %d elemen terakhir : %s\n", 
                l.get(0), l.size(), l.get(l.size() - 1));
    ```

3. Ubah kode pada baris kode 38 menjadi seperti ini<p>
    >**Jawab**<p>
    ```java
    LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
    ```

4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya<p>
    >**Jawab**<p>
    ```java
    LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
        System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", 
                names.get(0), names.size(), names.get(names.size() - 1));
        names.set(0, "My Kid");
        System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", 
                names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names : "+ names.toString());
        
        names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen : %s elemen terakhir : %s\n",
                names.getFirst(), names.size(), names.getLast());
        System.out.println("Names : "+ names.toString());
    ```

5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!<p>
    >**Jawab**<p>
    kita dapat membatasi tipe data yang akan dimasukkan dengan perintah tersebut dan dengan menggunakan class LinkedList kita dapat menggunakan method linked list seperti push(), getFirst(), getLast(), akan tetapi ketika menggunakan class List tidak bisa<p>

<br>

### **16.3.3 Pertanyaan Percobaan**
1. Apakah perbedaan fungsi push() dan add() pada objek fruits?<p>
    > **Jawab**<p>
    >- push() merupakan fungsi dari interface stack
    >- add() tidak atau bukan interface dari stack

2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?<p>
    > **Jawab**<p>
    data "melon" dan "durian" tidak muncul, karena saat kita mengakses fungsi push() artinya kita akan menambahkan data "melon" dan "durian"<p>

3. Jelaskan fungsi dari baris 46-49?<p>
    >**Jawab**<p>
    >- pada baris 46 berfungsi untuk proses inisialisasi dan mengatur aturan perulangan sesuai perintah yang di instruksikan
    >- pada baris 47 adalah untuk pembuatan variabel fruit menjadi it.next()
    >- pada baris 48 berfungsi untuk mencetak variabel fruit<p>

4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?<p>
    > **Jawab**<p>
    >yang terjadi adalah eror pada bagian push, empty, pop karena tidak dapat dijalankan pada interface list, yang mana perintah yang diatas adalah fungsi dari interface stack<p>

5. Ganti elemen terakhir dari objek fruits menjadi ???Strawberry???!
    > **Jawab**<p>
    ```java
        fruits.push("Strawberry");
    ```

6. Tambahkan 3 buah seperti ???Mango???,???guava???, dan ???avocado??? kemudian dilakukan sorting!
    > **Jawab**<p>
    ```java
    fruits.push("Manggo");
    fruits.push("Guava");
    fruits.push("Avocado");
        
    System.out.println("");
    System.out.println("\nData sesudah disorting ");
    Collections.sort(fruits);
    Iterator i= fruits.iterator();
        
    while(i.hasNext()){
        System.out.print(i.next() + "  ");
        System.out.println("");
    } 
    ```

<br>

### **16.4.3 Pertanyaan Percobaan**
1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?<p>
    > **Jawab**<p>
    >fungsi tambah() menggunakan konsep atau method addAll() dari collections dimana konsep ini memiliki kelebihan dapat menambahkan element tanpa ada batas jumlah elemen yang ditambahkan<p>

2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
    > **Jawab**<p>
    ```java
    int binarySearch(String nim){
        return Collections.binarySearch(mahasiswas, new mahasiswa(nim, null, null), new Comparator<mahasiswa>(){
            @Override
            public int compare(mahasiswa o1, mahasiswa o2){
                return o1.nim.compareTo(o2.nim);
            }
        });
    }
    ```

3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!
    > **Jawab**<p>
    descending
    ```java
    void dscSort(){
        Collections.reverse(mahasiswas);
    }
    ```

    ascending
    ```java
    void ascSort(){
        Collections.sort(mahasiswas, new Comparator<mahasiswa>(){
            @Override
            public int compare(mahasiswa o1, mahasiswa o2){
                return o1.nim.compareTo(o2.nim);
            }
        });
    }
    ```

<br>

## **16.5 Tugas Praktikum**

1. Implementasikan stack menggunakan collection dengan contoh kasus tumpukan daftar film sesuai dengan fitur-fitur yang ditunjukkan pada gambar di bawah ini!<p>
    
    **JAWAB**<p>
    class "film<p>
    ```java
    package Pertemuan16.Tugas1;
    
    public class film {
        String id, judul, tahun, director;
    
        public film(String id, String judul, String tahun, String director){
            this.id = id;
            this.judul = judul;
            this.tahun = tahun;
            this.director = director;
        }
        @Override
        public String toString(){
            return "FILM {Id Film= "+id +", Judul FIlm= "+judul+", Tahun Tayang= "+tahun+", Director= "+director+"}";
        }
    }
    ```
    Main class
    ```java
    package Pertemuan16.Tugas1;
    import java.util.Scanner;
    import java.util.Stack;
    
    public class filmMain {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Scanner sd = new Scanner(System.in);
            Scanner sa = new Scanner(System.in);
            
            Stack <film> films = new Stack();
            
            char pilih;
            int menu = 0;
            do{
                System.out.println("+======================================+");
                System.out.println("+ Data Film Layar Lebar Sepanjang Masa +");
                System.out.println("+======================================+");
                System.out.println("+1. Input Judul FIlm                   +");
                System.out.println("+2. Hapus Data Film Teratas            +");
                System.out.println("+3. Cek Judul Film Teratas             +");
                System.out.println("+4. Info semua judul Film              +");
                System.out.println("+5. Keluar                             +");
                System.out.println("+======================================+");
                System.out.print("+Pilih menu\t: ");
                menu = sd.nextInt();
                switch(menu){
                    case 1:{
                        do{ 
                        System.out.println("+=====================================+");
                        System.out.print(" Id Film\t: ");
                        String id = sc.nextLine();
                        System.out.print(" Judul Film\t: ");
                        String judul = sc.nextLine();
                        System.out.print(" Tahun Tayang\t: ");
                        String tahun = sc.nextLine();
                        System.out.print(" Director\t: ");
                        String director = sc.nextLine();
                        film data = new film(id, judul, tahun, director);
                        films.push(data);
                        System.out.println("Mau tambah data atau tidak Y/n");
                        pilih = sa.next().charAt(0);
                        System.out.println("");
                        
                        }while (pilih == 'y' || pilih == 'Y');
                        
                    }
                    break;
                    case 2 :{
                        System.out.println("+=====================================+");
                        System.out.println("+       Hapus Data Film Teratas       +");
                        System.out.println("+=====================================+");
                        System.out.println(films.pop());
                        System.out.println("");
                    }
                    break;
                    case 3:{
                        System.out.println("+=====================================+");
                        System.out.println("+           Judul Film Teratas        +");
                        System.out.println("+=====================================+");
                        System.out.println(films.peek());
                        System.out.println("");
                    }
                    break;
                    case 4:{
                        System.out.println("+=====================================+");
                        System.out.println("+        Info Semua Judul FIlm        +");
                        System.out.println("+=====================================+");
                        for(int i=0; i<films.size(); i++){
                            System.out.println(films.get(i));
                        }
                        System.out.println("");
                    }
                    break;
                    case 5: {
                        System.out.println("");
                        System.out.println("+            Terima Kasih             +");
                    }
                    break;
                }
            }while (menu < 5 && menu > 0);
        }
    }
    ```
    <br>

2. Buatlah implementasi program daftar nilai mahasiswa semester, minimal memiliki 3 class yaitu Mahasiswa, Nilai, dan Mata Kuliah. Khusus untuk data Mahasiswa dan Mata Kuliah harus sudah diinisialisasi, sehingga ketika memasukkan data nilai data mahasiswa dan mata kuliah cukup menginputkan nim ataupun kode mata kuliah. Yang paling penting adalah antara objek mahasiswa, matakuliah, dan nilai harus saling terhubung.<p>

     **JAWAB**<p>
    ### class "mahasiswa"
    ```java
    package Pertemuan16.Tugas2;
    
    public class mahasiswa {
        String nim, nama, noTelp;
        
        public mahasiswa(){
            
        }
        public mahasiswa(String nim, String nama, String noTelp){
            this.nim = nim;
            this.nama = nama;
            this.noTelp = noTelp;
        }
        @Override
        public String toString(){
            return String.format("%s\t%-15s\t%s", nim, nama, noTelp);
        }
    }
    ```
    ### class "mataKuliah"
    ```java
    package Pertemuan16.Tugas2;
    
    public class mataKuliah {
        String kodeMk, namaMk;
        int sks;
        
        public mataKuliah(String kodeMk, String namaMk, int sks){
            this.kodeMk = kodeMk;
            this.namaMk = namaMk;
            this.sks = sks;
        }
        public String toString(){
            return String.format("%s\t%-40s%s", kodeMk, namaMk, sks);
        }
    }
    ```
    ### class "nilaiMain"
    ```java
    package Pertemuan16.Tugas2;
    import java.util.Scanner;
    import java.util.List;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Comparator;
    
    public class nilaiMain {
        String kodeNil;
        double nilai;
        mahasiswa mhs;
        mataKuliah mk;
        
        public nilaiMain(String kodeNil, double nilai, mahasiswa mhs, mataKuliah mk){
            this.kodeNil = kodeNil;
            this.nilai = nilai;
            this.mhs = mhs;
            this.mk = mk;
        }
        List<mahasiswa> mhsA = new ArrayList<>();
        List<mataKuliah> matkulA = new ArrayList<>();
        
        public void tambahMhs(mahasiswa... mahasiswa){
            mhsA.addAll(Arrays.asList(mahasiswa));
        }
        public void tambahMatkul(mataKuliah... matkul){
            matkulA.addAll(Arrays.asList(matkul));
        }
        public void tampilMhs(){
            mhsA.stream().forEach(mhs -> {
                    System.out.println("" + mhs.toString());
            });
        }
        public void tampilMatkul(){
            matkulA.stream().forEach(mk -> {
                    System.out.println("" + mk.toString());
            });
        }
        int linearSearchMhs(String nim){
                for(int i = 0; i < mhsA.size(); i++){ 
                    if(nim.equals(mhsA.get(i).nim)){
                        return i;
                    }
                }
                return -1;
        }
        int linearSearchMatkul(String matkul){
                for(int i = 0; i < matkulA.size(); i++){ 
                    if(matkul.equals(matkulA.get(i).kodeMk)){
                        return i;
                    }
                }
                return -1;
        }
        mahasiswa cariMhs(String nim){
            for(int i = 0; i < mhsA.size(); i++){
                if(nim.equals(mhsA.get(i).nim)){
                    return mhsA.get(i);
                }
            }
            return null;
        }
        mataKuliah cariMatkul(String matkul){
            for(int i = 0; i < matkulA.size(); i++){
                if(matkul.equals(matkulA.get(i).kodeMk)){
                    return matkulA.get(i);
                }
            }
            return null;
        }
        public String toString(int idx1, int idx2){
            return mhsA.get(idx1).nim + "\t" + mhsA.get(idx1).nama + "\t" + matkulA.get(idx2).namaMk + "\t" + matkulA.get(idx2).sks + "\t";
        }
        
        static Comparator<nilaiMain> CompNilai = (n1, n2) ->{
            if(n1.nilai < n2.nilai){
                return -1;
            } else if (n1.nilai > (n2).nilai){
                return 1;
            } else {
                return 0;
            }
        };
        //main 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Scanner sd = new Scanner(System.in);
            Scanner sb = new Scanner(System.in);
            
            List<nilaiMain> nill = new ArrayList<>();
            nilaiMain n = new nilaiMain("", 0, null, null);
            
            mahasiswa m1 = new mahasiswa("20001", "Thalhah", "021xxx");
            mahasiswa m2 = new mahasiswa("20002", "Zubair", "021xxx");
            mahasiswa m3 = new mahasiswa("20003", "Abdur-Rahman", "021xxx");
            mahasiswa m4 = new mahasiswa("20004", "Sa'ad", "021xxx");
            mahasiswa m5 = new mahasiswa("20005", "Sa'id", "021xxx");
            mahasiswa m6 = new mahasiswa("20006", "Ubaidah", "021xxx");
            
            n.tambahMhs(m1, m2, m3, m4, m5, m6);
            
            mataKuliah mk1 = new mataKuliah("0001", "Internet of Things", 3);
            mataKuliah mk2 = new mataKuliah("0002", "Algoritma dan Struktur Data", 2);
            mataKuliah mk3 = new mataKuliah("0003", "Algoritma dan Pemrograman", 2);
            mataKuliah mk4 = new mataKuliah("0004", "Praktikum Algoritma dan Struktur Data", 3);
            mataKuliah mk5 = new mataKuliah("0005", "Algoritma dan Struktur Data", 3);
            
            n.tambahMatkul(mk1, mk2, mk3, mk4, mk5);
            
            nilaiMain n1 = null;
            String nimMhs, mkMhs;
            
            int menu = 0;
            do{
                System.out.println("+===================================================+");
                System.out.println("+ Sistem Pengelolahan Data Nilai Mahasiswa Semester +");
                System.out.println("+===================================================+");
                System.out.println(" 1. Input Nilai");
                System.out.println(" 2. Tampil Nilai");
                System.out.println(" 3. Mencari Nilai Mahasiswa");
                System.out.println(" 4. Urut Data Nilai");
                System.out.println(" 5. Keluar");
                System.out.println("+==================================================+");
                System.out.print("Pilih\t\t\t\t: ");
                menu = sd.nextInt();
                System.out.println("");
                
                switch(menu){
                    case 1 :
                        System.out.print("Kode\t\t\t\t: ");
                        String kd = sc.nextLine();
                        System.out.print("Nilai\t\t\t\t: ");
                        double nilMhs = sb.nextDouble();
                        System.out.println("");
                        
                        System.out.println("                    Daftar Mahasiswa               ");
                        System.out.println("====================================================");
                        System.out.println("NIM\tNama\t\tNo Telp");
                        n.tampilMhs();
                        System.out.println("---------------------------------------------------");
                        System.out.print("Pilih Mahasiswa by nim\t\t: ");
                        nimMhs = sc.nextLine();
                        mahasiswa mahaSiswas;
                        mahaSiswas = n.cariMhs(nimMhs);
                        
                        System.out.println("");
                        System.out.println("                    Daftar Mata Kuliah              ");
                        System.out.println("====================================================");
                        System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
                        n.tampilMatkul();
                        System.out.println("---------------------------------------------------");
                        System.out.print("Pilih Mata Kuliah by Kode\t:");
                        mkMhs = sc.nextLine();
                        mataKuliah mataKuliahs;
                        mataKuliahs = n.cariMatkul(mkMhs);
                        
                        n1 = new nilaiMain(kd, nilMhs, mahaSiswas, mataKuliahs);
                        
                        nill.add(n1);
                        System.out.println("");
                        break;
                        
                    case 2:
                        System.out.println("                  Daftar Nilai Mahasiswa           ");
                        System.out.println("====================================================");
                        System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                        for(int i=0; i<nill.size(); i++){
                            n.linearSearchMhs(nill.get(i).mhs.nim);
                            n.linearSearchMatkul(nill.get(i).mk.kodeMk);
                            System.out.println(n.toString(n.linearSearchMhs(nill.get(i).mhs.nim), n.linearSearchMatkul(nill.get(i).mk.kodeMk))+ nill.get(i).nilai);
                        }
                        System.out.println("");
                        break;
                        
                    case 3:
                        System.out.println("                  Daftar Nilai Mahasiswa           ");
                        System.out.println("====================================================");
                        System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                        int sks = 0;
                        for(int i=0; i<nill.size(); i++){
                            n.linearSearchMhs(nill.get(i).mhs.nim);
                            n.linearSearchMatkul(nill.get(i).mk.kodeMk);
                            System.out.println(n.toString(n.linearSearchMhs(nill.get(i).mhs.nim), n.linearSearchMatkul(nill.get(i).mk.kodeMk))+ nill.get(i).nilai);
                        }
                        System.out.println("---------------------------------------------------");
                        System.out.print("Masukkan Data Mahasiswa NIM\t\t: ");
                        String input = sc.nextLine();
                        System.out.println("");
                        for (int i = 0; i < nill.size(); i++){
                            if(input.equalsIgnoreCase(nill.get(i).mhs.nim)){
                                sks += n.matkulA.get(i).sks;
                                n.linearSearchMhs(nill.get(i).mhs.nim);
                                n.linearSearchMatkul(nill.get(i).mk.kodeMk);
                                System.out.println(n.toString(n.linearSearchMhs(nill.get(i).mhs.nim), n.linearSearchMatkul(nill.get(i).mk.kodeMk)) + nill.get(i).nilai);    
                            }
                        }
                        System.out.println("---------------------------------------------------");
                        System.out.println("Total SKS " + sks + " Telah Diambil");
                        System.out.println("");
                        break;
                        
                    case 4:
                        System.out.println("                  Daftar Mahasiswa                 ");
                        System.out.println("====================================================");
                        System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                        nill.sort(CompNilai);
                        for (int i = 0; i < nill.size(); i++){
                            n.linearSearchMhs(nill.get(i).mhs.nim);
                            n.linearSearchMatkul(nill.get(i).mk.kodeMk);
                            System.out.println(n.toString(n.linearSearchMhs(nill.get(i).mhs.nim), n.linearSearchMatkul(nill.get(i).mk.kodeMk)) + nill.get(i).nilai);
                        }
                        System.out.println("");
                        break;
                        
                    case 5:
                        System.out.println("+==================================================+");
                        System.out.println("+                    Terima Kasih                  +");
                        System.out.println("+==================================================+");
                        break;
                }
            } while (menu < 5 && menu > 0);
        }
    }
    ```
    <br>
