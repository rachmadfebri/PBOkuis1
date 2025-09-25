public class Artikel extends Konten {
    private String isiArtikel;

    public Artikel(int idKonten, String judul, String deskripsi, String isiArtikel) {
        super(idKonten, judul, deskripsi);
        this.isiArtikel = isiArtikel;
    }

    public String getIsiArtikel() {
        return isiArtikel;
    }

    public void setIsiArtikel(String isiArtikel) {
        this.isiArtikel = isiArtikel;
    }

    @Override
    public void tampilkanKonten() {
        System.out.println("Artikel: " + getJudul());
        System.out.println("Deskripsi: " + getDeskripsi());
        System.out.println("Isi: " + isiArtikel);
    }
}
