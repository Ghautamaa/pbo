import java.util.ArrayList;
import java.util.Scanner;

class TokoBuku {
    private ArrayList<Buku> listBuku;
    private Scanner input = new Scanner(System.in);
    
    public TokoBuku() {
        listBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku b) {
        listBuku.add(b);
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
        int index;
        do {
            System.out.println("=================================");
            System.out.print("Pilih buku yang ingin di beli : ");
            index = input.nextInt();
            if ((index < 0) || (index >= listBuku.size())) {
                System.out.println("Buku tidak ditemukan");
            }
        } while ((index < 0) || (index >= listBuku.size()));

        System.out.println("Anda akan membeli :");
        System.out.println();
        listBuku.get(index).view();

        double uang;
        do {
            System.out.print("Masukan uang : ");
            uang = input.nextDouble();
            if (uang < listBuku.get(index).hargaBuku()) {
                System.out.println("Uang anda kurang");
            }
        } while (uang <+ listBuku.get(index).hargaBuku());

        double kembalian = uang - listBuku.get(index).hargaTotal();
        System.out.println("Kembalian anda : " + kembalian + "\n");
        listBuku.remove(listBuku.get(index));
    }

    public void tambahData() {
        int tanya;
        do {
            System.out.println("=================================");
            System.out.println("Pilih jenis buku yang ingin ditambah:");
            System.out.println("1. Komik");
            System.out.println("2. Majalah");
            System.out.println("3. Textbook");
            System.out.println("=================================");
            System.out.print("Masukan Pilihan : ");
            tanya = input.nextInt();
        } while (tanya < 1 || tanya > 3);
    
        Buku buku;
        if (tanya == 1) {
            buku = new Komik(0, null, null, 0);
            System.out.println("=================================");
            System.out.println("Masukan data komik  ");
            System.out.println("=================================");
        } else if (tanya == 2) {
            buku = new Majalah(0, null, null, 0);
            System.out.println("=================================");
            System.out.println("Masukan data majalah  ");
            System.out.println("=================================");
        } else {
            buku = new TextBook(0, null, null, 0);
            System.out.println("=================================");
            System.out.println("Masukan data textbook ");
            System.out.println("=================================");
        }
    
        input.nextLine();
        System.out.print("Judul Buku : ");
        buku.setJudul(input.nextLine());
        System.out.print("Nama Pengarang : ");
        buku.setNamaPengarang(input.nextLine());
        System.out.print("Jumlah Halaman : ");
        buku.setJumlahHalaman(input.nextInt());
    
        listBuku.add(buku);
    }
    
    public  void hapusData() {
        int index;

        tampilDataTabel();
        do {
            System.out.println("=================================");
            System.out.print("Pilih buku yang akan dihapus : ");
            index = input.nextInt();
            if ((index < 0) || (index >= listBuku.size())) {
                System.out.println("Buku tidak ditemukan");
            }
        } while ((index < 0) || (index >= listBuku.size()));

        listBuku.remove(index);
    }

    public void cariBuku() {
        String cari;
        boolean found = false;

        System.out.print("Masukan judul buku : ");
        cari = input.next();
        System.out.println();

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