import java.util.ArrayList;
import java.util.Scanner;

class TokoBuku {
    private ArrayList<Buku> listBuku;
    private Scanner input = new Scanner(System.in);
    
    public TokoBuku() {
        listBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        listBuku.add(buku);
    }

    public void ubahIndex() {
        for (int index = 0; index < listBuku.size(); index++) {
            Buku buku = listBuku.get(index);
            buku.setKodeBuku(index);
        }
    }

    public  void tampilData() {
        System.out.println("=================================");
        System.out.println("            Data Buku");
        System.out.println();
        for (int i = 0; i < listBuku.size(); i++) {
            System.out.print(i + ". ");
            listBuku.get(i).view();
        }
    }

    public  void tampilDataTabel() {
        System.out.println();
        System.out.println(
                "============================================================================================================================");
        System.out.printf("|%-5s|%-10s|%-20s|%-20s|%-15s|%-15s|%-15s|%-15s|\n", "Kode", "Jenis", "Judul", "Pengarang",
                "Halaman", "Harga Buku", "Diskon", "Harga Total");
        System.out.println(
                "============================================================================================================================");
        for (int i = 0; i < listBuku.size(); i++) {
            listBuku.get(i).viewTable();
        }
        System.out.println(
                "============================================================================================================================");
    }

    public  void transaksi() {
        tampilDataTabel();
        int tanya;
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
        } while (uang <+ listBuku.get(tanya).hargaBuku());

        double kembalian = uang - listBuku.get(tanya).hargaTotal();
        System.out.println("Kembalian anda : " + kembalian + "\n");
        listBuku.remove(listBuku.get(tanya));
    }

    public  void tambahData() {
        int tanya;

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

    public  void hapusData() {
        int tanya;

        tampilDataTabel();
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

    public void cariBuku() {
        String cari;
        boolean found = false;

        System.out.print("Masukan nama buku :");
        cari = input.next();

        for (int i = 0; i < listBuku.size(); i++) {
            if (cari.equalsIgnoreCase(listBuku.get(i).getJudul())) {
                listBuku.get(i).view();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Buku tidak ditemukan");
        }
        
    }

}