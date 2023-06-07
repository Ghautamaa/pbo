package source;
class Majalah extends Buku implements HargaDiskon {

    public Majalah(String kodeBuku, String judul, String namaPengarang, int jumlahHalaman) {
        super(kodeBuku, judul, namaPengarang, jumlahHalaman);
    }

    @Override
    public double hargaBuku() {
        return getJumlahHalaman()*75;
    }

    @Override
    public double Diskon() {
        return hargaBuku()*0.1;
    }

    @Override
    public double HargaTotal() {
        return hargaBuku() - Diskon();
    }

    @Override
    public void view() {
        System.out.println("Data Majalah");
        System.out.println("Kode Buku\t: "+getKodeBuku());
        System.out.println("Judul\t\t: "+getJudul());
        System.out.println("Nama Pengarang\t: "+getNamaPengarang());
        System.out.println("Jumlah Halaman\t: "+getJumlahHalaman());
        System.out.println("Harga Buku\t: "+hargaBuku());
        System.out.println("Diskon\t\t: "+Diskon());
        System.out.println("Harga Total\t: "+HargaTotal());
        System.out.println();
    }
}