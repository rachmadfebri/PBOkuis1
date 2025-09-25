import java.util.ArrayList;
import java.util.List;

public class Kursus {
    private int idKursus;
    private String namaKursus;
    private String deskripsi;
    private double harga;
    private List<Konten> daftarKonten;

    public Kursus(int idKursus, String namaKursus, String deskripsi, double harga) {
        this.idKursus = idKursus;
        this.namaKursus = namaKursus;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.daftarKonten = new ArrayList<>();
    }

    public void tambahKonten(Konten konten) {
        daftarKonten.add(konten);
    }

    public void lihatKonten() {
        System.out.println("=== Daftar Konten Kursus: " + namaKursus + " ===");
        for (Konten k : daftarKonten) {
            k.tampilkanKonten();
            System.out.println("----------------------------------");
        }
    }

    public int getIdKursus() {
        return idKursus;
    }

    public String getNamaKursus() {
        return namaKursus;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public double getHarga() {
        return harga;
    }
}
