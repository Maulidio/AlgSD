# **Laporan Praktikum**

><p>Nama : Maulidio Farhan Rizkullah<p>
>Kelas : 1G-TI | 18 | 2141720041<p>

<br>

    
### **2.1.2 Pertanyaan**
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?<p>
    
    >karena linked list (node) masih belum memiliki isi / data, dimana pada sllMain langsung dilakukan pemanggilan method print diawal pemanggilan yang mana node masih belum di isi data sama sekali, sehingga system akan menampilkan "Linked List Kosong"

2. Pada step 10, jelaskan kegunaan kode berikut<p>
    
    >kegunaan potongan kode diatas adalah jika temp.data sama dengan key, maka kode program otomatis mengubah nilai variabel ndInput.next menjadi variabel temp.next serta nantinya pada variable ndInput untuk menyimpan nilainya

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut<p>
    
    >kegunaan potongan kode diatas adalah jika temp.next.next == nul maka akan mengembalikan nilai -1 atau data kosong, dan jika tidak ada kondisi yang terpenuhi sama sekali maka akan mengembalikan nilai dari index yaitu 0

<br>
    
### **2.2.3 Pertanyaan**
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!<p>
   
    >karena keyworad break tersebut berfungsi untuk menghentikan perulangan / loop. terdapat dua break yang ada pada method remove, break yang pertama berfunsgsi untuk jika data yang dihapus ada pada head dan ditemukan maka program akan langsung break, break yang kedua berfungsi untuk jika data yang dihapus berada ditengah dan ditemukan  maka program akan langsung break

2. Jelaskan kegunaan kode dibawah pada method remove<p>
    
    >potongan kode diatas berfungsi untuk jika node yang dipilih memiliki data yang sama (equals) dengan key, maka terjadi perubahan posisi dimana node tersebut akan digantikan oleh node yang selanjutnya

3. Apa saja nilai kembalian yang dapat dikembalikan pada method indexOf? Jelaskan maksud masing-masing kembalian tersebut!<p>
    
    >didalam method indexOf terdapat 2 return, yaitu :
    > + jika tmp == null maka akan mengembalikan nilai -1 atau data kosong
    > + jika tidak ada kondisi yang terpenuhi sama sekali maka akan mengembalikan nilai index yaitu 0

<br>

        
## **3 Tugas**
    
