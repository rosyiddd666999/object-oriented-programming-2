package zakat;

public class ZakatPerdagangan implements Zakat {
    private double totalAsetDagang;

    public ZakatPerdagangan(double totalAsetDagang) {
        this.totalAsetDagang = totalAsetDagang;
    }

    @Override
    public double calculateZakat() {
        double nishabTrade = 85250000; // Nishab zakat perdagangan
        if (totalAsetDagang >= nishabTrade) {
            return totalAsetDagang * 2.5 / 100;
        }
        return 0;
    }
}
