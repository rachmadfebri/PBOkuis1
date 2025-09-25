public class Kuis extends Konten {
    private int waktuPengerjaan;
    private Pertanyaan[] daftarPertanyaan;
    private int jumlahPertanyaan;

    public Kuis(int idKonten, String judul, String deskripsi, int waktuPengerjaan, int kapasitas) {
        super(idKonten, judul, deskripsi); 
        this.waktuPengerjaan = waktuPengerjaan;
        this.daftarPertanyaan = new Pertanyaan[kapasitas];
        this.jumlahPertanyaan = 0;
    }

    public void tampilkanKonten() {
        System.out.println("=== Kuis: " + getJudul() + " ===");
        System.out.println("Waktu Pengerjaan: " + waktuPengerjaan + " menit");
        for (int i = 0; i < jumlahPertanyaan; i++) {
            daftarPertanyaan[i].tampilkanPertanyaan();
        }
    }

    public void tambahPertanyaan(Pertanyaan soal) {
        if (jumlahPertanyaan < daftarPertanyaan.length) {
            daftarPertanyaan[jumlahPertanyaan] = soal;
            jumlahPertanyaan++;
        } else {
            System.out.println("Kapasitas pertanyaan sudah penuh!");
        }
    }

    public double evaluasiJawaban(int[] jawabanPeserta) {
        int benar = 0;
        for (int i = 0; i < jumlahPertanyaan; i++) {
            PilihanJawaban pilih = daftarPertanyaan[i].getPilihan()[jawabanPeserta[i]];
            if (pilih.isBenar()) {
                benar++;
            }
        }
        return (double) benar / jumlahPertanyaan * 100;
    }
}