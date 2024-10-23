package zakat;

public class ZakatPerak implements Zakat {
    private double totalPerak;

    public ZakatPerak(double totalPerak) {
        this.totalPerak = totalPerak;
    }

    @Override
    public double calculateZakat() {
        double nishabSilver = 595; // Nishab zakat perak dalam gram
        if (totalPerak >= nishabSilver) {
            return totalPerak * 0.025;
        }
        return 0;
    }
}