1. Buat method insertBefore untuk menambahkan node sebelum keyword yang diinginkan<p>
    
    >**Jawab**<p>
    >Berikut adalah penambahan method "insertBefore()" yang berada pada class "singleLinkedList"
    ```java
    package Pertemuan11.Tugas1;
    
    public class singleLinkedList {
        node head; //posisi awal linked list
        node tail; //posisi akhir linked list
    
        public boolean isEmpty() {
        return head == null;
        }
        public void print(){
            if(!isEmpty()){
                node tmp = head;
                System.out.print("Isi Linked List\t\t\t: ");
                while(tmp != null){
                    System.out.print(tmp.data +"\t\t");
                    tmp = tmp.next;
                }
                System.out.println("");
            }else{
                System.out.println("Linked List Kosong");
            }
        }
        public void addFirst(int input){
            node ndInput = new node(input, null);
            if(isEmpty()){ //jika linked list kosong
                head = ndInput; //head dan tail sama dengan node input
                tail = ndInput;
            }else{
                ndInput.next = head;
                head = ndInput;
            }
        }
        public void addLast(int input){
            node ndInput = new node(input, null);
            if(isEmpty()){
                head = ndInput; //head dan tail sama dengan node input
                tail = ndInput;
            }else{
                tail.next = ndInput;
                tail = ndInput;
            }
        }
        public void insertAfter(int key, int input){
            node ndInput = new node(input, null);
            node temp = head;
            do {
                if (temp.data == key) {
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    if(ndInput.next == null) tail = ndInput;
                    break;
                }
                temp = temp.next;
            }while (temp != null);
        }
        public void insertAt(int index, int input){
            if (index < 0){
                System.out.println("Indeks salah");
            }else if (index == 0){
                addFirst(input);
            }else {
                node temp = head;
                for(int i=0; i<index-1; i++){
                    temp = temp.next;
                }
                temp.next = new node(input, temp.next);
                if(temp.next.next == null) tail=temp.next;
            }
        }
        public int getData(int index){
            node tmp = head;
            for (int i=0; i<index; i++){
                tmp =  tmp.next;
            }
            return tmp.data;
        }
        public int indexOf(int key){
            node tmp = head;
            int index = 0;
            while (tmp != null && tmp.data != key) {
                tmp = tmp.next;
                index++;
            }
            if (tmp == null){
                return -1;
            }else{
                return index;
            }
        }
        public void removeFirst(){
            if(isEmpty()){
                System.out.println("Linked List Masih Kosong");
            }else if (head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
        }
        public void removeLast() {
            if (isEmpty()){
                System.out.println("Linked List Masih kosong, tidak dapat dihapus!");
            }else if (head == tail){
                head = tail = null;
            }else{
                node temp = head;
                while (temp.next != tail){
                  temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        }
        public void remove(int key){
            if(isEmpty()){
                System.out.println("Linked List Masih kosong, tidak dapat dihapus!");
            }else {
                node temp = head;
                while (temp != null){
                    if((temp.data == key) && (temp == head)){
                        this.removeFirst();
                        break;
                    }else if (temp.next.data == key){
                        temp.next = temp.next.next;
                        if(temp.next == null){
                            tail = temp;
                        }
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
        public void removeAt(int index){
            if(index == 0){
                removeFirst();
            }else{
                node temp = head;
                for(int i=0; i < index-1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                if (temp.next == null){
                    tail = temp;
                }
            }
        }
        public void insertBefore(int key, int input){
            node ndInput = new node(input, null);
            node temp = head;
            node prev = null;
        
            do{
                if(head.data == key){
                    addFirst(input);
                    break;
                }else if (temp.data == key){
                    ndInput.next = temp;
                    prev.next = ndInput;
                    if(temp.next == null){
                        tail = ndInput;
                        break;
                    }
                }
                prev = temp;
                temp = temp.next;
            }while (temp != null);
        }
    }
    ```
    >Berikut adalah modifikasi pada main class "sllMain"
    ```java
    package Pertemuan11.Tugas1;
    
    public class sllMain {
        
        public static void main(String[] args) {
            singleLinkedList singLL = new singleLinkedList();
        
            singLL.print();
            singLL.addFirst(890);
            singLL.print();
            singLL.addLast(760);
            singLL.print();
            singLL.addFirst(700);
            singLL.print();
            singLL.insertAfter(700, 999);
            singLL.print();
            singLL.insertAt(3, 833);
            singLL.print();
            System.out.println("dibawah ini hasil output penambahan method insertBefore()");
            singLL.insertBefore(760, 450);
            singLL.print();
        
            System.out.println("\nData pada index ke-1\t\t: "+singLL.getData(1));
            System.out.println("Data 3 berada pada indeks ke\t: "+singLL.indexOf(760)+"\n");
        
            singLL.remove(999);
            singLL.print();
            singLL.removeAt(0);
            singLL.print();
            singLL.removeFirst();
            singLL.print();
            singLL.removeLast();
            singLL.print();
        }
    }
    ```

