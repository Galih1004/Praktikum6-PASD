import java.util.Scanner;

public class DosenMain {

    public static void main(String[] args) {

        Scanner sc        = new Scanner(System.in);
        DataDosen dd      = new DataDosen();
        int pilihan;

        do {
            System.out.println();
            System.out.println("============================================");
            System.out.println("   MENU DATA DOSEN - ALGORITMA SORTING     ");
            System.out.println("============================================");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (termuda -> tertua) [Bubble Sort]");
            System.out.println("4. Sorting DSC (tertua -> termuda) [Selection Sort]");
            System.out.println("5. Insertion Sort ASC (termuda -> tertua)");
            System.out.println("0. Keluar");
            System.out.println("============================================");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Kode Dosen    : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama Dosen    : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkStr = sc.nextLine();
                    boolean jk = jkStr.equalsIgnoreCase("L");
                    System.out.print("Usia          : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    TgsDosen14 dsn = new TgsDosen14(kode, nama, jk, usia);
                    dd.tambah(dsn);
                    System.out.println("Data dosen berhasil ditambahkan.");
                    break;

                case 2:
                    dd.tampil();
                    break;

                case 3:
                    dd.SortingASC();
                    dd.tampil();
                    break;

                case 4:
                    dd.sortingDSC();
                    dd.tampil();
                    break;

                case 5:
                    dd.insertionSort();
                    dd.tampil();
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}