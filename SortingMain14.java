public class SortingMain14 {
    public static void main(String[] args) {

        System.out.println("  PERCOBAAN 1A - BUBBLE SORT");
        int a[] = {20, 10, 2, 7, 12};
        Sorting14 dataurut1 = new Sorting14(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        System.out.println();
        System.out.println("  PERCOBAAN 1B - SELECTION SORT");
        int b[] = {30, 20, 2, 8, 14};
        Sorting14 dataurut2 = new Sorting14(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT");
        dataurut2.tampil();

        System.out.println();
        System.out.println("  PERCOBAAN 1C - INSERTION SORT");
        int c[] = {40, 10, 4, 9, 3};
        Sorting14 dataurut3 = new Sorting14(c, c.length);
        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT");
        dataurut3.tampil();
    }
}