<br>

        
2. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah dipelajari sebelumnya untuk menginputkan data.<p>
    >**Jawab**<p>
    >class "node"<p>
    ```java
    package Pertemuan11.Tugas2;
    
    public class node {
        char data;
        node next;
    
        public node(char nilai, node berikutnya){
            this.data = nilai;
            this.next = berikutnya;
        }
    }
    ```
    >class "singleLinkedList"<p>
    ```java
    package Pertemuan11.Tugas2;
    
    public class singleLinkedList {
        node head; //posisi awal linked list
        node tail; //posisi akhir linked list
    
        public boolean isEmpty() {
        return head == null;
        }
        public void print(){
            if(!isEmpty()){
                node tmp = head;
                System.out.print("Isi Linked List\t\t\t: ");
                while(tmp != null){
                    System.out.print(tmp.data +"\t\t");
                    tmp = tmp.next;
                }
                System.out.println("");
            }else{
                System.out.println("Linked List Kosong");
            }
        }
        public void addFirst(char input){
            node ndInput = new node(input, null);
            if(isEmpty()){ //jika linked list kosong
                head = ndInput; //head dan tail sama dengan node input
                tail = ndInput;
            }else{
                ndInput.next = head;
                head = ndInput;
            }
        }
        public void addLast(char input){
            node ndInput = new node(input, null);
            if(isEmpty()){
                head = ndInput; //head dan tail sama dengan node input
                tail = ndInput;
            }else{
                tail.next = ndInput;
                tail = ndInput;
            }
        }
        public void insertAfter(char key, char input){
            node ndInput = new node(input, null);
            node temp = head;
            do {
                if (temp.data == key) {
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    if(ndInput.next == null) tail = ndInput;
                    break;
                }
                temp = temp.next;
            }while (temp != null);
        }
        public void insertAt(int index, char input){
            if (index < 0){
                System.out.println("Indeks salah");
            }else if (index == 0){
                addFirst(input);
            }else {
                node temp = head;
                for(int i=0; i<index-1; i++){
                    temp = temp.next;
                }
                temp.next = new node(input, temp.next);
                if(temp.next.next == null) tail=temp.next;
            }
        }
        public void insertBefore(char key, char input){
            node ndInput = new node(input, null);
            node temp = head;
            node prev = null;
        
            do{
                if(head.data == key){
                    addFirst(input);
                    break;
                }else if (temp.data == key){
                    ndInput.next = temp;
                    prev.next = ndInput;
                    if(temp.next == null){
                        tail = ndInput;
                        break;
                    }
                }
                prev = temp;
                temp = temp.next;
            }while (temp != null);
        }
    }
    ```
    >main class "sllMain"<p>
    ```java
    package Pertemuan11.Tugas2;
    
    public class sllMain { 
        
        public static void main(String[] args) {
            singleLinkedList singLL = new singleLinkedList();
        
            System.out.println("------------------------------------------- LINKED LIST ---------------------------------------------");
            singLL.addFirst('a');
            singLL.print();
            singLL.addLast('e');
            singLL.print();
            singLL.insertAfter('a','b');
            singLL.print();
            singLL.insertAt(2, 'c');
            singLL.print();
            singLL.insertBefore('e', 'd');
            singLL.print();
        
            System.out.println("\nMaka Penambahan data sudah sesuai seperti berikut ini");
            singLL.print();
            System.out.println("\n------------------------------------------- LINKED LIST ---------------------------------------------");
        }
    }
    ```

