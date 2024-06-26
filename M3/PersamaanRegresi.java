// public class PersamaanRegresi {
//     public static void main(String[] args) {
//         double[] x = { 1.5, 1.0, 2.0, 2.8, 0.4, 1.3 };
//         double[] y = { 3.6, 2.8, 4.3, 5.4, 1.9, 2.9 };
//         double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0, sumY2 = 0;

//         int n = x.length;

//         for (int i = 0; i < n; i++) {
//             sumX += x[i];
//             sumY += y[i];
//             sumXY += x[i] * y[i];
//             sumX2 += x[i] * x[i];
//             sumY2 += y[i] * y[i];
//         }

//         System.out.println(sumX);
//         System.out.println(sumY);
//         System.out.println(sumXY);
//         System.out.println(sumX2);
//         System.out.println(sumY2);

//         double b = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
//         double a = (sumY / n) - b * (sumX / n);
//         System.out.println(a);
//         System.out.println(b);

//         System.out.printf("a = %.2f, b = %.2f", a, b);

//         double x2 = 10;
//         double langkah4 = a + b * x2;

//         System.out.printf("%.2f\n", langkah4);

//         double kesalahanaRegresi = (sumY2 - a * sumY - b * sumXY) / (n - 2);
//         double akarKesalahan = Math.sqrt(kesalahanaRegresi);
//         System.out.printf("%.2f\n", akarKesalahan);
//     }
// }

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

        System.out.println(sumX);
        System.out.println(sumY);
        System.out.println(sumXY);
        System.out.println(sumX2);
        System.out.println(sumY2);

        double b = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double a = (sumY / n) - b * (sumX / n);
        System.out.println(a);
        System.out.println(b);

        System.out.printf("a = %f, b = %f\n", a, b);

        double x2 = 75;
        double langkah4 = a + b * x2;

        System.out.printf("langkah4: %f\n", langkah4);

        double kesalahanaRegresi = (sumY2 - a * sumY - b * sumXY) / (n - 2);
        double akarKesalahan = Math.sqrt(kesalahanaRegresi);
        System.out.printf("%f\n", akarKesalahan);
    }
}
