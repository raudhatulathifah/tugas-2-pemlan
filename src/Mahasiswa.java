// Nama : Raudhatul Athifah
// NIM : 235150407111010
// Kelas : SI-A

public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String tambah;

    public Mahasiswa(String nim, String nama, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
