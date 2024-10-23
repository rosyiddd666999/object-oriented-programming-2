package zakat;

public class ZakatEmas implements Zakat {
    private double totalEmas;

    public ZakatEmas(double totalEmas) {
        this.totalEmas = totalEmas;
    }

    @Override
    public double calculateZakat() {
        double nishabGold = 85; // Nishab zakat emas dalam gram
        if (totalEmas >= nishabGold) {
            return totalEmas * 0.025;
        }
        return 0;
    }
}
