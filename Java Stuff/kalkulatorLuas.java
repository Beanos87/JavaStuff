public class kalkulatorLuas {

    public int hitungLuaspersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }
    public static void main(String[] args) {
        kalkulatorLuas kalkulator = new kalkulatorLuas();

        int panjang = 50;
        int lebar = 10;

        int hasilLuas = kalkulator.hitungLuaspersegiPanjang(panjang, lebar);

        System.out.println("panjang :" + panjang);
        System.out.println("lebar :" + lebar);
        System.out.println("Luas persegi panjang :" + hasilLuas);
    }
}