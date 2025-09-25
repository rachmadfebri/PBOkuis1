public abstract class Konten {
    private int idKonten;
    private String judul;
    private String deskripsi;

    public Konten(int idKonten, String judul, String deskripsi) {
        this.idKonten = idKonten;
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    public int getIdKonten() {
        return idKonten;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public abstract void tampilkanKonten();
}
