import java.util.Scanner;

/**
 * Latihan40
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Warna Kepribadian
 */

public class PBO10k10119176Latihan40 {
    public static void main(String[] args) {
        String warnaA;
        String nama;
        warna warna = new warna();
        Scanner scanner = new Scanner(System.in);

        System.out.print(warna.merah + "YUK "
                + warna.normal);
        System.out.print(warna.hijau + "CEK "
                + warna.normal);
        System.out.print(warna.kuning+ "KEPRIBADIANMU "
                + warna.normal);
        System.out.print(warna.birumuda + "DARI "
                + warna.normal);
        System.out.print(warna.ungu + "WARNA "
                + warna.normal);
        System.out.print(warna.biru + "FAVORITMU "
                + warna.normal + "\n");

        System.out.print("\n" + warna.bmerah + warna.putih
                + "\t MERAH \t\t\n" + warna.normal);
        System.out.print(warna.bhijau + warna.putih
                + "\t HIJAU \t\t\n" + warna.normal);
        System.out.print(warna.bkuning + warna.putih
                + "\t KUNING \t\n" + warna.normal);
        System.out.print(warna.bbiru + warna.putih
                + "\t BIRU \t\t\n" + warna.normal);
        System.out.print(warna.bungu + warna.putih
                + "\t UNGU \t\t\n\n" + warna.normal);

        System.out.print("PILIH WARNA FAVORITMU : ");
        warnaA = scanner.next();
        System.out.print("NAMA KAMU : ");
        nama = scanner.next();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + nama.toUpperCase() + "====");
        warna.hasilTest(warnaA);
    }
    
}
