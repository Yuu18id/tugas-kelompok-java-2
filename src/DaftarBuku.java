import java.util.ArrayList;

public class DaftarBuku {
    private ArrayList<Buku> daftarBuku;

    public DaftarBuku() {
        this.daftarBuku = new ArrayList<>();
    }

    public ArrayList<Buku> getDaftarBuku() {
        return this.daftarBuku;
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void hapusBuku(Buku buku) {
        daftarBuku.remove(buku);
    }

    public Buku cariBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }

    public void tampilkanSemuaBuku() {
        for (Buku buku : daftarBuku) {
            buku.tampilkanInfo();
            System.out.println();
        }
    }
}
