import java.util.Scanner;

public class DosenMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen08 data = new DataDosen08();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutkan Usia (Muda ke Tua)");
            System.out.println("4. Urutkan Usia (Tua ke Muda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIDN: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();

                    String jk;
                    while (true) {
                        System.out.print("Masukkan Jenis Kelamin (L/P): ");
                        jk = sc.nextLine().trim();
                        if (jk.equalsIgnoreCase("L") || jk.equalsIgnoreCase("P")) {
                            break;
                        } else {
                            System.out.println("Input tidak valid! Masukkan 'L' atau 'P'.");
                        }
                    }

                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    data.tambah(new Dosen08(kode, nama, jk, usia));
                    System.out.println("Data dosen berhasil ditambahkan!");
                    break;
                case 2:
                    data.tampilkanSemua();
                    break;
                case 3:
                    data.sortingASC();
                    data.tampilkanSemua();
                    break;
                case 4:
                    data.sortingDSC();
                    data.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
            }
        } while (pilihan != 5);
        sc.close();
    }
}
