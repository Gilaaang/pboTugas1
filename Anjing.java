public class Anjing extends Hewan {
    public Anjing(String nama, String jenis, int umur) {
        super(nama, jenis, umur);
    }

    // Overriding metode bunyi()
    @Override
    public void bunyi() {
        System.out.println("guug guug!...");
    }
}
