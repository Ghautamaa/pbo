package source;

class TextBook extends Buku implements HargaDiskon {
    public TextBook(String kodeBuku, String judul, String namaPengarang, int jumlahHalaman) {
        super(kodeBuku, judul, namaPengarang, jumlahHalaman);
    }

    @Override
    public double hargaBuku() {
        return getJumlahHalaman()*150;
    }
    
    @Override
    public double Diskon() {
        return hargaBuku()*0.2;
    }

    @Override
    public double hargaTotal() {
        return hargaBuku() - Diskon();
    }


    @Override
    public void view() {
        System.out.println("Data Textbook");
        System.out.println("Kode Buku\t: "+getKodeBuku());
        System.out.println("Judul\t\t: "+getJudul());
        System.out.println("Nama Pengarang\t: "+getNamaPengarang());
        System.out.println("Jumlah Halaman\t: "+getJumlahHalaman());
        System.out.println("Harga Buku\t: "+hargaBuku());
        System.out.println("Diskon\t\t: "+Diskon());
        System.out.println("Harga Total\t: "+hargaTotal());
        System.out.println();
    }

    @Override
    public void viewTable() {
        System.out.printf("|%-5s|%-10s|%-20s|%-20s|%-15d|%-15.2f|%-15.2f|%-15.2f|\n", getKodeBuku(), "Textbook", getJudul(), getNamaPengarang(), getJumlahHalaman(), hargaBuku(), Diskon() , hargaTotal());
    }
}
