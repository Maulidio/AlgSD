# **Laporan Praktikum**

><p>Nama : Maulidio Farhan Rizkullah<p>
>Kelas : 1G-TI | 18 | 2141720041<p>

<br>

### **2.1.2 Pertanyaan Percobaan**
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?<p>
    >Karena pada Binary Search Tree node disusun sudah secara berurutan, yang mana penempatan data berdasarkan Left Child akan selalu lebih kecil dari node induk, dan right child akan selalu lebih besar dari node induk<p>

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?<p>
    >pada class node atribut left berfungsi untuk menyimpan "left child" atau nilai yang lebih kecil dari root (node induk) dan atribut right berfungsi untuk menyimpan "right child" atau nilai yang lebih besar dari root (node induk)<p>

3.  a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?<p>
    b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?<p>
    >a. untuk menyimpan data yang berada pada bagian paling atas tree (root)<p>
    >b. ketika objek tree pertama kali dibuat nilai dari root bernilai null, karena masih belum ada data yang dimasukan<p>

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?<p>
    >akan terjadi proses add()<p> 
    >atau juga disebut operasi Insert (Operasi penambahan data/node pada tree)

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?<p>
    >jika data yang dinputkan lebih kecil dari data yang sudah ada (current.data), maka atribut current akan menyimpan nilai dari current left atau current left akan menadi induk dari data yang baru dimasukkan, dan apabila current left bersifat kosong maka data baru yang dimasukkan akan menjadi current left atau left-child<p>

<br>

### **13.2.1 Pertanyaan Percobaan**
1. Apakah kegunaan dari atribut data dan idxLast yang ada di classBinaryTreeArray?<p>
    >atribut data berfungsi untuk menyimpan data array<p>
    >idx last berfungsi untuk menyimpan batas index

2. Apakah kegunaan dari method populateData()?<p>
    >method populateDate() berfungsi untuk menunjukkan data pada idxLast<p>

3. Apakah kegunaan dari method traverseInOrder()?<p>
    >method traverseInOrder() berfungsi untuk menelusuri tree dengan metode in order dengan perinsip (left Visit Right)<p>

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?<p>
    >jika array dimulai dari 0 maka didapati seperti dibawah ini<p>
    >- Left child = indeks ke 5
    >- Right child = indeks ke 6

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
    >berfungsi untuk menunjukkan idxLast atau batas indeks arraynya adalah 6<p>

<br>



## **13.3 Tugas Praktikum**

1. 
    ```java
    void addNodeR(int key){
        root = addNodeR(root, key);
    }
    //SOAL NO 1
    public node addNodeR(node current, int data){
        if (current == null){
            return new node(data);
        }
        if (data < current.data){
            current.left = addNodeR(current.left, data);
        }else if(data > current.data){
            current.right = addNodeR(current.right, data);
        }else{
            return current;
        }
        return current;
    }
    ```
    

    <br>

2. 
    ```java
    //SOAL NO 2
    void maksimal(){
        node current = root;
        while(current.right != null){
            current = current.right;
        }
        System.out.println(current.data);
    }
    void minimal(){
        node current = root;
        while(current.left != null){
            current = current.left;
        }
        System.out.println(current.data);
    }
    ```
    
    <br>

3. 
    ```java
    //Soal NO 3
    void printLeft(node root){
        if(root == null){
        return;            
        }
        if(root.left == null && root.right == null){
            System.out.print(" "+ root.data);
            return;
        }if(root.left != null){
            printLeft(root.left);
        }if(root.right != null){
            printLeft(root.right);
        }
    }
    ```

    <br>

4. 
    ```java
     //Soal NO 4
    int jumlahLeft(){
        return jumlahLeft(root);
    }
    int jumlahLeft(node node){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return 1;
        }else{
            return jumlahLeft(node.left)+jumlahLeft(node.right);
        }
    }
    ```


    <br>

5. 
    ```java
    package Pertemuan14;

    public class binaryTreeArray {
        int[] data;
        int idxLast;
    
        public binaryTreeArray(){
            data = new int [10];
        }
        void populateData(int data[], int idxLast){
            this.data = data;
            this.idxLast = idxLast;
        }
        void traverseInOrder(int idxStart){
            if(idxStart <= idxLast){
                traverseInOrder(2*idxStart+1);
                System.out.print(data[idxStart]+" ");
                traverseInOrder(2*idxStart+2);
            }
        }
        //SOAL No 5
        void add(int data){
            if(idxLast == this.data.length -1){
                System.out.println("Tree Array sudah Penuh");
            }else{
                this.data[++idxLast] = data;
            }
        }
        void traversePreOrder(int idxStart){
            if(idxStart <= idxLast){
                System.out.print(" "+data[idxStart]);
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
        void traversePostOrder(int idxStart){
            if(idxStart <= idxLast){
                traversePostOrder(2 * idxStart + 1);
                traversePostOrder(2 * idxStart + 2);
                System.out.print(" "+data[idxStart]);
            }
        }
    }
    ```
    main class "binaryTreeArrayMain"<p>
    ```java
    package Pertemuan14;
   
    public class binaryTreeArrayMain {
        
        public static void main(String[] args) {
            binaryTreeArray bta = new binaryTreeArray();
            int [] data = {6,4,8,3,5,7,9,0,0,0};
            int idxLast = 6;
            bta.populateData(data, idxLast);
            bta.traverseInOrder(0);
        
            System.out.println("\n-------------------------------");
            System.out.println("     Hasil Tugas NO 5          ");
            System.out.println("-------------------------------");
            bta.add(90);
            bta.add(72);
            System.out.println("method traverse PreOrder");
            bta.traversePreOrder(0);
            System.out.println();
            System.out.println("method traverse PostOrder");
            bta.traversePostOrder(0);
            System.out.println();
        }
    }
    ```

    <br>
   
