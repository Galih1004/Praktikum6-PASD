import java.util.Scanner;

public class MahasiswaDemo14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  (Soal Modifikasi 6.3.3 No.7) ──
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
 
        MahasiswaBerprestasi14 list1 = new MahasiswaBerprestasi14(jumMhs);
 
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.next();
            System.out.print("Nama  : ");
            String nama = sc.next();
            System.out.print("Kelas : ");
            String kelas = sc.next();
            System.out.print("IPK   : ");
            String ip = sc.next();
            Double ipk = Double.parseDouble(ip);
            System.out.println("------------------------------");
            list1.tambah(new Mahasiswa14(nim, nama, kelas, ipk));
        }
 
        list1.tampil();
 
        //  SEQUENTIAL SEARCH
        System.out.println("Pencarian data");
        System.out.print("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
 
        System.out.println("menggunakan sequential searching");
        double posisi = list1.sequentialSearching(cari);
        int pss = (int) posisi;
        list1.tampilPoisisi(cari, pss);
        list1.tampilDataSearch(cari, pss);

        //  BINARY SEARCH
        System.out.println("Pencarian data");
        System.out.print("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari2 = sc.nextDouble();
        System.out.println("------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("------------------------------");
        double posisi2 = list1.findBinarySearch(cari2, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list1.tampilPoisisi(cari2, pss2);
        list1.tampilDataSearch(cari2, pss2);
        sc.close();
    }
}