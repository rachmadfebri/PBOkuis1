import java.util.List;
import java.util.Date;

public class Peserta extends Pengguna{

    public Peserta(int id, String nama, String email, String password) {
        super(id, nama, email, password);
    }
     public void daftarKursus(Kursus k) {
        System.out.println(getNama() + " mendaftar ke kursus " + k.getNamaKursus());
    }
    public List<Kursus> lihatKursusTerdaftar() {
        System.out.println("menampilkan daftar kursus yang diikuti " + getNama());
        return null;
    }
    public Pembayaran bayarKursus(Kursus k) {
        System.out.println(getNama() + " membayar kursus " + k.getNamaKursus() + " sebesar " + k.getHarga());
        return new Pembayaran(1, new Date(), k.getHarga()); 
    }
    public double ambilKuis(Kuis kuis, int[] jawaban) {
        double skor = kuis.evaluasiJawaban(jawaban);
        System.out.println(getNama() + " mendapatkan skor: " + skor + "% pada kuis " + kuis.getJudul());
        return skor;
    }
}