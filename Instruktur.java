import java.util.List;

public class Instruktur extends Pengguna {
    private String keahlian;

    public Instruktur(int id, String nama, String email, String keahlian, String password) {
        super(id, nama, email, password);
        this.keahlian = keahlian;
    }
    public String getKeahlian() { 
        return keahlian; 
    }
    public void setKeahlian(String keahlian) { 
        this.keahlian = keahlian; 
    }
    public Kursus buatKursus(String namaKursus, String deskripsi, double harga) {
        return new Kursus(1, namaKursus, deskripsi, harga);
    }

    public void editKonten(Konten k) {
        System.out.println("Instruktur " + getNama() + " mengedit konten " + k.getJudul());
    }

    public List<Konten> lihatKursus() {
        System.out.println("Instruktur " + getNama() + " melihat daftar kursus yang dibuat.");
        return null;
    }
}
