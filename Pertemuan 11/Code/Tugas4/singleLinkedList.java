
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