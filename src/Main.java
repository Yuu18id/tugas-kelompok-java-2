import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaftarBuku daftarBuku = new DaftarBuku();

        // Menambahkan beberapa buku ke dalam daftar
        BukuFiksi bukuFiksi = new BukuFiksi("Harry Potter", "J.K. Rowling", 2001, "Fantasy");
        BukuNonFiksi bukuNonFiksi = new BukuNonFiksi("Introduction to Java Programming", "Daniel Liang", 1998, "Programming");

        daftarBuku.tambahBuku(bukuFiksi);
        daftarBuku.tambahBuku(bukuNonFiksi);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Tampilkan Semua Buku");
            System.out.println("0. Keluar");

            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = scanner.nextLine();
                    System.out.print("Penulis: ");
                    String penulis = scanner.nextLine();
                    System.out.print("Tahun Terbit: ");
                    int tahunTerbit = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline

                    System.out.println("Jenis Buku (1. Fiksi / 2. Non-Fiksi): ");
                    int jenisBuku = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline

                    if (jenisBuku == 1) {
                        System.out.print("Genre: ");
                        String genre = scanner.nextLine();
                        BukuFiksi bukuBaruFiksi = new BukuFiksi(judul, penulis, tahunTerbit, genre);
                        daftarBuku.tambahBuku(bukuBaruFiksi);
                    } else if (jenisBuku == 2) {
                        System.out.print("Topik: ");
                        String topik = scanner.nextLine();
                        BukuNonFiksi bukuBaruNonFiksi = new BukuNonFiksi(judul, penulis, tahunTerbit, topik);
                        daftarBuku.tambahBuku(bukuBaruNonFiksi);
                    } else {
                        System.out.println("Pilihan jenis buku tidak valid.");
                    }
                    break;
                case 2:
                    System.out.print("Judul Buku yang akan dihapus: ");
                    String judulHapus = scanner.nextLine();
                    Buku bukuHapus = daftarBuku.cariBuku(judulHapus);

                    if (bukuHapus != null) {
                        daftarBuku.hapusBuku(bukuHapus);
                        System.out.println("Buku berhasil dihapus.");
                    } else {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Judul Buku yang dicari: ");
                    String judulCari = scanner.nextLine();
                    Buku bukuCari = daftarBuku.cariBuku(judulCari);

                    if (bukuCari != null) {
                        System.out.println("Informasi Buku:");
                        bukuCari.tampilkanInfo();
                    } else {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.println("Semua Buku dalam Daftar:");
                    for (Buku buku : daftarBuku.getDaftarBuku()) {
                        buku.tampilkanInfo();
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih! dari kelompok 5.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

        } while (pilihan != 0);

        scanner.close();
    }
}
