public class DoubleLinkedListPembeli07 {
    NodePembeli07 head;
    NodePembeli07 tail;

    public DoubleLinkedListPembeli07() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addLast(int nomorAntrian, Pembeli07 pembeli) {
        NodePembeli07 newNode = new NodePembeli07( nomorAntrian, pembeli);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomorAntrian);
    }
    public NodePembeli07 removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        }
        NodePembeli07 removed = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return removed;
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        NodePembeli07 current = head;
        int jumlahPembeli = 0; // menambahkan variable untuk menghitung jumlah pembeli yang antri (modifikasi)
        System.out.println("=================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=================================");
        // mengganti format output, karena ditambahi jenis kelamin sama alamat
        System.out.printf("%-12s %-15s %-15s %-20s %-15s\n", "No Antrian", "Nama", "No HP", "Alamat", "Jenis Kelamin");
        // System.out.printf("%-15s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        while (current != null) {
            System.out.printf("%-15d", current.nomorAntrian);
            //menampilkan seluaruh data pembeli
            current.pembeli.tampilInformasiPembeli();
            jumlahPembeli++; //menghitung jumlah antrian
            current = current.next;
        }
        // untuk menampilkan total pembeli yang sedang antri
        System.out.println("============================================");
        System.out.println("Total Pembeli dalam Antrian : " + jumlahPembeli);
    }
}