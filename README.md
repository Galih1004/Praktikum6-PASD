===========================================================
PERTANYAAN 5.2.5 (Praktikum 1 - Sorting Integer)

PERTANYAAN 1;
Jelaskan fungsi kode program berikut:

    if (data[j-1] > data[j]) {
        temp = data[j];
        data[j] = data[j-1];
        data[j-1] = temp;
    }

JAWABAN:
Kode tersebut adalah inti dari algoritma Bubble Sort, yaitu proses
penukaran (swap) dua elemen yang berdekatan.

Penjelasan baris per baris:
- if (data[j-1] > data[j])
    Kondisi ini memeriksa apakah elemen di posisi kiri (j-1) lebih
    besar dari elemen di posisi kanan (j). Jika ya, berarti urutan
    keduanya SALAH (untuk pengurutan ascending), sehingga perlu ditukar.

- temp = data[j];
    Nilai elemen kanan (data[j]) disimpan sementara ke variabel 'temp'
    agar tidak hilang saat nilai posisi tersebut ditimpa.

- data[j] = data[j-1];
    Nilai elemen kiri (data[j-1]) dipindahkan ke posisi kanan (data[j]).

- data[j-1] = temp;
    Nilai yang sudah disimpan di 'temp' (nilai asli data[j]) dipindahkan
    ke posisi kiri (data[j-1]).

Hasil: elemen yang lebih besar berpindah ke kanan (menggelembung/bubble
ke ujung kanan), sehingga setelah seluruh iterasi selesai, array menjadi
terurut secara ascending.

Contoh:
  Sebelum: data[j-1] = 20, data[j] = 10  → 20 > 10, ditukar
  Sesudah: data[j-1] = 10, data[j] = 20  ✓


----------------------------------------------------------------
PERTANYAAN 2:
Tunjukkan kode program yang merupakan algoritma pencarian nilai
minimum pada Selection Sort!

JAWABAN:
Kode pencarian nilai minimum pada Selection Sort adalah:

    int min = i;
    for (int j = i+1; j < jumData; j++) {
        if (data[j] < data[min]) {
            min = j;
        }
    }

Penjelasan:
- int min = i;
    Asumsikan elemen di posisi i adalah nilai minimum sementara.

- for (int j = i+1; j < jumData; j++)
    Loop dari posisi i+1 sampai akhir array untuk memeriksa
    apakah ada nilai yang lebih kecil dari nilai minimum sementara.

- if (data[j] < data[min]) { min = j; }
    Jika ditemukan nilai yang lebih kecil, perbarui indeks minimum
    menjadi j (posisi nilai yang lebih kecil tersebut).

Setelah loop selesai, variabel 'min' menyimpan indeks elemen terkecil
dari posisi i hingga akhir array, lalu elemen tersebut ditukar dengan
elemen di posisi i.


----------------------------------------------------------------
PERTANYAAN 3:
Pada Insertion Sort, jelaskan maksud dari kondisi pada perulangan:
    while (j >= 0 && data[j] > temp)

JAWABAN:
Kondisi while tersebut memiliki DUA syarat yang keduanya harus terpenuhi
agar perulangan berlanjut:

1. j >= 0
   Memastikan indeks j tidak keluar batas (out of bounds) ke kiri.
   Ketika j bernilai negatif, berarti kita sudah mencapai awal array
   dan tidak ada lagi elemen yang perlu digeser.

2. data[j] > temp
   Memeriksa apakah elemen pada posisi j lebih besar dari elemen yang
   sedang disisipkan (temp). Jika ya, elemen data[j] harus digeser ke
   kanan (ke posisi j+1) untuk memberi ruang bagi temp.

Gabungan kedua kondisi:
Perulangan terus berjalan SELAMA masih ada elemen di sebelah kiri (j>=0)
DAN elemen tersebut lebih besar dari temp. Begitu salah satu kondisi
tidak terpenuhi, perulangan berhenti dan temp disisipkan di posisi j+1.

Contoh: array = [2, 7, 10, 20], temp = 5 (dari index 4)
  - j=3: data[3]=20 > 5 → geser 20 ke kanan, j=2
  - j=2: data[2]=10 > 5 → geser 10 ke kanan, j=1
  - j=1: data[1]=7  > 5 → geser 7  ke kanan, j=0
  - j=0: data[0]=2  > 5? TIDAK → berhenti
  - Sisipkan temp (5) di posisi j+1 = 1
  Hasil: [2, 5, 7, 10, 20] ✓


----------------------------------------------------------------
PERTANYAAN 4:
Pada Insertion Sort, apakah tujuan dari perintah:
    data[j+1] = data[j];

JAWABAN:
Perintah data[j+1] = data[j] bertujuan untuk MENGGESER elemen di posisi
j satu langkah ke kanan (ke posisi j+1), sehingga posisi j menjadi
kosong/bebas untuk menerima elemen baru yang lebih kecil.

Ini adalah mekanisme inti Insertion Sort: alih-alih menukar dua elemen
(seperti Bubble Sort), Insertion Sort menggeser elemen-elemen yang lebih
besar satu per satu ke kanan untuk membuat "ruang" bagi elemen yang akan
disisipkan.

Analogi: seperti menyisipkan kartu remi ke dalam tangan — kartu-kartu
yang lebih besar digeser ke kanan, lalu kartu baru diletakkan di tempat
yang tepat.


