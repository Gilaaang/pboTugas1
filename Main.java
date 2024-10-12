public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan peliharaan
        Kucing kucing = new Kucing("Mulan", "Persia", 2);
        Anjing anjing = new Anjing("Rocky", "Husky", 5);

        // Menampilkan informasi hewan
        System.out.println("Kucing:");
        System.out.println("Nama: " + kucing.getNama());
        kucing.bunyi();

        System.out.println("\nAnjing:");
        System.out.println("Nama: " + anjing.getNama());
        anjing.bunyi();

        // Polimorfisme: Menggunakan array untuk menyimpan objek hewan
        System.out.println("\nSemua Hewan:");
        Hewan[] hewan = {kucing, anjing};
        for (Hewan hewan1 : hewan) {
            System.out.println("Nama: " + hewan1.getNama());
            hewan1.bunyi();
        }
    }
}
