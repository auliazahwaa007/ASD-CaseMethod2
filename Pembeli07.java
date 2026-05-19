public class Pembeli07 {
    String namaPembeli;
    String noHp;

    public Pembeli07(String namaPembeli, String noHp) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }
    public void tampilInformasiPembeli() {
        System.out.printf(" %-15s %-15s\n", namaPembeli, noHp);
    }
}