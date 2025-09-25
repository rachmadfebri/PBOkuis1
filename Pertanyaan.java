public class Pertanyaan {
    private int idPertanyaan;
    private String teks;
    private PilihanJawaban[] pilihan;
    private int jumlahPilihan;

    public Pertanyaan(int idPertanyaan, String teks, int kapasitasPilihan) {
        this.idPertanyaan = idPertanyaan;
        this.teks = teks;
        this.pilihan = new PilihanJawaban[kapasitasPilihan];
        this.jumlahPilihan = 0;
    }

    public void tambahPilihan(PilihanJawaban pilih) {
        if (jumlahPilihan < pilihan.length) {
            pilihan[jumlahPilihan] = pilih;
            jumlahPilihan++;
        } else {
            System.out.println("Pilihan sudah penuh!");
        }
    }

    public void tampilkanPertanyaan() {
        System.out.println("\nPertanyaan" + idPertanyaan + ": " + teks);
        for (int i = 0; i < jumlahPilihan; i++) {
            System.out.println("   " + (i + 1) + ". " + pilihan[i].getTeksPilihan());
        }
    }

    public PilihanJawaban[] getPilihan() {
        return pilihan;
    }
}