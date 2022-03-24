package Pertemuan5;

public class Tugas1 {
    public int jumlah;
    public String[] kandidat;

    Tugas1(int jum) {
        this.jumlah = jum;
        this.kandidat = new String[jum];
    }

    public int modArr(String[] nama, int awal, int panjang, int hasil) {
        int mid = panjang / 2;
        int endArrLeft = mid - 1;
        int endArrRight = panjang - 1;
        return rekDC(nama, awal, hasil, endArrRight, endArrLeft, mid);
    }

    public int rekDC(String[] nama, int awal, int hasil, int endArrRight, int endArrLeft, int mid) {
        if (endArrRight == (endArrLeft + 1) && endArrLeft == (awal + 1)) {
            return hasil;
        } else {
            if (awal != endArrLeft) {
                if (nama[awal].equalsIgnoreCase(nama[endArrLeft])) {
                    return hasil = awal;
                } else {
                    return rekDC(nama, awal, hasil, endArrRight, (endArrLeft - 1), mid);
                }
            } else {
                if (nama[mid].equalsIgnoreCase(nama[endArrRight])) {
                    return hasil = mid;
                } else {
                    return rekDC(nama, mid, hasil, (endArrRight - 1), endArrLeft, mid);
                }
            }
        }
    }
}
