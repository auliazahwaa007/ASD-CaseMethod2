import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListPembeli07 antrian =
                new DoubleLinkedListPembeli07();
        DoubleLinkedListPesanan07 pesanan =
                new DoubleLinkedListPesanan07();
        int pilih;
        int nomorAntrian = 1;
        do {
            System.out.println("=================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    Pembeli07 pembeli = new Pembeli07(nama, hp);
                    antrian.addLast(nomorAntrian, pembeli);
                    nomorAntrian++;
                    break;
                case 2:
                    antrian.print();
                    break;
                case 3:
                    NodePembeli07 keluar = antrian.removeFirst();
                    if (keluar != null) {
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        Pesanan07 ps = new Pesanan07(kode, namaPesanan, harga);
                        pesanan.addLast(ps);
                        System.out.println(keluar.pembeli.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;
                case 4:
                    pesanan.print();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
            System.out.println();
        } while (pilih != 0);
    }
}
