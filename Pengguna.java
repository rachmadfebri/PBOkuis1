public class Pengguna {

    private int id;
    private String nama;
    private String email;
    private String password;
    
    Pengguna(int id, String nama, String email, String password) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.password = password;    
    }
    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }
    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }
     public String getPassword() { 
        return password; 
    }
    public void setPassword(String password) { 
        this.password = password; 
    }
    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("login berhasil.");
            return true;
        } else {
            System.out.println("login gagal, email atau password salah!");
            return false;
        }
    }
    public void logout() {
        System.out.println("Pengguna " + nama + " berhasil logout.");
    }
}