<br>

        
3. Buatlah Implementasi Stack berikut menggunakan Single Linked List<p>
        
    **Jawab**
        
    >Membuat class "node"
    ```java
    package Pertemuan11.Tugas3;
    
    public class node {
        String data;
        node next;
    
        public node(String nilai, node berikutnya){
            this.data = nilai;
            this.next = berikutnya;
        }
    }
    ```
    >membuat class "singleLinkedList" seperti dibawah ini
    ```java
    package Pertemuan11.Tugas3;
    
    public class singleLinkedList {
        node head; //posisi awal linked list
        node tail; //posisi akhir linked list
    
        public boolean isEmpty() {
        return head == null;
        }
        public void pr(){
            if(!isEmpty()){
                node tmp = head;
                System.out.println("Berhasil menambahkan "+ tmp.data);
            }
        }
        public void print(){
            if(!isEmpty()){
                node tmp = head;
                while(tmp != null){
                    System.out.println(tmp.data);
                    tmp = tmp.next;
                }
                System.out.println();
            }else{
                System.out.println("Linked List Kosong");
            }
        }
        public void peek(){
            if(!isEmpty()){
                node tmp = head;
                System.out.println("Elemen Teratas : "+tmp.data);
            }else{
            System.out.println("Stack Masih Kosong");
            }
        }
        public void push(String input){
            node ndInput = new node(input, null);
            if(isEmpty()){ //jika linked list kosong
                head = ndInput; //head dan tail sama dengan node input
                tail = ndInput;
            }else{
                ndInput.next = head;
                head = ndInput;
            }
        }
    }
    ```
    >membuat main class "sllMain" seperti berikut
    ```java
    package Pertemuan11.Tugas3;
    
    public class sllMain {
        
        public static void main(String[] args) {
            singleLinkedList singLL = new singleLinkedList();
        
            System.out.println("+Linked List"+" "+"\t+");
            System.out.println("-----------------");
            singLL.push("Bahasa");
            singLL.pr();
            singLL.print();
            singLL.push("Android");
            singLL.pr();
            singLL.print();
            singLL.push("Komputer");
            singLL.pr();
            singLL.print();
            singLL.push("Basis Data");
            singLL.pr();
            singLL.print();
            singLL.push("Matematika");
            singLL.pr();
            singLL.print();
            singLL.push("Algoritma");
            singLL.pr();
            singLL.print();
            singLL.push("Statistika");
            singLL.pr();
            singLL.print();
            singLL.push("Multimedia");
            singLL.pr();
            singLL.print();
        
            System.out.println("\nIsi Stack menjadi");
            singLL.print();
            singLL.peek();
        }
    }
    ```

