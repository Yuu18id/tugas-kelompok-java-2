public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;

    // Enkapsulasi untuk judul
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }
    // Akhir enkapsulasi judul

    // Enkapsulasi untuk penulis
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }
    // Akhir enkapsulasi penulis

    // Enkapsulasi untuk tahun terbit
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
    // Akhir enkapsulasi tahun terbit

    // Constructor buku
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Methods tampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul Buku      : " + this.judul);
        System.out.println("Penulis         : " + this.penulis);
        System.out.println("Tahun Terbit    : " + this.tahunTerbit);
    }
}
