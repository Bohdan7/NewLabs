package lab2NumberMethods;


public class Main {

    public static double f(double z) {
        return Math.tan(z) - z;
    }

    public static double f1(double z) {
        return 2 * Math.tan(z) / (Math.cos(z) * Math.cos(z));
    }

    static double e = 0.0001;
    static double x;

    public static void main(String[] args) {
// tg(x) - x  [4;5] МД
//        оцінити її швидкодію (tω), кількість
//        циклів ітерацій (іω), значення кореня (хω) і функції в точці кореня (F(хω))
//        залежно від заданої точності ε знаходження кореня рівняння (по черзі
//        виконати розрахунки для ω, що дорівнює 10-4 , 10-5
//                , 10-6
        double a, b;
        a = 4;
        b = 5;
        int n = 0;

        if (f(a) * f1(a) < 0) {
            x = a;
        } else x = b;
        double counter = Math.abs(f1(x));
        while (counter > e) {
            x = x - (f(x) / f1(x));
            n += 1;
            counter--;
            System.out.println(counter);
        }


    }
}