public class Pesanan07 {
    int kodePesanan;
    String namaPesanan;
    int harga;

    public Pesanan07(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }
    public void tampilPesanan() {
        System.out.printf("%-15d %-20s %-10d\n", kodePesanan, namaPesanan, harga);
    }
}