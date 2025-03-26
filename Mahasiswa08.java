public class Mahasiswa08 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    Mahasiswa08 (){
    }

    Mahasiswa08 (String nm, String name, String kls, double ip){
        nim=nm;
        nama=name;
        ipk=ip;
        kelas=kls;
    }

    void tampilInformasi(){
        System.out.println("Nama   : "+ nama);
        System.out.println("NIM    : "+ nim);
        System.out.println("Kelas  : "+ kelas);
        System.out.println("IPK    : "+ ipk);
    }
}