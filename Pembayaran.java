import java.util.Date;

public class Pembayaran {
    private int idPembayaran;
    private Date tanggal;
    private double jumlah;

    public Pembayaran(int idPembayaran, Date tanggal, double jumlah) {
        this.idPembayaran = idPembayaran;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
    }

    public int getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public boolean prosesPembayaran() {
        if (jumlah > 0) {
            System.out.println("Pembayaran berhasil diproses.");
            return true;
        } else {
            System.out.println("Pembayaran gagal. Jumlah tidak valid.");
            return false;
        }
    }

    public void cetakPembayaran() {
        System.out.println("====== KWITANSI PEMBAYARAN ======");
        System.out.println("ID Pembayaran : " + idPembayaran);
        System.out.println("Tanggal       : " + tanggal);
        System.out.println("Jumlah        : Rp " + jumlah);
        System.out.println("=================================");
    }
}