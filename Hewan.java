public class Hewan {
    private String nama;
    private String jenis;
    private int umur;

    // Constructor overloading
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public Hewan(String nama, String jenis, int umur) {
        this(nama, jenis);
        this.umur = umur;
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode bunyi() sebagai contoh polymorphism
    public void bunyi() {
        System.out.println("Hewan berbunyi...");
    }
}
