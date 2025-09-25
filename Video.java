public class Video extends Konten {
    private int durasi; //menit
    private String urlVideo;

    public Video(int idKonten, String judul, String deskripsi, int durasi, String urlVideo) {
        super(idKonten, judul, deskripsi);
        this.durasi = durasi;
        this.urlVideo = urlVideo;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    @Override
    public void tampilkanKonten() {
        System.out.println("Video: " + getJudul());
        System.out.println("Durasi: " + durasi + " menit");
        System.out.println("Link: " + urlVideo);
        System.out.println("Deskripsi: " + getDeskripsi());
    }
}
