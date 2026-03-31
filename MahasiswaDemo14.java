public class MahasiswaDemo14 {

    public static void main(String[] args) {
        System.out.println("  PERCOBAAN 2A - BUBBLE SORT");
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        Mahasiswa14 m1 = new Mahasiswa14("123", "Zidan", "2A", 3.2);
        Mahasiswa14 m2 = new Mahasiswa14("124", "Ayu",   "2A", 3.5);
        Mahasiswa14 m3 = new Mahasiswa14("125", "Sofi",  "2A", 3.1);
        Mahasiswa14 m4 = new Mahasiswa14("126", "Sita",  "2A", 3.9);
        Mahasiswa14 m5 = new Mahasiswa14("127", "Miki",  "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("  PERCOBAAN 2B - SELECTION SORT (ASC IPK)");
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT");
        list.selectionSort();
        list.tampil();

        System.out.println("  PERCOBAAN 2C - INSERTION SORT (ASC IPK)");
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT");
        list.insertionSort();
        list.tampil();

        System.out.println("  PERTANYAAN 5.4.3 - INSERTION SORT DESC");
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT");
        list.insertionSortDesc();
        list.tampil();
    }
}