public class NodePembeli07 {
    int nomorAntrian;
    Pembeli07 pembeli;
    NodePembeli07 prev;
    NodePembeli07 next;

    public NodePembeli07(int nomorAntrian, Pembeli07 pembeli) {
        this.nomorAntrian = nomorAntrian;
        this.pembeli = pembeli;
        prev = null;
        next = null;
    }
}