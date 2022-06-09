
package Pertemuan11.Tugas3;


public class sllMain {

    public static void main(String[] args) {
        singleLinkedList singLL = new singleLinkedList();
        
        System.out.println("-----------Linked List--------");
        System.out.println("------------------------------");
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
        
        System.out.println("\n-----Isi Stack menjadi----\n");
        singLL.print();
        singLL.peek();
    }
}
