class TextBook extends Buku implements HargaDiskon {
    public TextBook(String kodeBuku, String judul, String namaPengarang, int jumlahHalaman) {
        super(kodeBuku, judul, namaPengarang, jumlahHalaman);
    }

    @Override
    public double HargaBuku() {
        return getJumlahHalaman()*150;
    }
    
    @Override
    public double Diskon() {
        return HargaBuku()*0.2;
    }

    @Override
    public double HargaTotal() {
        return HargaBuku() - Diskon();
    }


    @Override
    public void View() {
        System.out.println("Data Textbook");
        System.out.println("Kode Buku\t: "+getKodeBuku());
        System.out.println("Judul\t\t: "+getJudul());
        System.out.println("Nama Pengarang\t: "+getNamaPengarang());
        System.out.println("Jumlah Halaman\t: "+getJumlahHalaman());
        System.out.println("Harga Buku\t: "+HargaBuku());
        System.out.println("Diskon\t\t: "+Diskon());
        System.out.println("Harga Total\t: "+HargaTotal());
        System.out.println();
    }
}
