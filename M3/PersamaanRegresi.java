public class PersamaanRegresi {
    public static void main(String[] args) {
        double[] x = { 70, 60, 80, 90, 50, 65 };
        double[] y = { 175, 160, 180, 185, 155, 170 };
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0, sumY2 = 0;

        int n = x.length;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
            sumY2 += y[i] * y[i];
        }

        double b = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double a = (sumY / n) - b * (sumX / n);
        System.out.printf("a = %f, b = %f\n", a, b);

        double x2 = 75;
        double langkah4 = a + b * x2;

        System.out.printf("langkah4: %f\n", langkah4);

        double kesalahanaRegresi = (sumY2 - a * sumY - b * sumXY) / (n - 2);
        double akarKesalahan = Math.sqrt(kesalahanaRegresi);
        System.out.printf("%f\n", akarKesalahan);
    }
}
