
class Komik extends Buku {
    public Komik(String kodeBuku, String judul, String namaPengarang, int jumlahHalaman) {
        super(kodeBuku, judul, namaPengarang, jumlahHalaman);
    }

    @Override
    public double HargaBuku() {
        return getJumlahHalaman()*50;
    }
    
    @Override
    public double HargaTotal() {
        return HargaBuku();
    }

    @Override
    public void View() {
        System.out.println("Data Komik");
        System.out.println("Kode Buku\t: "+getKodeBuku());
        System.out.println("Judul\t\t: "+getJudul());
        System.out.println("Nama Pengarang\t: "+getNamaPengarang());
        System.out.println("Jumlah Halaman\t: "+getJumlahHalaman());
        System.out.println("Harga Buku\t: "+HargaBuku());
        System.out.println("Harga Total\t: "+HargaTotal());
        System.out.println();
    }


}