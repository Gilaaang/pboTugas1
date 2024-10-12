public class Kucing extends Hewan {
    public Kucing(String nama, String jenis, int umur) {
        super(nama, jenis, umur);
    }

    // Overriding metode bunyi()
    @Override
    public void bunyi() {
        System.out.println("Meong...");
    }


}
