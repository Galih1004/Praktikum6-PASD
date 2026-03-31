public class DataDosen {

    TgsDosen14[] dataDosen = new TgsDosen14[10];
    int idx;
    void tambah(TgsDosen14 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh (maks 10).");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        System.out.println("============ DATA DOSEN ============");
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("------------------------------------");
        }
    }

    // MENU 3 - SORTING ASC berdasarkan USIA (Bubble Sort)
    // Dosen termuda ke dosen tertua
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    TgsDosen14 temp       = dataDosen[j];
                    dataDosen[j]     = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan ASC (termuda -> tertua) menggunakan Bubble Sort.");
    }

    // MENU 4 - SORTING DSC berdasarkan USIA (Selection Sort)
    // Dosen tertua ke dosen termuda
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            TgsDosen14 temp        = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i]      = temp;
        }
        System.out.println("Data berhasil diurutkan DSC (tertua -> termuda) menggunakan Selection Sort.");
    }

    // INSERTION SORT ASC berdasarkan USIA
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            TgsDosen14 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia > temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
        System.out.println("Data berhasil diurutkan ASC menggunakan Insertion Sort.");
    }
}