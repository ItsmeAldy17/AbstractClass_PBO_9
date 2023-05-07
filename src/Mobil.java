public abstract class Mobil {
    private final String nomorKendaraan;
    private final String warna;
    private final String merk;
    private final int dayaMobil;

    {
        dayaMobil = 100;
    }

    private String jenis;


    public void getNomorKendaraan() {
        System.out.println("Nomor kendaraan : " + nomorKendaraan);
    }

    public void getWarna() {
        System.out.println("Warna Mobil : " + warna);
    }

    public void getMerk() {
        System.out.println("Merk Mobil : " + merk);
    }

    public int getDayaMobil() {
        return dayaMobil;
    }

    public void getJenis() {
        System.out.println("Jenis Mobil : " + jenis);
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public abstract void hitungSewa(int jam);

    public abstract void getHorsePower();

    public Mobil(String nomorKendaraan, String warna, String merk) {
        this.nomorKendaraan = nomorKendaraan;
        this.warna = warna;
        this.merk = merk;
    }
}
