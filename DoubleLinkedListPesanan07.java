public class DoubleLinkedListPesanan07 {
    NodePesanan07 head;
    NodePesanan07 tail;
    
    public DoubleLinkedListPesanan07() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addLast(Pesanan07 pesanan) {
        NodePesanan07 newNode =
                new NodePesanan07(pesanan);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void sorting() {
        if (isEmpty()) {
            return;
        }
        boolean tukar;
        do {
            tukar = false;
            NodePesanan07 current = head;
            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(
                        current.next.pesanan.namaPesanan) > 0) {
                    Pesanan07 temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }
        sorting();
        NodePesanan07 current = head;
        System.out.println("===========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("===========================================");
        System.out.printf("%-15s %-20s %-10s\n",
                "Kode Pesanan",
                "Nama Pesanan",
                "Harga");
        while (current != null) {
            current.pesanan.tampilPesanan();
            current = current.next;
        }
    }
}
