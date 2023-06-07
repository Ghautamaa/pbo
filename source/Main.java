package source;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static int tanya;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TextBook textBook1 = new TextBook(1, "Cara menjadi Yoga", "Yoga", 100);
        Komik komik1 = new Komik(2, "One Piece", "Eichiro Oda", 1000);
        Majalah majalah1 = new Majalah(3, "Bobo", "Bobo", 60);
        ArrayList<Buku> listBuku = new ArrayList<Buku>();

        listBuku.add(textBook1);
        listBuku.add(komik1);
        listBuku.add(majalah1);

        while (true) {
            do {
                System.out.println("=================================");
                System.out.println("Toko Buku Grandmedia");
                System.out.println("=================================");
                System.out.println("1. Data Buku");
                System.out.println("2. Transaksi");
                System.out.println("3. Tambah Data");
                System.out.println("4. Hapus Data");
                System.out.println("5. Keluar");
                System.out.println("=================================");
                System.out.print("Masukan Pilihan : ");
                tanya = input.nextInt();
            } while (tanya < 1 || tanya > 5);

            if (tanya == 1) {
                tampilDataTabel(listBuku);
            } else if (tanya == 2) {
                transaksi(listBuku);
            } else if (tanya == 3) {
                tambahData(listBuku);
            } else if (tanya == 4) {
                hapusData(listBuku);
            } else {
                System.out.println("=================================");
                System.out.println("Terima Kasih Telah Berkunjung");
                break;
            }
        }
    }

    public static void tampilData(ArrayList<Buku> listBuku) {
        System.out.println("=================================");
        System.out.println("            Data Buku");
        System.out.println();
        for (int i = 0; i < listBuku.size(); i++) {
            System.out.print(i + ". ");
            listBuku.get(i).view();
        }
    }

    public static void tampilDataTabel (ArrayList<Buku> listBuku) {
        System.out.println();
        System.out.println("============================================================================================================================");
        System.out.printf("|%-5s|%-10s|%-20s|%-20s|%-15s|%-15s|%-15s|%-15s|\n", "Kode", "Jenis", "Judul", "Pengarang", "Halaman", "Harga Buku", "Diskon" , "Harga Total");
        System.out.println("============================================================================================================================");
        for (int i = 0; i < listBuku.size() ; i++) {
            listBuku.get(i).viewTable();
        }
        System.out.println("============================================================================================================================");
    }

    public static void transaksi(ArrayList<Buku> listBuku) {
        tampilDataTabel(listBuku);
        do {
            System.out.println("=================================");
            System.out.print("Pilih buku yang ingin di beli : ");
            tanya = input.nextInt();
            if ((tanya < 0) || (tanya >= listBuku.size())) {
                System.out.println("Buku tidak ditemukan");
            }
        } while ((tanya < 0) || (tanya >= listBuku.size()));

        System.out.println("Anda akan membeli :");
        System.out.println();
        listBuku.get(tanya).view();

        double uang;
        do {
            System.out.print("Masukan uang : ");
            uang = input.nextDouble();
            if (uang < listBuku.get(tanya).hargaBuku()) {
                System.out.println("Uang anda kurang");
            }
        } while (uang < listBuku.get(tanya).hargaBuku());

        double kembalian = uang - listBuku.get(tanya).hargaTotal();
        System.out.println("Kembalian anda : " + kembalian + "\n");
        listBuku.remove(listBuku.get(tanya));
    }

    public static void tambahData(ArrayList<Buku> listBuku) {
        do {
            System.out.println("=================================");
            System.out.println("Pilih jenis buku :");
            System.out.println("1. Komik");
            System.out.println("2. Majalah");
            System.out.println("3. Textbook");
            System.out.println("=================================");
            System.out.print("Masukan Pilihan : ");
            tanya = input.nextInt();
        } while (tanya < 1 || tanya > 3);

        if (tanya == 1) {
            Komik komik = new Komik(0, null, null, 0);
            System.out.println("=================================");
            System.out.println("Masukan data komik  ");
            System.out.println("=================================");
            System.out.print("Masukan Kode Buku : ");
            komik.setKodeBuku(input.nextInt());
            input.nextLine();
            System.out.print("Judul Buku : ");
            komik.setJudul(input.nextLine());
            System.out.print("Nama Pengarang : ");
            komik.setNamaPengarang(input.nextLine());
            System.out.print("Jumlah Halaman : ");
            komik.setJumlahHalaman(input.nextInt());

            listBuku.add(komik);
        } else if (tanya == 2) {
            Majalah majalah = new Majalah(0, null, null, 0);
            System.out.println("=================================");
            System.out.println("Masukan data majalah  ");
            System.out.println("=================================");
            System.out.print("Masukan Kode Buku : ");
            majalah.setKodeBuku(input.nextInt());
            input.nextLine();
            System.out.print("Judul Buku : ");
            majalah.setJudul(input.nextLine());
            System.out.print("Nama Pengarang : ");
            majalah.setNamaPengarang(input.nextLine());
            System.out.print("Jumlah Halaman : ");
            majalah.setJumlahHalaman(input.nextInt());

            listBuku.add(majalah);
        } else {
            TextBook textbook = new TextBook(0, null, null, 0);
            System.out.println("=================================");
            System.out.println("Masukan data textbook ");
            System.out.println("=================================");
            System.out.print("Masukan Kode Buku : ");
            textbook.setKodeBuku(input.nextInt());
            input.nextLine();
            System.out.print("Judul Buku : ");
            textbook.setJudul(input.nextLine());
            System.out.print("Nama Pengarang : ");
            textbook.setNamaPengarang(input.nextLine());
            System.out.print("Jumlah Halaman : ");
            textbook.setJumlahHalaman(input.nextInt());
            listBuku.add(textbook);
        }

    }

    public static void hapusData(ArrayList<Buku> listBuku) {
        tampilDataTabel(listBuku);
        do {
            System.out.println("=================================");
            System.out.print("Pilih buku yang akan dihapus : ");
            tanya = input.nextInt();
            if ((tanya < 0) || (tanya >= listBuku.size())) {
                System.out.println("Buku tidak ditemukan");
            }
        } while ((tanya < 0) || (tanya >= listBuku.size()));

        listBuku.remove(tanya);
        
    }

}