==============================================================
PERTANYAAN 5.3.4 (Praktikum 2 - Bubble Sort Array of Object)

PERTANYAAN 1a:
Mengapa syarat dari perulangan i adalah i < listMhs.length - 1?

JAWABAN:
Perulangan i hanya berjalan sampai length-2 (bukan length-1) karena:
- Pada setiap tahap i, elemen terbesar (atau terkecil) sudah
  "menggelembung" ke posisi akhir dan tidak perlu dibandingkan lagi.
- Pada iterasi terakhir (i = length-2), hanya tersisa 2 elemen yang
  dibandingkan. Setelah itu, hanya 1 elemen tersisa di awal, dan 1
  elemen tidak perlu dibandingkan dengan dirinya sendiri.
- Jika syaratnya i < length (bukan length-1), iterasi terakhir tidak
  akan melakukan perbandingan apapun (perulangan j tidak akan berjalan)
  sehingga hanya membuang waktu.


PERTANYAAN 1b:
Mengapa syarat dari perulangan j adalah j < listMhs.length - i?

JAWABAN:
Setiap kali perulangan luar (i) bertambah 1, elemen paling akhir dari
sisa array sudah pasti berada di posisi yang benar (sudah terurut).
Karena itu, perulangan dalam (j) tidak perlu lagi memeriksa elemen-elemen
yang sudah terurut di bagian belakang.

Contoh dengan 5 data:
  - i=0: j berjalan dari 1 sampai 4 (length-0-1=4) → 4 perbandingan
  - i=1: j berjalan dari 1 sampai 3 (length-1-1=3) → 3 perbandingan
  - i=2: j berjalan dari 1 sampai 2 → 2 perbandingan
  - i=3: j berjalan dari 1 sampai 1 → 1 perbandingan
  Total: 4+3+2+1 = 10 perbandingan (efisien, tidak mengulang yang sudah benar)


PERTANYAAN 1c:
Jika banyak data di dalam listMhs adalah 50, berapakali perulangan i
akan berlangsung? Dan ada berapa tahap bubble sort yang ditempuh?

JAWABAN:
- Perulangan i berjalan dari i=0 sampai i=48 (yaitu length-1 = 50-1 = 49 kali).
- Jumlah TAHAP Bubble Sort = 49 tahap.
- Total perbandingan = 49 + 48 + 47 + ... + 1 = (49 × 50) / 2 = 1.225 perbandingan.

Catatan: "Tahap" dalam bubble sort = satu kali putaran perulangan luar (i).
Setiap tahap memastikan satu elemen sudah berada di posisi akhirnya yang benar.


PERTANYAAN 2:
Modifikasi program agar data mahasiswa bersifat dinamis (input keyboard).

JAWABAN (Kode ada di MahasiswaBerprestasi.java, method tambahDariKeyboard()):

    void tambahDariKeyboard() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < listMhs.length; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            listMhs[i] = new Mahasiswa(nim, nama, kelas, ipk);
            System.out.println("------------------------------");
        }
    }

Cara penggunaan di main():
    MahasiswaBerprestasi list = new MahasiswaBerprestasi();
    list.tambahDariKeyboard();  // input dari keyboard
    list.tampil();
    list.bubbleSort();
    list.tampil();


==================================================================
PERTANYAAN 5.3.7 (Praktikum 2 - Selection Sort Array of Object)

PERTANYAAN:
Di dalam method selection sort, terdapat baris program berikut.
Untuk apakah proses tersebut?

    int idxMin = i;
    for (int j = i+1; j < listMhs.length; j++) {
        if (listMhs[j].ipk < listMhs[idxMin].ipk) {
            idxMin = j;
        }
    }

JAWABAN:
Proses tersebut adalah algoritma PENCARIAN INDEKS ELEMEN MINIMUM dari
sisa bagian array yang belum terurut.

Penjelasan:
- int idxMin = i;
    Asumsikan bahwa elemen di posisi i (posisi awal iterasi saat ini)
    adalah elemen dengan IPK terkecil. idxMin menyimpan INDEKS dari
    elemen minimum sementara.
- for (int j = i+1; j < listMhs.length; j++)
    Telusuri semua elemen setelah posisi i untuk mencari apakah ada
    mahasiswa dengan IPK yang lebih kecil dari yang ada di idxMin.
- if (listMhs[j].ipk < listMhs[idxMin].ipk) { idxMin = j; }
    Jika ditemukan mahasiswa dengan IPK lebih kecil, perbarui idxMin
    menjadi j (posisi mahasiswa dengan IPK terkecil yang ditemukan).

Setelah loop selesai, idxMin berisi indeks mahasiswa dengan IPK TERKECIL
dari posisi i hingga akhir array. Kemudian dilakukan swap (tukar) antara
elemen di posisi i dengan elemen di posisi idxMin, sehingga mahasiswa
dengan IPK terkecil berpindah ke depan (ascending).


=============================================================
PERTANYAAN 5.4.3 (Praktikum 2 - Insertion Sort Descending)


PERTANYAAN:
Ubahlah fungsi pada InsertionSort sehingga dapat melaksanakan
proses sorting dengan cara descending!

JAWABAN:
Perubahan hanya pada kondisi while — tanda perbandingan diubah
dari > menjadi < :

SEBELUM (Ascending):
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk > temp.ipk) {  // > untuk ASC
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

SESUDAH (Descending):
    void insertionSortDesc() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) {  // < untuk DESC
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

