
import java.util.Scanner;

public class Main {
    static int tanya;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TokoBuku tokobuku = new TokoBuku();

        TextBook textBook1 = new TextBook(1, "Yoga", "Yoga", 100);
        Komik komik1 = new Komik(2, "Naruto", "Masashi Kishimoto", 1000);
        Majalah majalah1 = new Majalah(3, "Bobo", "Bobo", 60);

        tokobuku.tambahBuku(textBook1);
        tokobuku.tambahBuku(komik1);
        tokobuku.tambahBuku(majalah1);

        while (true) {
            tokobuku.ubahIndex();
            do {
                System.out.println("=================================");
                System.out.println("Toko Buku MondstadtMedia");
                System.out.println("=================================");
                System.out.println("1. Data Buku");
                System.out.println("2. Cari Buku");
                System.out.println("3. Transaksi");
                System.out.println("4. Tambah Buku");
                System.out.println("5. Hapus Buku");
                System.out.println("6. Keluar");
                System.out.println("=================================");
                System.out.print("Masukan Pilihan : ");
                tanya = input.nextInt();
            } while (tanya < 1 || tanya > 6);

            if (tanya == 1) {
                tokobuku.tampilDataTabel();
            } else if (tanya == 2) {
                tokobuku.cariBuku();
            } else if (tanya == 3) {
                tokobuku.transaksi();
            } else if (tanya == 4) {
                tokobuku.tambahData();
            } else if (tanya == 5) {
                tokobuku.hapusData();
            } else {
                System.out.println("=================================");
                System.out.println("Terima Kasih Telah Berkunjung");
                return;
            }
        }
    }
}