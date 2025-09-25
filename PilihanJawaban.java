public class PilihanJawaban {
    private String teksPilihan;
    private boolean benar;

    public PilihanJawaban(String teksPilihan, boolean benar) {
        this.teksPilihan = teksPilihan;
        this.benar = benar;
    }

    public String getTeksPilihan() {
        return teksPilihan;
    }

    public boolean isBenar() {
        return benar;
    }
}