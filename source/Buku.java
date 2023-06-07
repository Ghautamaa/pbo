package source;

abstract class Buku {
    private String judul, namaPengarang;
    private int jumlahHalaman, kodeBuku;


    public void setKodeBuku(int kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }
  
    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public Buku (int kodeBuku, String judul, String namaPengarang, int jumlahHalaman) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.namaPengarang = namaPengarang;
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    abstract public double hargaBuku ();
    abstract public double hargaTotal ();
    abstract public void view ();
    abstract public void viewTable();
}
