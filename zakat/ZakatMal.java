package zakat;

public class ZakatMal implements Zakat {
    private double totalHarta;

    public ZakatMal(double totalHarta) {
        this.totalHarta = totalHarta;
    }

    @Override
    public double calculateZakat() {
        double nishabMal = 85250000; // Contoh nishab zakat mal
        if (totalHarta >= nishabMal) {
            return totalHarta * 2.5 / 100;
        }
        return 0;
    }
}
