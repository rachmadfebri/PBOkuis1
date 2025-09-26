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
        System.out.println("\n=== Kuis: " + getJudul() + " ===");
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
            Pertanyaan p = daftarPertanyaan[i];
            PilihanJawaban[] pilihan = p.getPilihan();

            // jawaban peserta
            PilihanJawaban jawabanUser = pilihan[jawabanPeserta[i]];
            System.out.println("Pertanyaan " + (i + 1));
            System.out.println("Jawaban Peserta = " + jawabanUser.getTeksPilihan());

            // cari jawaban benar
            String jawabanBenar = "";
            for (PilihanJawaban pj : pilihan) {
                if (pj != null && pj.isBenar()) {
                    jawabanBenar = pj.getTeksPilihan();
                    break;
                }
            }
            System.out.println("Jawaban yang benar adalah = " + jawabanBenar);

            // cek kebenaran
            if (jawabanUser.isBenar()) {
                benar++;
            }
            System.out.println();
        }
        return (double) benar / jumlahPertanyaan * 100;
    }

}