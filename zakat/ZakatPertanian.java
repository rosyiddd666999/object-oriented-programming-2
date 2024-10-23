package zakat;

public class ZakatPertanian implements Zakat {
    private double hasilPanen;

    public ZakatPertanian(double hasilPanen) {
        this.hasilPanen = hasilPanen;
    }

    @Override
    public double calculateZakat() {
        double nishabAgriculture = 653; // Nishab pertanian dalam kg
        if (hasilPanen >= nishabAgriculture) {
            return hasilPanen * 0.05; // 5% hasil panen
        }
        return 0;
    }
}
