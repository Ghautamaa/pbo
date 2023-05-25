<<<<<<< HEAD

=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> dbd7ac72bd1a82ed5077ceb0c879b655dde0331a
>>>>>>> 086bf701e6e3b6d834a152efb2410b619e57a188
>>>>>>> 6f912fe1d266bec349ce22846e9c358b17fdf0f3
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static int tanya;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TextBook textBook1 = new TextBook("01", "Cara menjadi Yoga", "Yoga", 100);
        Komik komik1 = new Komik("02", "One Piece", "Eichiro Oda", 1000);
        Majalah majalah1 = new Majalah("03", "Bobo", "Bobo", 60);
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
                tampilData(listBuku);
            } else if (tanya == 2) {
                transaksi(listBuku);
            } else if (tanya == 3) {
                tambahData(listBuku);
                ;
            } else if (tanya == 4) {
                System.out.println("Terima Kasih ");
                hapusData(listBuku);
                ;
            } else {
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
            listBuku.get(i).View();
        }
    }

    public static void transaksi(ArrayList<Buku> listBuku) {
        do {
            tampilData(listBuku);
            System.out.println("=================================");
            System.out.print("Pilih buku yang ingin di beli : ");
            tanya = input.nextInt();
            if ((tanya < 0) || (tanya >= listBuku.size())) {
                System.out.println("Buku tidak ditemukan");
            }
        } while ((tanya < 0) || (tanya >= listBuku.size()));

        System.out.println("Anda akan membeli :");
        listBuku.get(tanya).View();

        double uang;
        do {
            System.out.print("Masukan uang : ");
            uang = input.nextDouble();
            if (uang < listBuku.get(tanya).HargaBuku()) {
                System.out.println("Uang anda kurang");
            }
        } while (uang < listBuku.get(tanya).HargaBuku());

        double kembalian = uang - listBuku.get(tanya).HargaTotal();
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
            Komik komik = new Komik(null, null, null, 0);
            System.out.println("=================================");
            System.out.println("Masukan data komik  ");
            System.out.println("=================================");
            System.out.print("Masukan Kode Buku : ");
            komik.setKodeBuku(input.next());
            input.nextLine();
<<<<<<< HEAD
            System.out.print("Judul Buku : ");
            komik.setJudul(input.nextLine());
            System.out.print("Nama Pengarang : ");
            komik.setNamaPengarang(input.nextLine());
            System.out.print("Jumlah Halaman : ");
=======
            System.out.println("Judul Buku : ");
            komik.setJudul(input.nextLine());
            System.out.println("Nama Pengarang : ");
            komik.setNamaPengarang(input.nextLine());
            System.out.println("Jumlah Halaman : ");
>>>>>>> 086bf701e6e3b6d834a152efb2410b619e57a188
            komik.setJumlahHalaman(input.nextInt());

            listBuku.add(komik);
        } else if (tanya == 2) {
            Majalah majalah = new Majalah(null, null, null, 0);
            System.out.println("=================================");
            System.out.println("Masukan data majalah  ");
            System.out.println("=================================");
            System.out.print("Masukan Kode Buku : ");
            majalah.setKodeBuku(input.next());
            input.nextLine();
<<<<<<< HEAD
            System.out.print("Judul Buku : ");
            majalah.setJudul(input.nextLine());
            System.out.print("Nama Pengarang : ");
            majalah.setNamaPengarang(input.nextLine());
            System.out.print("Jumlah Halaman : ");
=======
            System.out.println("Judul Buku : ");
            majalah.setJudul(input.nextLine());
            System.out.println("Nama Pengarang : ");
            majalah.setNamaPengarang(input.nextLine());
            System.out.println("Jumlah Halaman : ");
>>>>>>> 086bf701e6e3b6d834a152efb2410b619e57a188
            majalah.setJumlahHalaman(input.nextInt());

            listBuku.add(majalah);
        } else {
            TextBook textbook = new TextBook(null, null, null, 0);
            System.out.println("=================================");
            System.out.println("Masukan data textbook ");
            System.out.println("=================================");
            System.out.print("Masukan Kode Buku : ");
            textbook.setKodeBuku(input.next());
            input.nextLine();
<<<<<<< HEAD
            System.out.print("Judul Buku : ");
            textbook.setJudul(input.nextLine());
            System.out.print("Nama Pengarang : ");
            textbook.setNamaPengarang(input.nextLine());
            System.out.print("Jumlah Halaman : ");
=======
            System.out.println("Judul Buku : ");
            textbook.setJudul(input.nextLine());
            System.out.println("Nama Pengarang : ");
            textbook.setNamaPengarang(input.nextLine());
            System.out.println("Jumlah Halaman : ");
>>>>>>> 086bf701e6e3b6d834a152efb2410b619e57a188
            textbook.setJumlahHalaman(input.nextInt());
            listBuku.add(textbook);
        }

    }

    public static void hapusData(ArrayList<Buku> listBuku) {
        tampilData(listBuku);
        System.out.println("=================================");
        System.out.print("Pilih buku yang akan dihapus : ");
        tanya = input.nextInt();

        listBuku.remove(tanya);
    }

}