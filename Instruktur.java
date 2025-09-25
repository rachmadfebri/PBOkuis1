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
}
