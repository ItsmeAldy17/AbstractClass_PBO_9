public class MobilAngkutan extends Mobil {
    private final int maximumLoad;

    public void getMaximumLoad() {
        System.out.println("Maksimum Muatan Mobil : " + maximumLoad + "Kg");
    }

    @Override
    public void hitungSewa(int jam) {
        int hargasewa = 75000 * jam;
        System.out.println("Harga Sewa Mobil : " + hargasewa);
    }

    @Override
    public void getHorsePower() {
        System.out.println("Daya Mobil : " + getDayaMobil() + "Hp");
    }

    public MobilAngkutan(String nomorKendaraan, String warna, String merk, int maksimumMuatan) {
        super(nomorKendaraan, warna, merk);
        this.maximumLoad = maksimumMuatan;
        super.setJenis("Mobil Angkutan");
    }
}