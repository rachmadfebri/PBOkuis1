public class Main {
    public static void main(String[] args) {
        // 1. Buat instruktur
        Instruktur instruktur = new Instruktur(1, "Andi", "andi@mail.com", "Pemrograman", "12345");
        System.out.println("Instruktur: " + instruktur.getNama() + " ahli di bidang " + instruktur.getKeahlian());

        // 2. Instruktur membuat kursus
        Kursus kursusJava = instruktur.buatKursus("Belajar Java OOP", "Mengenal konsep OOP di Java", 250000);

        // 3. Tambahkan konten ke kursus
        Video video1 = new Video(101, "Pengenalan OOP", "Dasar-dasar OOP", 22, "https://youtu.be/bxOPd_b0rg4?si=bNYpWZQqaWQBmJK-");
        Artikel artikel1 = new Artikel(201, "Ringkasan OOP", "Artikel ringkas tentang OOP", "OOP punya 4 pilar utama: Encapsulation, Inheritance, Polymorphism, Abstraction.");
        Kuis kuis1 = new Kuis(301, "Kuis OOP", "Tes pemahaman dasar OOP", 20, 2);

        // Tambah pertanyaan
        Pertanyaan q1 = new Pertanyaan(1, "Apa singkatan dari OOP?", 3);
        q1.tambahPilihan(new PilihanJawaban("Object Oriented Programming", true));
        q1.tambahPilihan(new PilihanJawaban("Order Of Process", false));
        q1.tambahPilihan(new PilihanJawaban("Only One Program", false));

        Pertanyaan q2 = new Pertanyaan(2, "Berikut yang bukan pilar OOP adalah?", 3);
        q2.tambahPilihan(new PilihanJawaban("Encapsulation", false));
        q2.tambahPilihan(new PilihanJawaban("Abstraction", false));
        q2.tambahPilihan(new PilihanJawaban("Compilation", true));

        kuis1.tambahPertanyaan(q1);
        kuis1.tambahPertanyaan(q2);

        kursusJava.tambahKonten(video1);
        kursusJava.tambahKonten(artikel1);
        kursusJava.tambahKonten(kuis1);

        // 4. Buat peserta
        Peserta peserta = new Peserta(2, "Budi", "budi@mail.com", "abc123");
        peserta.login("budi@mail.com", "abc123");

        // 5. Peserta mendaftar kursus
        peserta.daftarKursus(kursusJava);

        // 6. Peserta membayar kursus
        Pembayaran pembayaran = peserta.bayarKursus(kursusJava);
        if (pembayaran.prosesPembayaran()) {
            pembayaran.cetakPembayaran();
        }

        // 7. Peserta mengerjakan kuis
        int[] jawabanBudi = {0, 2}; // jawaban index: soal 1 -> pilihan 0 (benar), soal 2 -> pilihan 2 (benar)
        peserta.ambilKuis(kuis1, jawabanBudi);

        // 8. Tampilkan semua konten kursus
        kursusJava.lihatKonten();

        // Logout
        peserta.logout();
    }
}
