// Kelas BukuNonFiksi (turunan dari Buku)
public class BukuNonFiksi extends Buku {
  private String subjek;

  public BukuNonFiksi(String judul, String penulis, int tahunTerbit, String subjek) {
    super(judul, penulis, tahunTerbit);
    this.subjek = subjek;
  }

  // Method override tampilkanInfo
  @Override
  public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Subjek\t\t: " + subjek);
  }
}