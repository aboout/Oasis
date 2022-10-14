import java.util.Scanner;

public class Main {
    private static int x = 1;

    public static void main(String[] args) {
        while (x == 1) {
            System.out.println("Запустить Kalculator_Oasis? 1-Да или 2-Нет");
            Scanner odin = new Scanner(System.in);
            int konec = odin.nextInt();
            if (konec==2) {
                break;

            }
            reshenie();
        }
    }

    public static void reshenie() {
        Scanner in = new Scanner(System.in);
        System.out.println("Хорошо, Запустить Калькулятор - 1 или Решение уравнения - 2");
        String e = in.next();

        if (e.equals("1")) {
            System.out.println("Введите 1 число");
            double cifra1 = in.nextInt();
            System.out.println("Введите 2 число");
            double cifra2 = in.nextInt();
            System.out.println("Выберите операцию:(1 - '+' ; 2 '-' ; 3- '/' ; 4 - '*')");
            String op = in.next();

            if (op.equals("1")) {
                System.out.println( summa(cifra1, cifra2));

            } else if (op.equals("2")) {
                System.out.println(raznost(cifra1, cifra2));

            } else if (op.equals("3")) {
                System.out.println(delen(cifra1, cifra2));

            } else if (op.equals("4")) {
                System.out.println(umnoj(cifra1, cifra2));

            }else {
                System.out.println("Произошол сбой в Оазисе");
            }
        } else if (e.equals("2")) {
            System.out.println("Введите коэффицент a:");
            double a = in.nextInt();

            System.out.println("Введите коэффицент b:");
            double b = in.nextInt();

            System.out.println("Введите коэффицент c:");
            double c = in.nextInt();

            System.out.println(uravnenie(a,b,c ));

        }else {
            System.out.println("Произошол сбой в Оазисе");
        }

    }

    public static double summa(double cifra1, double cifra2) {
        return cifra1 + cifra2;
    }

    public static double raznost(double cifra1, double cifra2) {
        return cifra1 - cifra2;
    }

    public static double delen(double cifra1, double cifra2) {
        return cifra1 / cifra2;
    }

    public static double umnoj(double cifra1, double cifra2) {
        return cifra1 * cifra2;
    }

    public static String uravnenie(double a, double b, double c) {
        double d = b * b - (4 * a * c);
        String korens;
        if (d > 0) {

            double x1 = ((-1) * b - Math.sqrt(d)) / (2 * a);

            double x2 = ((-1) * b + Math.sqrt(d)) / (2 * a);

            korens = ("x1 = " + x1 + "x2 = " + x2);
        } else if (d == 0) {
            double x = (-1) * b / (2 * a);
            korens = ('x' + "=" + x);
        } else {
            korens = ("Корней нету");
        }

        return korens;
    }
}
