
package Pertemuan12.Praktikum2;

public class doublelinkedlistMain {

    public static void main(String[] args) throws Exception {
        doublelinkedlist dll = new doublelinkedlist();
        dll.print();
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===============================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===============================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===============================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : "+dll.size());
    }   
}
