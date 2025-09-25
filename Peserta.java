import java.util.List;

public class Peserta extends Pengguna{

    public Peserta(int id, String nama, String email, String password) {
        super(id, nama, email, password);
    }
     public void daftarKursus(Kursus k) {
        System.out.println(getNama() + " mendaftar ke kursus " + k.getNamaKursus());
    }
}