<br>

        
4. Buatlah implementasi program antrian untuk mengilustasikan mahasiswa yang sedang meminta tanda tangan KRS pada dosen DPA di kampus pada tugas jobsheet 8 menggunakan LinkedList. Implementasikan Queue pada antrian mahasiswa dengan menggunakan konsep LinkedList!
            
    **Jawab**
        
    class "node"
        
    ```java
    package Pertemuan11.Tugas4;
   
    public class node {
        String nim, nama;
        int absen;
        double ipk;
        node next;
    
        public node(String nim, String nama, int absen, double ipk, node berikutnya){
            this.nim = nim;
            this.nama = nama;
            this.absen = absen;
            this.ipk =ipk;
            this.next = berikutnya;
        }
    }
    ```
        
    class "singleLinkedList"
        
        
    ```java
    package Pertemuan11.Tugas4;
    
    public class singleLinkedList {
        node head; //posisi awal linked list
        node tail; //posisi akhir linked list
    
        public boolean isEmpty() {
            return head == null;
        }
        public void print(){
            if(!isEmpty()){
                node tmp = head;
                int antrian = 0;
                while(tmp != null){
                    System.out.println("Mahasiswa ke - "+(antrian+1)+" = "+tmp.nim+" "+tmp.nama+" "+tmp.absen+" "+tmp.ipk);
                    tmp = tmp.next;
                    antrian ++;
                }
                System.out.println();
            }else{
                System.out.println("Linked List Kosong");
            }
        }
        public void addLast(String nim, String nama, int absen, double ipk){
            node ndInput = new node(nim, nama, absen, ipk, null);
            if(isEmpty()){
                head = ndInput; //head dan tail sama dengan node input
                tail = ndInput;
            }else{
                tail.next = ndInput;
                tail = ndInput;
            }
        }
        public void peek(){
            if(!isEmpty()){
                node tmp = head;
                System.out.println("Elemen terdepan : "+tmp.nim+ " "+tmp.nama+" "+tmp.absen+" "+tmp.ipk);
            }else{
                System.out.println("Queue masih kosong");
            }
        }
        public void peekRear(){
            if(!isEmpty()){
                node tmp = tail;
                System.out.println("Elemen yang belakang : "+tmp.nama+ " "+tmp.nim+" "+tmp.absen+" "+tmp.ipk);
            }else{
                System.out.println("Queue masih kosong");
            }
        }
        public void cariIndex(int index){
            if(isEmpty()){
                System.out.println("Antrian masih kosong");
            }else{
                node tmp = head;
                for(int i=0; i<index; i++){
                    tmp = tmp.next;
                }
                System.out.println("Data pada index ke-"+index+" "+tmp.nim+" "+tmp.nama+" "+tmp.absen+" "+tmp.ipk);
            }
        }
        public void cariNim(String key){
            node tmp = head;
            int index = 0;
            while (tmp != null &&(!(tmp.nim.equals(key)))) {
                tmp = tmp.next;
                index++;
            }
            if (tmp == null){
                System.out.println("Antrian Kosong");
            }else{
                System.out.println("Data "+key+" berada pada index ke "+index);
            }
            System.out.println("Data Mahasiswa : "+tmp.nim+" "+tmp.nama+" "+tmp.absen+" "+tmp.ipk);
        }
        public void removeFirst(){
            if(isEmpty()){
                System.out.println("Linked List Masih Kosong");
            }else if (head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
        }
    }
    ```
                                      
        
    main class "sllMain"
        
    ```java
    package Pertemuan11.Tugas4;
    import java.util.Scanner;
  
    public class sllMain {
      
        public static void menu(){
            System.out.println("\nPilih Menu ");
            System.out.println(" 1. Antrian baru\n 2. Antrian Keluar\n 3. Cek Antrian Terdepan\n 4. Cek Semua Antrian\n 5. Cek Antrian Paling Belekang\n 6. Cari index Mahasiswa dengan Nim\n 7. Cek data mahasiswa berdasarkan antrian\n 8. Keluar");
            System.out.println("-----------------------------------");
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Scanner sd = new Scanner(System.in);
            Scanner sb = new Scanner(System.in);
        
            singleLinkedList singLL = new singleLinkedList();
    
            int pilih;
            do{
                menu();
                pilih = sc.nextInt();
                sc.nextLine();
        
            switch(pilih){
                case 1:
                    System.out.print("Nim Mahasiswa\t: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama Mahasiswa\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen Mahasiswa\t: ");
                    int absen = sd.nextInt();
                    System.out.print("IPK Mahasiswa\t: ");
                    double ipk = sb.nextDouble();
                    singLL.addLast(nim, nama, absen, ipk);
                    sc.nextLine();
                break;
                
                case 2:
                    singLL.removeFirst();
                    System.out.println("mahasiswa urutan awal berhasil keluar!!!");
                    System.out.println("dengan sisa antrian dibawah ini\n");
                    singLL.print();
                break;
                
                case 3:
                    System.out.println("Berikut adalah antrian mahasiswa terdepan !");
                    singLL.peek();
                break;
                
                case 4:
                    System.out.println("Berikut adalah data semua antrian");
                    singLL.print();
                break;
                
                case 5:
                    System.out.println("Berikut adalah antrian mahasiswa paling belakang !");
                    singLL.peekRear();
                break;
                
                case 6:
                    System.out.println("Pencarian Index Mahasiswa Dengan Nim");
                    System.out.print("Masukkan Nim mahasiswa : ");
                    String nimm = sc.nextLine();
                    singLL.cariNim(nimm);
                break;
                
                case 7:
                    System.out.println("Pencarian data mahasiswa berdasarkan antrian");
                    System.out.print("Masukkan antrian Mahasiswa : ");
                    int antrian = sd.nextInt();
                    singLL.cariIndex(antrian);
                break;
                
                case 8:
                    System.out.println("Terima Kasih Telah menggunakan layanan kami");
                    System.out.println("----------Alvian Nur Firdaus @ 2022--------");
                    System.exit(0);
                break;
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
    }
    }
    ```
        
 <br>