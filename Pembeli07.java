public class Pembeli07 {
    String namaPembeli;
    String noHp;
    String alamat; // modifikasi dengan menambahkan atribut alamat;
    String jenisKelamin; // modifikasi dengan menambahkan atribut jenis kelamin 

    public Pembeli07(String namaPembeli, String noHp, String alamat, String jenisKelamin) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    // memperbarui method tampilInformasiPembeli agar menampilkan data lengkap pembeli
    public void tampilInformasiPembeli() {
        System.out.printf(" %-15s %-15s %-20s %-15s\n", namaPembeli, noHp, alamat, jenisKelamin);
    }
}
    // public Pembeli07(String namaPembeli, String noHp) {
    //     this.namaPembeli = namaPembeli;
    //     this.noHp = noHp;
    // }

    // membuat atau memperbarui kinstruktor agar menerima alamat dan jenis kelamin
    // public void tampilInformasiPembeli() {
    //     System.out.printf(" %-15s %-15s\n", namaPembeli, noHp);
    // }