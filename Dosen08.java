class Dosen08 {
    String kode, nama, jenisKelamin;
    int usia;

    public Dosen08(String kode, String nama, String jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampil() {
        System.out.println("NIDN         : " + kode);
        System.out.println("Nama Dosen   : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia         : " + usia);
        System.out.println("---------------------------"); 
    }
}    
