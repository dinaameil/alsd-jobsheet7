public class DataDosen08 {
    Dosen08[] daftarDosen = new Dosen08[10];
    int jumlah = 0;

    public void tambah(Dosen08 dsn) {
        if (jumlah < daftarDosen.length) {
            daftarDosen[jumlah] = dsn;
            jumlah++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    public void tampilkanSemua() {
        if (jumlah == 0) {
            System.out.println("Belum ada data dosen.");
        } else {
            for (int i = 0; i < jumlah; i++) {
                daftarDosen[i].tampil();
            }
        }
    }

    public void sortingASC() { 
        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = 0; j < jumlah - i - 1; j++) {
                if (daftarDosen[j].usia > daftarDosen[j + 1].usia) {
                    Dosen08 temp = daftarDosen[j];
                    daftarDosen[j] = daftarDosen[j + 1];
                    daftarDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan (Usia Muda ke Tua)");
    }

    public void sortingDSC() { 
        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = 0; j < jumlah - i - 1; j++) {
                if (daftarDosen[j].usia < daftarDosen[j + 1].usia) {
                    Dosen08 temp = daftarDosen[j];
                    daftarDosen[j] = daftarDosen[j + 1];
                    daftarDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan (Usia Tua ke Muda)");
    }
}
